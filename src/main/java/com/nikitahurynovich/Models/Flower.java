package com.nikitahurynovich.Models;

import com.nikitahurynovich.Types.ColorType;

import java.awt.*;
import java.util.Random;

/**
 * Created by computer on 19.10.2017.
 */
public abstract class Flower {
    protected int steelLength;
    protected int freshness;
    protected int weight;
    protected ColorType color;
    protected int smellLevel;
    protected String name;
    protected int price;
    protected static Random randomGenerator = new Random();

    protected Flower() {
        freshness = randomGenerator.nextInt(10) + 5;
        steelLength = randomGenerator.nextInt(10) + 5;
        weight = randomGenerator.nextInt(10) + 1;
        smellLevel = randomGenerator.nextInt(10) + 1;
        price = calculatePrice();
    }


    public abstract int calculatePrice();

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getSteelLength() {
        return steelLength;
    }

    public void setSteelLength(int steelLength) {
        this.steelLength = steelLength;
    }

    public int getFreshness() {
        return freshness;
    }

    public void setFreshness(int freshness) {
        this.freshness = freshness;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public ColorType getColor() {
        return color;
    }

    public void setColor(ColorType color) {
        this.color = color;
    }

    public int getSmellLevel() {
        return smellLevel;
    }

    public void setSmellLevel(int smellLevel) {
        this.smellLevel = smellLevel;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return "[" + name + ", color=" + color.toString() + ", price=" + price + ", weight=" + weight +"]";

    }
}
