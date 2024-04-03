package com.example.navigationbuttom;

public class BangunModel {
    public BangunModel(String name, int img) {
        this.name = name;
        this.img = img;
    }

    String name;

    public String getName() {
        return name;
    }

    public int getImg() {
        return img;
    }

    int img;
}