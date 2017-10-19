package com.nikitahurynovich.Service;
import com.nikitahurynovich.Models.Flower;
import com.nikitahurynovich.Types.ColorType;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Created by computer on 19.10.2017.
 */
public class FlowerService {
    List<Flower> flowerList = new ArrayList<>();

    public FlowerService(List<Flower> flowerList) {
        if (flowerList != null) {
            this.flowerList = flowerList;
        }
    }


    public List<Flower> getByColor(ColorType colorType) {
        return flowerList.stream().filter(flower -> flower.getColor().equals(colorType)).collect(Collectors.toList());
    }

    public List<Flower> getByPrice(int price) {
        return flowerList.stream().filter(flower -> flower.getPrice() == price).collect(Collectors.toList());
    }

    public void sortByPrice() {
        flowerList.sort(Comparator.comparingInt(Flower::getPrice));
    }

    public void sortByWeight() {
        flowerList.sort(Comparator.comparingInt(Flower::getWeight));
    }


    public List<Flower> getFlowerList() {
        return flowerList;
    }

    public void setFlowerList(List<Flower> flowerList) {
        this.flowerList = flowerList;
    }

    public int getFullPrice() {
        return flowerList.stream().mapToInt(f -> f.getPrice()).sum();
    }
}
