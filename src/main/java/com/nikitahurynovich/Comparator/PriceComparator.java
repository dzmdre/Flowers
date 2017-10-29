package com.nikitahurynovich.Comparator;

import com.nikitahurynovich.Models.Flowers.Flower;

import java.util.Comparator;

/**
 * Created by computer on 28.10.2017.
 */
public class PriceComparator implements Comparator<Flower> {

    @Override
    public int compare(Flower o1, Flower o2) {
        return o1.getPrice() - o2.getPrice();
    }
}
