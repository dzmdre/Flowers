package com.nikitahurynovich;


import com.nikitahurynovich.Models.Flowers.Flower;
import com.nikitahurynovich.Service.Flower.FlowerService;
import com.nikitahurynovich.Service.Menu.Menu;
import com.nikitahurynovich.Types.ColorType;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by computer on 19.10.2017.
 */
public class App {

    public static void main(String[] args) {
//        Random random = new Random();
//
//        IFlowerFactory flowerFactory = new FlowerBuilderFactoryMethod();
//        List<Flower> flowers = new ArrayList<>();
//        for (int i = 0; i < random.nextInt(10) + 1; i ++) {
//            flowers.addAll(flowerFactory.createListOfFlowers());
//        }
//        FlowerService service = new FlowerService(flowers);
//
//        System.out.println("===========================");
//        System.out.println("Crated list of flowers");
//        service.getFlowerList().stream().forEach(System.out::println);
//
//        int fullPrice = service.getFullPrice();
//        System.out.println("===========================");
//        System.out.println("Full price is  " + fullPrice);
//
//        System.out.println("===========================");
//        System.out.println("Sorted by price:");
//
//        service.sortByPrice();
//        service.getFlowerList().stream().forEach(System.out::println);
//
//
//        System.out.println("===========================");
//        System.out.println("Sorted by weight:");
//        service.sortByWeight();
//        service.getFlowerList().stream().forEach(System.out::println);
//
//        System.out.println("===========================");
//        System.out.println("Find by white color: ");
//        List<Flower> foundedByColor = service.getByColor(ColorType.WHITE);
//        foundedByColor.stream().forEach(System.out::println);
//
//        System.out.println("===========================");
//        System.out.println("Find by price == 21: ");
//        List<Flower> foundedByPrice = service.getByPrice(55);
//        foundedByPrice.stream().forEach(System.out::println);
        FlowerService flowerService = new FlowerService();
        flowerService.setFlowerList(flowerService.loadFlowers());
        Menu menu = new Menu(flowerService);
        menu.start();

    }
}
