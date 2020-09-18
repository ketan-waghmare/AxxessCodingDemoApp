package com.example.axxesscodingdemoapp.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class TagsInfo {

    @SerializedName("name")
    @Expose
    private String name;

    @SerializedName("display_name")
    @Expose
    private String display_name;

    @SerializedName("followers")
    @Expose
    private Integer followers;

    @SerializedName("total_items")
    @Expose
    private Integer total_items;

    @SerializedName("following")
    @Expose
    private Boolean following;

    @SerializedName("is_whitelisted")
    @Expose
    private Boolean is_whitelisted;

    @SerializedName("background_hash")
    @Expose
    private String background_hash;

    @SerializedName("thumbnail_hash")
    @Expose
    private String thumbnail_hash;

    @SerializedName("accent")
    @Expose
    private String accent;

    @SerializedName("background_is_animated")
    @Expose
    private Boolean background_is_animated;

    @SerializedName("thumbnail_is_animated")
    @Expose
    private Boolean thumbnail_is_animated;

    @SerializedName("is_promoted")
    @Expose
    private Boolean is_promoted;

    @SerializedName("description")
    @Expose
    private String description;

    @SerializedName("logo_hash")
    @Expose
    private String logo_hash;

    @SerializedName("logo_destination_url")
    @Expose
    private String logo_destination_url;

    @SerializedName("description_annotations")
    @Expose
    private Object description_annotations;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDisplay_name() {
        return display_name;
    }

    public void setDisplay_name(String display_name) {
        this.display_name = display_name;
    }

    public Integer getFollowers() {
        return followers;
    }

    public void setFollowers(Integer followers) {
        this.followers = followers;
    }

    public Integer getTotal_items() {
        return total_items;
    }

    public void setTotal_items(Integer total_items) {
        this.total_items = total_items;
    }

    public Boolean getFollowing() {
        return following;
    }

    public void setFollowing(Boolean following) {
        this.following = following;
    }

    public Boolean getIs_whitelisted() {
        return is_whitelisted;
    }

    public void setIs_whitelisted(Boolean is_whitelisted) {
        this.is_whitelisted = is_whitelisted;
    }

    public String getBackground_hash() {
        return background_hash;
    }

    public void setBackground_hash(String background_hash) {
        this.background_hash = background_hash;
    }

    public String getThumbnail_hash() {
        return thumbnail_hash;
    }

    public void setThumbnail_hash(String thumbnail_hash) {
        this.thumbnail_hash = thumbnail_hash;
    }

    public String getAccent() {
        return accent;
    }

    public void setAccent(String accent) {
        this.accent = accent;
    }

    public Boolean getBackground_is_animated() {
        return background_is_animated;
    }

    public void setBackground_is_animated(Boolean background_is_animated) {
        this.background_is_animated = background_is_animated;
    }

    public Boolean getThumbnail_is_animated() {
        return thumbnail_is_animated;
    }

    public void setThumbnail_is_animated(Boolean thumbnail_is_animated) {
        this.thumbnail_is_animated = thumbnail_is_animated;
    }

    public Boolean getIs_promoted() {
        return is_promoted;
    }

    public void setIs_promoted(Boolean is_promoted) {
        this.is_promoted = is_promoted;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLogo_hash() {
        return logo_hash;
    }

    public void setLogo_hash(String logo_hash) {
        this.logo_hash = logo_hash;
    }

    public String getLogo_destination_url() {
        return logo_destination_url;
    }

    public void setLogo_destination_url(String logo_destination_url) {
        this.logo_destination_url = logo_destination_url;
    }

    public Object getDescription_annotations() {
        return description_annotations;
    }

    public void setDescription_annotations(Object description_annotations) {
        this.description_annotations = description_annotations;
    }
}
