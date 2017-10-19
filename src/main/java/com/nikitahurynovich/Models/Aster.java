package com.nikitahurynovich.Models;

import com.nikitahurynovich.Types.ColorType;

import java.awt.*;
import java.util.*;
import java.util.List;

/**
 * Created by computer on 19.10.2017.
 */
public class Aster extends Flower {
    private static List<ColorType> colorList = Arrays.asList(ColorType.WHITE, ColorType.YELLOW, ColorType.BLUE);
    private final static String ASTER = "Aster";
    private int bulk;


    public Aster () {
        super();
        color = colorList.get(randomGenerator.nextInt(colorList.size()));
        bulk = randomGenerator.nextInt(10) + 5;
        name = ASTER;
    }


    @Override
    public int calculatePrice() {
        return freshness + steelLength + weight + smellLevel + bulk;
    }
}
