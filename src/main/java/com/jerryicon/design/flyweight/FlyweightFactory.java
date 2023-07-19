package com.jerryicon.design.flyweight;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @author JerryIcon
 * @date 2023/7/19 8:47
 */
public class FlyweightFactory {

    private HashMap<String, Flyweight> map = new HashMap<>();

    Flyweight getFlyweight(String intrinsicState){
        if(!map.containsKey(intrinsicState)){
            Flyweight flyweight = new ConcreateFlyweight(intrinsicState);
            map.put(intrinsicState,flyweight);
        }
        return map.get(intrinsicState);
    }
}
