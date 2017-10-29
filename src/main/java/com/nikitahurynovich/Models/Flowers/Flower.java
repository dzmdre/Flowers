package com.nikitahurynovich.Models.Flowers;

import com.nikitahurynovich.Types.ColorType;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import java.util.Random;

/**
 * Created by computer on 19.10.2017.
 */

@XmlAccessorType(XmlAccessType.FIELD)
public abstract class Flower {

    @XmlElement
    protected int steelLength;
    @XmlElement
    protected int freshness;
    @XmlElement
    protected int weight;
    @XmlElement
    protected ColorType color;
    @XmlElement
    protected int smellLevel;
    @XmlElement
    protected String name;
    @XmlElement
    protected int price;
    protected static Random randomGenerator = new Random();

    protected Flower() {
        freshness = randomGenerator.nextInt(10) + 5;
        steelLength = randomGenerator.nextInt(10) + 5;
        weight = randomGenerator.nextInt(10) + 1;
        smellLevel = randomGenerator.nextInt(10) + 1;
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


    public abstract class Builder {

        public Builder weigth(int weight) {
            Flower.this.weight = weight;
            return this;
        }
        public Builder steelLength(int steelLength) {
            Flower.this.steelLength = steelLength;
            return this;
        }

        public Builder freshness(int freshness) {
            Flower.this.freshness = freshness;
            return this;
        }

        public Builder color(ColorType color) {
            Flower.this.color = color;
            return this;
        }

        public Builder smellLevel(int smellLevel) {
            Flower.this.smellLevel = smellLevel;
            return this;
        }

        public Builder name(String name) {
            Flower.this.name = name;
            return this;
        }

        public abstract Flower build();

    }
}
