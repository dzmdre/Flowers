package com.nikitahurynovich.Service;

import com.nikitahurynovich.Models.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by computer on 19.10.2017.
 */
public class FlowerFactory implements IFlowerFactory {

    @Override
    public Flower createAster() {
        return new Aster();
    }

    @Override
    public Flower createRose() {
        return new Rose();
    }

    @Override
    public Flower createHyacinth() {
        return new Hyacinth();
    }

    @Override
    public Flower createChryzanthenun() {
        return new Chryzanthenun();
    }

    @Override
    public List<Flower> createListOfFlowers() {
        List<Flower> flowers = new ArrayList<>();
        flowers.add(createAster());
        flowers.add(createRose());
        flowers.add(createHyacinth());
        flowers.add(createChryzanthenun());
        return flowers;
    }
}
