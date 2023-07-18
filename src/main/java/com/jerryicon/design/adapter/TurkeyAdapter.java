package com.jerryicon.design.adapter;

/**
 * @author JerryIcon
 * @date 2023/7/18 18:58
 */
public class TurkeyAdapter implements Duck{

    private Turkey turkey;

    public TurkeyAdapter(Turkey turkey){
        this.turkey = turkey;
    }

    @Override
    public void quack() {
        turkey.gobble();
    }
}
