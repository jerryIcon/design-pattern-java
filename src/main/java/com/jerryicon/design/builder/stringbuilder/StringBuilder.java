package com.jerryicon.design.builder.stringbuilder;

/**
 * @author JerryIcon
 * @date 2023/7/13 19:54
 */
public class StringBuilder extends AbstractStringBuilder{
    public StringBuilder() {
        super(16);
    }

    @Override
    public String toString() {
        return new String(value, 0, count);
    }
}
