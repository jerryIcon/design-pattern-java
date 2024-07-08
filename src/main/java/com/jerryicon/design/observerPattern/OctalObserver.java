package com.jerryicon.design.observerPattern;

/**
 * @author JerryIcon
 * @date 2024/7/8 下午5:10
 */
public class OctalObserver extends Observer{

    public OctalObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println( "Octal String: "
                + Integer.toOctalString( subject.getState() ) );
    }
}
