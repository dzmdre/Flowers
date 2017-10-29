package com.nikitahurynovich.Service.Console;

import com.nikitahurynovich.Helper.ConsoleHelper;
import com.nikitahurynovich.Models.Flowers.Flower;
import com.nikitahurynovich.Types.ColorType;

import java.util.List;

/**
 * Created by computer on 28.10.2017.
 */
public abstract class AbstractFlowerConsoleController {

    private static String SET_STEEL_LENGTH_MESSAGE = "Set steel length:";
    private static String SET_FRESHNESS_MESSAGE = "Set freshness number:";
    private static String SET_WEIGHT_MESSAGE = "Set weight gr:";
    private static String SET_SMELL_LEVEL_MESSAGE = "Set smell level(number):";
    private static String COLOR_MESSAGE = "Choose color from color list";
    protected static ConsoleHelper consoleHelper = new ConsoleHelper();


    protected abstract List<ColorType> getColorsForFlower();
    public abstract Flower flowerProcess(Flower.Builder builder);

    protected void defaultFlowerProcess(Flower.Builder builder) {
        builder.color(consoleHelper.parseColorAnswer(getColorMessage(getColorsForFlower()), getColorsForFlower()));
        builder.steelLength(consoleHelper.parseIntAnswer(SET_STEEL_LENGTH_MESSAGE));
        builder.freshness(consoleHelper.parseIntAnswer(SET_FRESHNESS_MESSAGE));
        builder.weigth(consoleHelper.parseIntAnswer(SET_WEIGHT_MESSAGE));
        builder.smellLevel(consoleHelper.parseIntAnswer(SET_SMELL_LEVEL_MESSAGE));
     }


     private String getColorMessage(List<ColorType> colorTypes) {
         StringBuilder messageBuilder = new StringBuilder(COLOR_MESSAGE);

         messageBuilder.append('(');

         for (ColorType colorType: colorTypes) {
             messageBuilder.append(colorType.toString());
             messageBuilder.append(", ");
         }
         messageBuilder.replace(messageBuilder.length() - 2, messageBuilder.length() -1, ") :");
         return messageBuilder.toString();
     }


}
