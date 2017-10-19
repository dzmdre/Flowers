package com.nikitahurynovich.Types;

/**
 * Created by computer on 19.10.2017.
 */
public enum FlowerEnumType {
    ROSE(0), CHRYZANTHENUN(1), HYACINTH(2), ASTER(3);

    private int flowerNumber;

    FlowerEnumType(int flowerNumber) {
        this.flowerNumber = flowerNumber;
    }
}
