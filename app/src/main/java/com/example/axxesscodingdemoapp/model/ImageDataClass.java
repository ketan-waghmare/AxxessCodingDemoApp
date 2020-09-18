package com.example.axxesscodingdemoapp.model;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ImageDataClass {

        @SerializedName("data")
        @Expose
        private List<DataInfo> data;

        @SerializedName("success")
        @Expose
        private Boolean success;

        @SerializedName("status")
        @Expose
        private Integer status;

        public List<DataInfo> getData() {
                return data;
        }

        public void setData(List<DataInfo> data) {
                this.data = data;
        }

        public Boolean getSuccess() {
                return success;
        }

        public void setSuccess(Boolean success) {
                this.success = success;
        }

        public Integer getStatus() {
                return status;
        }

        public void setStatus(Integer status) {
                this.status = status;
        }
}
