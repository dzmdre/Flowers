package com.nikitahurynovich.Models;

import com.nikitahurynovich.Types.ColorType;

import java.util.Arrays;
import java.util.List;

/**
 * Created by computer on 19.10.2017.
 */
public class Hyacinth extends Flower {
    private static List<ColorType> colorList = Arrays.asList(ColorType.WHITE, ColorType.RED, ColorType.YELLOW, ColorType.VIOLET);
    private final static String Hyacinth = "Hyacinth";
    private int headLength;

    public Hyacinth() {
        super();
        headLength = randomGenerator.nextInt(10) + 5;
        name = Hyacinth;
        color = colorList.get(randomGenerator.nextInt(colorList.size()));
    }

    @Override
    public int calculatePrice() {
        return freshness + steelLength + weight - smellLevel + headLength;
    }


    public int getHeadLength() {
        return headLength;
    }

    public void setHeadLength(int headLength) {
        this.headLength = headLength;
    }
}
