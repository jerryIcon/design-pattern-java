package com.jerryicon.design.prototypePattern;

/**
 * @author JerryIcon
 * @date 2024/7/4 下午2:15
 */
public abstract class Shape implements Cloneable {

    private String id;

    protected String type;

    public String getType() {
        return type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public abstract void draw();

    @Override
    public Shape clone() {
        try {
            return (Shape) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

}
