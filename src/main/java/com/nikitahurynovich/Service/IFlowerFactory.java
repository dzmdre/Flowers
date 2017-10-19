package com.nikitahurynovich.Service;

import com.nikitahurynovich.Models.Flower;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by computer on 19.10.2017.
 */
public interface IFlowerFactory {
    Flower createRose();
    Flower createChryzanthenun();
    Flower createHyacinth();
    Flower createAster();
    default List<Flower> createListOfFlowers() {
        return new ArrayList<>();
    }
}
