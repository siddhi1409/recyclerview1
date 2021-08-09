package com.example.recyclerview1;

public class MainModel {
    Integer pics;
    String name;

    public MainModel(Integer pics, String name)
    {
        this.name = name;
        this.pics = pics;
    }

    public Integer getPics(){
        return pics;
    }

    public String getName(){
        return name;
    }


}
