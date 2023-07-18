package com.jerryicon.design.prototype;

/**
 * @author JerryIcon
 * @date 2023/7/18 17:46
 */
public class Client {

    private Prototype prototype;

    public Client(Prototype prototype){
        this.prototype = prototype;
    }

    public void operation(){
        //会需要创建原型接口的对象
        Prototype newPrototype = prototype.clone();
    }

}
