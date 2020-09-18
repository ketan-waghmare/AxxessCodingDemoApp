package com.example.axxesscodingdemoapp.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ImagesInfo {

    @SerializedName("id")
    @Expose
    private String id;

    @SerializedName("title")
    @Expose
    private String title;

    @SerializedName("description")
    @Expose
    private String description;

    @SerializedName("datetime")
    @Expose
    private Integer datetime;

    @SerializedName("type")
    @Expose
    private String type;

    @SerializedName("animated")
    @Expose
    private Boolean animated;

    @SerializedName("width")
    @Expose
    private Integer width;

    @SerializedName("height")
    @Expose
    private Integer height;

    @SerializedName("size")
    @Expose
    private Integer size;

    @SerializedName("views")
    @Expose
    private Integer views;

    @SerializedName("bandwidth")
    @Expose
    private Double bandwidth;

    @SerializedName("vote")
    @Expose
    private String vote;

    @SerializedName("favorite")
    @Expose
    private Boolean favorite;

    @SerializedName("nsfw")
    @Expose
    private String nsfw;

    @SerializedName("section")
    @Expose
    private String section;

    @SerializedName("account_url")
    @Expose
    private String account_url;

    @SerializedName("account_id")
    @Expose
    private String account_id;

    @SerializedName("is_ad")
    @Expose
    private Boolean is_ad;

    @SerializedName("in_most_viral")
    @Expose
    private Boolean in_most_viral;

    @SerializedName("has_sound")
    @Expose
    private Boolean has_sound;

    @SerializedName("tags")
    @Expose
    private List<String> tags;

    @SerializedName("ad_type")
    @Expose
    private Integer ad_type;

    @SerializedName("ad_url")
    @Expose
    private String ad_url;

    @SerializedName("edited")
    @Expose
    private Integer edited;

    @SerializedName("in_gallery")
    @Expose
    private Boolean in_gallery;

    @SerializedName("link")
    @Expose
    private String link;

    @SerializedName("comment_count")
    @Expose
    private String comment_count;

    @SerializedName("favorite_count")
    @Expose
    private String favorite_count;

    @SerializedName("ups")
    @Expose
    private String ups;

    @SerializedName("downs")
    @Expose
    private String downs;

    @SerializedName("points")
    @Expose
    private String points;

    @SerializedName("score")
    @Expose
    private String score;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getDatetime() {
        return datetime;
    }

    public void setDatetime(Integer datetime) {
        this.datetime = datetime;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Boolean getAnimated() {
        return animated;
    }

    public void setAnimated(Boolean animated) {
        this.animated = animated;
    }

    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public Integer getViews() {
        return views;
    }

    public void setViews(Integer views) {
        this.views = views;
    }

    public Double getBandwidth() {
        return bandwidth;
    }

    public void setBandwidth(Double bandwidth) {
        this.bandwidth = bandwidth;
    }

    public String getVote() {
        return vote;
    }

    public void setVote(String vote) {
        this.vote = vote;
    }

    public Boolean getFavorite() {
        return favorite;
    }

    public void setFavorite(Boolean favorite) {
        this.favorite = favorite;
    }

    public String getNsfw() {
        return nsfw;
    }

    public void setNsfw(String nsfw) {
        this.nsfw = nsfw;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public String getAccount_url() {
        return account_url;
    }

    public void setAccount_url(String account_url) {
        this.account_url = account_url;
    }

    public String getAccount_id() {
        return account_id;
    }

    public void setAccount_id(String account_id) {
        this.account_id = account_id;
    }

    public Boolean getIs_ad() {
        return is_ad;
    }

    public void setIs_ad(Boolean is_ad) {
        this.is_ad = is_ad;
    }

    public Boolean getIn_most_viral() {
        return in_most_viral;
    }

    public void setIn_most_viral(Boolean in_most_viral) {
        this.in_most_viral = in_most_viral;
    }

    public Boolean getHas_sound() {
        return has_sound;
    }

    public void setHas_sound(Boolean has_sound) {
        this.has_sound = has_sound;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public Integer getAd_type() {
        return ad_type;
    }

    public void setAd_type(Integer ad_type) {
        this.ad_type = ad_type;
    }

    public String getAd_url() {
        return ad_url;
    }

    public void setAd_url(String ad_url) {
        this.ad_url = ad_url;
    }

    public Integer getEdited() {
        return edited;
    }

    public void setEdited(Integer edited) {
        this.edited = edited;
    }

    public Boolean getIn_gallery() {
        return in_gallery;
    }

    public void setIn_gallery(Boolean in_gallery) {
        this.in_gallery = in_gallery;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getComment_count() {
        return comment_count;
    }

    public void setComment_count(String comment_count) {
        this.comment_count = comment_count;
    }

    public String getFavorite_count() {
        return favorite_count;
    }

    public void setFavorite_count(String favorite_count) {
        this.favorite_count = favorite_count;
    }

    public String getUps() {
        return ups;
    }

    public void setUps(String ups) {
        this.ups = ups;
    }

    public String getDowns() {
        return downs;
    }

    public void setDowns(String downs) {
        this.downs = downs;
    }

    public String getPoints() {
        return points;
    }

    public void setPoints(String points) {
        this.points = points;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }
}
