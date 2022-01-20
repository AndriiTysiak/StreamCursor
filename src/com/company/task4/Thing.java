package com.company.task4;

public class Thing {
    String name;
    boolean isFragile;

    public Thing(String name, boolean isFragile) {
        this.name = name;
        this.isFragile = isFragile;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isFragile() {
        return isFragile;
    }

    public void setFragile(boolean fragile) {
        isFragile = fragile;
    }

    @Override
    public String toString() {
        return "Thing{" +
                "name='" + name + '\'' +
                ", isFragile=" + isFragile +
                '}';
    }
}
