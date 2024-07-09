package com.jerryicon.design.frontControllerPattern;

public class Dispatcher {

    private HomeView homeView;

    private StudentView studentView;

    public Dispatcher(){
        homeView = new HomeView();
        studentView = new StudentView();
    }

    public void dispatch(String request){
        if(request.equalsIgnoreCase("STUDENT")){
            studentView.show();
        }else{
            homeView.show();
        }
    }
}
