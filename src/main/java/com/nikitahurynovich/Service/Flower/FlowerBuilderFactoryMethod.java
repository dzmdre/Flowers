package com.nikitahurynovich.Service.Flower;

import com.nikitahurynovich.Models.Flowers.*;
import com.nikitahurynovich.Types.FlowerEnumType;

/**
 * Created by computer on 29.10.2017.
 */
public class FlowerBuilderFactoryMethod {

    public static Flower.Builder getBuilderForType(FlowerEnumType flowerEnumType) {
        switch (flowerEnumType) {
            case ROSE:
                return Rose.getBuilder();
            case ASTER:
                return Aster.getBuilder();
            case HYACINTH:
                return Hyacinth.getBuilder();
            case CHRYZANTHENUN:
                return Chryzanthenun.getBuilder();
            default:
                break;
        }
        return null;
    }
}
