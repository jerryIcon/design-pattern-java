package com.jerryicon.design.builder.stringbuilder;

import java.util.Arrays;

/**
 * @author JerryIcon
 * @date 2023/7/13 19:47
 */
public class AbstractStringBuilder {

    /**
     * 存储值
     */
    protected char[] value;

    /**
     * char[] 数据长度计数器
     */
    protected int count;

    public AbstractStringBuilder(int capacity){
        count = 0;
        value = new char[capacity];
    }

    public AbstractStringBuilder append(char c){
        ensureCapacityInternal(count + 1);
        value[count++] = c;
        return this;
    }

    public void ensureCapacityInternal(int minimumCapacity){
        if(minimumCapacity - value.length > 0){
            expandCapacity(minimumCapacity);
        }
    }

    public void expandCapacity(int minimumCapacity){
        int newCapacity = count * 2 + 2;
        if(newCapacity - minimumCapacity < 0){
            newCapacity = minimumCapacity;
        }
        if(newCapacity < 0){
            if(minimumCapacity < 0){
                throw new OutOfMemoryError();
            }
            newCapacity = Integer.MAX_VALUE;
        }
        value = Arrays.copyOf(value,newCapacity);
    }
}
