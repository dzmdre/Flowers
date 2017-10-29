package com.nikitahurynovich.Service.Console;

import com.nikitahurynovich.Models.Flowers.Flower;
import com.nikitahurynovich.Models.Flowers.Rose;
import com.nikitahurynovich.Types.ColorType;

import java.util.List;

/**
 * Created by computer on 28.10.2017.
 */
public class RoseConsoleController extends AbstractFlowerConsoleController {

    private static final String SET_SPIKE_MESSAGE = "Choose spike count:";


    @Override
    public Flower flowerProcess(Flower.Builder builder) {
        super.defaultFlowerProcess(builder);
        ((Rose.Builder) builder).spikeCount(consoleHelper.parseIntAnswer(SET_SPIKE_MESSAGE));
        return builder.build();
    }

    @Override
    protected List<ColorType> getColorsForFlower() {
        return Rose.colorList;
    }
}
