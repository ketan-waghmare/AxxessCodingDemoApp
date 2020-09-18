package com.example.axxesscodingdemoapp.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class DataInfo {
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

    @SerializedName("cover")
    @Expose
    private String cover;

    @SerializedName("cover_width")
    @Expose
    private Integer cover_width;

    @SerializedName("cover_height")
    @Expose
    private Integer cover_height;

    @SerializedName("account_url")
    @Expose
    private String account_url;

    @SerializedName("account_id")
    @Expose
    private Integer account_id;

    @SerializedName("privacy")
    @Expose
    private String privacy;

    @SerializedName("layout")
    @Expose
    private String layout;

    @SerializedName("views")
    @Expose
    private Integer views;

    @SerializedName("link")
    @Expose
    private String link;

    @SerializedName("ups")
    @Expose
    private Integer ups;

    @SerializedName("downs")
    @Expose
    private Integer downs;

    @SerializedName("points")
    @Expose
    private Integer points;

    @SerializedName("score")
    @Expose
    private Integer score;

    @SerializedName("is_album")
    @Expose
    private Boolean is_album;

    @SerializedName("vote")
    @Expose
    private String vote;

    @SerializedName("favorite")
    @Expose
    private Boolean favorite;

    @SerializedName("nsfw")
    @Expose
    private Boolean nsfw;

    @SerializedName("section")
    @Expose
    private String section;

    @SerializedName("comment_count")
    @Expose
    private Integer comment_count;

    @SerializedName("favorite_count")
    @Expose
    private Integer favorite_count;

    @SerializedName("topic")
    @Expose
    private String topic;

    @SerializedName("topic_id")
    @Expose
    private Integer topic_id;

    @SerializedName("images_count")
    @Expose
    private Integer images_count;

    @SerializedName("in_gallery")
    @Expose
    private Boolean in_gallery;

    @SerializedName("is_ad")
    @Expose
    private Boolean is_ad;

    @SerializedName("tags")
    @Expose
    private List<TagsInfo> tags;

    @SerializedName("ad_type")
    @Expose
    private Integer ad_type;


    @SerializedName("ad_url")
    @Expose
    private String ad_url;


    @SerializedName("in_most_viral")
    @Expose
    private Boolean in_most_viral;


    @SerializedName("include_album_ads")
    @Expose
    private Boolean include_album_ads;


    @SerializedName("images")
    @Expose
    private List<ImagesInfo> images;


    @SerializedName("ad_config")
    @Expose
    private AddConfigClass ad_config;

    @SerializedName("success")
    @Expose
    private Boolean found;

    @SerializedName("status")
    @Expose
    private Integer status;

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

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public Integer getCover_width() {
        return cover_width;
    }

    public void setCover_width(Integer cover_width) {
        this.cover_width = cover_width;
    }

    public Integer getCover_height() {
        return cover_height;
    }

    public void setCover_height(Integer cover_height) {
        this.cover_height = cover_height;
    }

    public String getAccount_url() {
        return account_url;
    }

    public void setAccount_url(String account_url) {
        this.account_url = account_url;
    }

    public Integer getAccount_id() {
        return account_id;
    }

    public void setAccount_id(Integer account_id) {
        this.account_id = account_id;
    }

    public String getPrivacy() {
        return privacy;
    }

    public void setPrivacy(String privacy) {
        this.privacy = privacy;
    }

    public String getLayout() {
        return layout;
    }

    public void setLayout(String layout) {
        this.layout = layout;
    }

    public Integer getViews() {
        return views;
    }

    public void setViews(Integer views) {
        this.views = views;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public Integer getUps() {
        return ups;
    }

    public void setUps(Integer ups) {
        this.ups = ups;
    }

    public Integer getDowns() {
        return downs;
    }

    public void setDowns(Integer downs) {
        this.downs = downs;
    }

    public Integer getPoints() {
        return points;
    }

    public void setPoints(Integer points) {
        this.points = points;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public Boolean getIs_album() {
        return is_album;
    }

    public void setIs_album(Boolean is_album) {
        this.is_album = is_album;
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

    public Boolean getNsfw() {
        return nsfw;
    }

    public void setNsfw(Boolean nsfw) {
        this.nsfw = nsfw;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public Integer getComment_count() {
        return comment_count;
    }

    public void setComment_count(Integer comment_count) {
        this.comment_count = comment_count;
    }

    public Integer getFavorite_count() {
        return favorite_count;
    }

    public void setFavorite_count(Integer favorite_count) {
        this.favorite_count = favorite_count;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public Integer getTopic_id() {
        return topic_id;
    }

    public void setTopic_id(Integer topic_id) {
        this.topic_id = topic_id;
    }

    public Integer getImages_count() {
        return images_count;
    }

    public void setImages_count(Integer images_count) {
        this.images_count = images_count;
    }

    public Boolean getIn_gallery() {
        return in_gallery;
    }

    public void setIn_gallery(Boolean in_gallery) {
        this.in_gallery = in_gallery;
    }

    public Boolean getIs_ad() {
        return is_ad;
    }

    public void setIs_ad(Boolean is_ad) {
        this.is_ad = is_ad;
    }

    public List<TagsInfo> getTags() {
        return tags;
    }

    public void setTags(List<TagsInfo> tags) {
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

    public Boolean getIn_most_viral() {
        return in_most_viral;
    }

    public void setIn_most_viral(Boolean in_most_viral) {
        this.in_most_viral = in_most_viral;
    }

    public Boolean getInclude_album_ads() {
        return include_album_ads;
    }

    public void setInclude_album_ads(Boolean include_album_ads) {
        this.include_album_ads = include_album_ads;
    }

    public List<ImagesInfo> getImages() {
        return images;
    }

    public void setImages(List<ImagesInfo> images) {
        this.images = images;
    }

    public AddConfigClass getAd_config() {
        return ad_config;
    }

    public void setAd_config(AddConfigClass ad_config) {
        this.ad_config = ad_config;
    }

    public Boolean getFound() {
        return found;
    }

    public void setFound(Boolean found) {
        this.found = found;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}
