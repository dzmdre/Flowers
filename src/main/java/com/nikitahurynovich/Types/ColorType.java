package com.nikitahurynovich.Types;

/**
 * Created by computer on 19.10.2017.
 */
public enum ColorType {
    GREEN("green"), YELLOW("yellow"), BLUE("blue"), ORANGE("orange"), RED("red"), VIOLET("violet"), WHITE("white");


    private String color;

    ColorType(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return color;
    }
}
