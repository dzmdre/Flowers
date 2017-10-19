package com.nikitahurynovich.Models;

import com.nikitahurynovich.Types.ColorType;

import java.awt.*;
import java.util.*;
import java.util.List;

/**
 * Created by computer on 19.10.2017.
 */
public class Rose extends Flower {

    private static List<ColorType> colorList = Arrays.asList(ColorType.WHITE, ColorType.RED, ColorType.YELLOW);
    private final static String ROSE = "Rose";
    private int spikeCount;

    public Rose() {
        super();
        spikeCount = randomGenerator.nextInt(10) + 5;
        name = ROSE;
        color = colorList.get(randomGenerator.nextInt(colorList.size()));
    }

    @Override
    public int calculatePrice() {
        return freshness + steelLength + weight + smellLevel - spikeCount;
    }


    public int getSpikeCount() {
        return spikeCount;
    }

    public void setSpikeCount(int spikeCount) {
        this.spikeCount = spikeCount;
    }

}
