package com.nikitahurynovich.Models;

import com.nikitahurynovich.Types.ColorType;

import java.util.Arrays;
import java.util.List;

/**
 * Created by computer on 19.10.2017.
 */
public class Chryzanthenun extends Flower {

    private static List<ColorType> colorList = Arrays.asList(ColorType.WHITE, ColorType.YELLOW);
    private final static String ASTER = "Chryzanthenun";
    private int countOfHeads;


    public Chryzanthenun () {
        super();
        color = colorList.get(randomGenerator.nextInt(colorList.size()));
        countOfHeads = randomGenerator.nextInt(10) + 5;
        name = ASTER;
    }


    @Override
    public int calculatePrice() {
        return price = freshness + steelLength + weight - smellLevel + countOfHeads;
    }
}
