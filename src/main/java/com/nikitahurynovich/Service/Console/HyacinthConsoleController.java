package com.nikitahurynovich.Service.Console;

import com.nikitahurynovich.Models.Flowers.Flower;
import com.nikitahurynovich.Models.Flowers.Hyacinth;
import com.nikitahurynovich.Types.ColorType;

import java.util.List;

/**
 * Created by computer on 28.10.2017.
 */
public class HyacinthConsoleController extends AbstractFlowerConsoleController {

    private static final String SET_HEAD_LENGH = "Choose flower head length of hyacinth:";


    @Override
    public Flower flowerProcess(Flower.Builder builder) {
        super.defaultFlowerProcess(builder);
        ((Hyacinth.Builder) builder).headLength(consoleHelper.parseIntAnswer(SET_HEAD_LENGH));
        return builder.build();
    }

    @Override
    protected List<ColorType> getColorsForFlower() {
        return Hyacinth.colorList;
    }
}