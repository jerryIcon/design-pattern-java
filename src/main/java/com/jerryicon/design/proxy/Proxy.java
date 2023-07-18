package com.jerryicon.design.proxy;

public class Proxy implements Image{

    private final HighResolutionImage highResolutionImage;

    public Proxy(HighResolutionImage highResolutionImage){
        this.highResolutionImage = highResolutionImage;
    }

    @Override
    public void showImage() {
        while (!highResolutionImage.isLoad()){
            try {
                System.out.println("Temp Image: " + highResolutionImage.getWidth() + " " + highResolutionImage.getHeight());
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        highResolutionImage.showImage();
    }
}
