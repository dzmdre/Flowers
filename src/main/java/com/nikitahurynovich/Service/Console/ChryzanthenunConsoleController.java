package com.nikitahurynovich.Service.Console;

import com.nikitahurynovich.Models.Flowers.Chryzanthenun;
import com.nikitahurynovich.Models.Flowers.Flower;
import com.nikitahurynovich.Types.ColorType;

import java.util.List;


public class ChryzanthenunConsoleController extends AbstractFlowerConsoleController {

    private static final String SET_HEAD_COUNT = "Choose count of head for chryzanthenun:";


    @Override
    public Flower flowerProcess(Flower.Builder builder) {
        super.defaultFlowerProcess(builder);
        ((Chryzanthenun.Builder) builder).countOfHeads(consoleHelper.parseIntAnswer(SET_HEAD_COUNT));
        return builder.build();
    }

    @Override
    protected List<ColorType> getColorsForFlower() {
        return Chryzanthenun.colorList;
    }
}