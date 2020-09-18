package com.example.axxesscodingdemoapp.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class AddConfigClass {

    @SerializedName("safeFlags")
    @Expose
    private List<String> safeFlags;

    @SerializedName("highRiskFlags")
    @Expose
    private List<String> highRiskFlags;

    @SerializedName("unsafeFlags")
    @Expose
    private List<String> unsafeFlags;

    @SerializedName("wallUnsafeFlags")
    @Expose
    private List<String> wallUnsafeFlags;

    @SerializedName("showsAds")
    @Expose
    private Boolean showsAds;


    public List<String> getSafeFlags() {
        return safeFlags;
    }

    public void setSafeFlags(List<String> safeFlags) {
        this.safeFlags = safeFlags;
    }

    public List<String> getHighRiskFlags() {
        return highRiskFlags;
    }

    public void setHighRiskFlags(List<String> highRiskFlags) {
        this.highRiskFlags = highRiskFlags;
    }

    public List<String> getUnsafeFlags() {
        return unsafeFlags;
    }

    public void setUnsafeFlags(List<String> unsafeFlags) {
        this.unsafeFlags = unsafeFlags;
    }

    public List<String> getWallUnsafeFlags() {
        return wallUnsafeFlags;
    }

    public void setWallUnsafeFlags(List<String> wallUnsafeFlags) {
        this.wallUnsafeFlags = wallUnsafeFlags;
    }

    public Boolean getShowsAds() {
        return showsAds;
    }

    public void setShowsAds(Boolean showsAds) {
        this.showsAds = showsAds;
    }
}
