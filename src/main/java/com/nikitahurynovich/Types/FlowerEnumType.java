package com.nikitahurynovich.Types;

/**
 * Created by computer on 19.10.2017.
 */
public enum FlowerEnumType {
    ROSE("rose"), CHRYZANTHENUN("chryzanthenun"), HYACINTH("hyacinth"), ASTER("aster");

    private String flower;


    public static FlowerEnumType getFlower(String value) {
        for(FlowerEnumType v : values()) {
            if (v.getFlower().equals(value)) {
                return v;
            }
        }
        return null;
    }

    FlowerEnumType(String flower) {
        this.flower = flower;
    }

    public String getFlower() {
        return flower;
    }
}
