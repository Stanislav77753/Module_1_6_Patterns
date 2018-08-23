package com.stanislav.patterns.creational.prototype;

public class Tshirt implements Copyable {
    private int size;
    private String color;

    public Tshirt(int size, String color){
        this.size = size;
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSize() {

        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public Object copy() {
        return new Tshirt(size, color);
    }

    @Override
    public String toString() {
        return "Tshirt{" +
                "size=" + size +
                ", color='" + color + '\'' +
                '}';
    }
}
