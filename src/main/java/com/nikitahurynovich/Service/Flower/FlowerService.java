package com.nikitahurynovich.Service.Flower;
import com.nikitahurynovich.Comparator.PriceComparator;
import com.nikitahurynovich.Comparator.WeightComparator;
import com.nikitahurynovich.Helper.XMLConverter;
import com.nikitahurynovich.Models.Flowers.*;
import com.nikitahurynovich.Service.Console.*;
import com.nikitahurynovich.Types.ColorType;
import com.nikitahurynovich.Types.FlowerEnumType;

import java.io.File;
import java.util.*;
import java.util.stream.Collectors;

/**
 * Created by computer on 19.10.2017.
 */
public class FlowerService {

    private final static String FLOWERS_FILE = "flowers.xml";

    private FlowerList flowerList = new FlowerList();

    public FlowerService(FlowerList flowerList) {
        if (flowerList != null) {
            this.flowerList = flowerList;
        } else {
            this.flowerList = new FlowerList();
        }
    }

    public FlowerService(){
        flowerList = new FlowerList();
    }

    public List<Flower> getByColor(ColorType colorType) {
        List<Flower> result = new ArrayList<>();
        for(Flower flower: flowerList.getFlowers()) {

            if (flower.getColor().equals(colorType)) {
                result.add(flower);
            }
        }

        return result;
//        flowerList.stream().filter(flower -> flower.getColor().equals(colorType)).collect(Collectors.toList());

    }

    public List<Flower> getByPrice(int price) {

        List<Flower> result = new ArrayList<>();
        for(Flower flower: flowerList.getFlowers()) {

            if (flower.getPrice() == price) {
                result.add(flower);
            }
        }

        return result;
//        return flowerList.stream().filter(flower -> flower.getPrice() == price).collect(Collectors.toList());
    }

    public void sortByPrice() {
        flowerList.getFlowers().sort(new PriceComparator());
    }

    public void sortByWeight() {
        flowerList.getFlowers().sort(new WeightComparator());
    }


    public int getFullPrice() {
        int sum = 0;
        List<Flower> result = new ArrayList<>();
        for(Flower flower: flowerList.getFlowers()) {
            sum += flower.getPrice();
        }
        return sum;
//        return flowerList.stream().mapToInt(f -> f.getPrice()).sum();
    }

    public FlowerList getFlowerList() {
        return flowerList;
    }

    public void setFlowerList(FlowerList flowerList) {
        if (flowerList != null) {
            this.flowerList = flowerList;
        }
    }

    public void addFlower(Flower flower) {
        flowerList.getFlowers().add(flower);
    }


    public void saveFlowers() {
        File file = new File(FLOWERS_FILE);
        XMLConverter.convertToFile(flowerList, file);
    }

    public FlowerList loadFlowers() {
        File file = new File(FLOWERS_FILE);
        if (file.exists()) {
            return XMLConverter.convertFromFile(file);
        }
       return null;

    }

}
