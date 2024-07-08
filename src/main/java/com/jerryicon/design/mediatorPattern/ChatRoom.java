package com.jerryicon.design.mediatorPattern;

import java.util.Date;

/**
 * @author JerryIcon
 * @date 2024/7/8 下午4:38
 */
public class ChatRoom {

    public static void showMessage(User user, String message){
        System.out.println(new Date().toString() + " [" + user.getName() + "] : " + message);
    }

}
