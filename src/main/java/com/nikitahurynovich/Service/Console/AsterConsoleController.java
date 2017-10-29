package com.nikitahurynovich.Service.Console;

import com.nikitahurynovich.Models.Flowers.Aster;
import com.nikitahurynovich.Models.Flowers.Flower;
import com.nikitahurynovich.Types.ColorType;

import java.util.List;

/**
 * Created by computer on 28.10.2017.
 */

public class AsterConsoleController extends AbstractFlowerConsoleController {

    private static final String SET_BULK_MESSAGE = "Choose bulk (number):";


    @Override
    public Flower flowerProcess(Flower.Builder builder) {
        super.defaultFlowerProcess(builder);
        ((Aster.Builder) builder).bulk(consoleHelper.parseIntAnswer(SET_BULK_MESSAGE));
        return builder.build();
    }

    @Override
    protected List<ColorType> getColorsForFlower() {
        return Aster.colorList;
    }
}