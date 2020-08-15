package com.souqshag.souqsohage.pojo;

public class ModelCatogrey {
    private int Image;
    private String name;

    public ModelCatogrey(int image, String name) {
        Image = image;
        this.name = name;
    }

    public ModelCatogrey() {
    }

    public int getImage() {
        return Image;
    }

    public void setImage(int image) {
        Image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
