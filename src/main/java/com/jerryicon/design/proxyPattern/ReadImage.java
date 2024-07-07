package com.jerryicon.design.proxyPattern;

public class ReadImage implements Image{

    private String filename;

    public ReadImage(String filename){
        this.filename = filename;
        loadImage();
    }

    @Override
    public void display() {
        System.out.println("Displaying image: " + filename);
    }

    public void loadImage(){
        System.out.println("Loading image: " + filename);
    }


}
