package com.jerryicon.design.proxyPattern;

public class ProxyImage implements Image{

    private ReadImage readImage;

    private String filename;

    public ProxyImage(String filename){
        this.filename = filename;
    }

    @Override
    public void display() {
        if(readImage == null){
            readImage = new ReadImage(filename);
        }
        readImage.display();
    }
}
