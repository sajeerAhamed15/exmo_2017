package com.exmo.exmo_test1.Entities;

import com.google.firebase.database.Exclude;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Inzimam on 4/12/2017.
 */
public class Events {
    String department;
    String title;
    Integer time;
    String description;
    String imageUrl;
    Double lat;
    Double lang;
    Integer floor;
    Integer day;
    int rate;
    int numRate;

    public Events() {
    }

    public Events(String department, String title, Integer time, String description, String imageUrl, Double lat, Double lang, Integer floor, Integer day,int rate,int numRate) {
        this.department = department;
        this.title = title;
        this.time = time;
        this.description = description;
        this.imageUrl = imageUrl;
        this.lat = lat;
        this.lang = lang;
        this.floor = floor;
        this.day = day;
        this.rate=rate;
        this.numRate=numRate;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getTime() {
        return time;
    }

    public void setTime(Integer time) {
        this.time = time;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public Double getLat() {
        return lat;
    }

    public void setLat(Double lat) {
        this.lat = lat;
    }

    public Double getLang() {
        return lang;
    }

    public void setLang(Double lang) {
        this.lang = lang;
    }

    public Integer getFloor() {
        return floor;
    }

    public void setFloor(Integer floor) {
        this.floor = floor;
    }

    public Integer getDay() {
        return day;
    }

    public void setDay(Integer day) {
        this.day = day;
    }

    public int getNumRate() {
        return numRate;
    }

    public void setNumRate(int numRate) {
        this.numRate = numRate;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    @Exclude
    public Map<String, Object> toMap() {
        HashMap<String, Object> result = new HashMap<>();
        result.put("department", department);
        result.put("title", title);
        result.put("time",time);
        result.put("day",day);
        result.put("lat",lat);
        result.put("lang",lang);
        result.put("floor",floor);
        result.put("imageUrl",imageUrl);
        result.put("description",description);
        return result;
    }
}
