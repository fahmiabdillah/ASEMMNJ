package com.example.asem.api.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
public class AsetApproveModel {


    @SerializedName("status")
    @Expose
    private Boolean status;
    @SerializedName("message")
    @Expose
    private String message;
    @SerializedName("data")
    @Expose
    private Data2 data;

    public Data2 getData() {
        return data;
    }

    public void setData(Data2 data) {
        this.data = data;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }


}