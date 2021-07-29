package com.example.models;

public class MyModel {
    String  appName;
    int appDownloads;
    int appRatings;

    public MyModel(){

    }
    public MyModel(String appName,int appDownloads,int appRatings){
        this.appName=appName;
        this.appDownloads=appDownloads;
        this.appRatings=appRatings;
    }

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public int getAppDownloads() {
        return appDownloads;
    }

    public void setAppDownloads(int appDownloads) {
        this.appDownloads = appDownloads;
    }

    public int getAppRatings() {
        return appRatings;
    }

    public void setAppRatings(int appRatings) {
        this.appRatings = appRatings;
    }
}
