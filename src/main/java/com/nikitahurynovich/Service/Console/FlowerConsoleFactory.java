package com.nikitahurynovich.Service.Console;

import com.nikitahurynovich.Types.FlowerEnumType;

/**
 * Created by computer on 29.10.2017.
 */
public class FlowerConsoleFactory {

    public static AbstractFlowerConsoleController getFlowerConsoleControllerByType(FlowerEnumType flowerEnumType) {
        switch (flowerEnumType) {
            case ROSE:
                return new RoseConsoleController();
            case ASTER:
                return new AsterConsoleController();
            case HYACINTH:
                return new HyacinthConsoleController();
            case CHRYZANTHENUN:
                return new ChryzanthenunConsoleController();
            default:
                break;
        }
        return null;
    }
}
