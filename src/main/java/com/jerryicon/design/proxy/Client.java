package com.jerryicon.design.proxy;

import java.net.MalformedURLException;
import java.net.URL;

public class Client {
    public static void main(String[] args) throws MalformedURLException {
        URL url = new URL("http://image.jpg/");
        HighResolutionImage highResolutionImage = new HighResolutionImage(url);
        Proxy proxy = new Proxy(highResolutionImage);
        proxy.showImage();
    }
}
