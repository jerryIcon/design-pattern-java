package com.jerryicon.design.mediatorPattern;

/**
 * @author JerryIcon
 * @date 2024/7/8 下午4:38
 */
public class User {

    private String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void sendMessage(String message){
        ChatRoom.showMessage(this, message);
    }

}
