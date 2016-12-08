package com.example.arifhasnat.swiperecycler;

/**
 * Created by Arif hasnat on 3/25/2016.
 */
public class ItemData {

    private String title;
    private int imageUrl;

    public ItemData(int imageUrl, String title) {
        this.imageUrl = imageUrl;
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(int imageUrl) {
        this.imageUrl = imageUrl;
    }
}
