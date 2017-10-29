package com.nikitahurynovich.Service.Menu;

import com.nikitahurynovich.Models.Flowers.Flower;
import com.nikitahurynovich.Service.Console.AbstractFlowerConsoleController;
import com.nikitahurynovich.Helper.ConsoleHelper;
import com.nikitahurynovich.Service.Console.FlowerConsoleFactory;
import com.nikitahurynovich.Service.Flower.FlowerBuilderFactoryMethod;
import com.nikitahurynovich.Service.Flower.FlowerService;
import com.nikitahurynovich.Types.ColorType;
import com.nikitahurynovich.Types.FlowerEnumType;
import com.nikitahurynovich.Types.MenuItemType;

/**
 * Created by computer on 28.10.2017.
 */
public class Menu {

    private static String CHOOSE_OPTIONS_MESSAGE = "Choose please options:";
    private static String ENTER_PRICE = "Enter price:";
    private static String ENTER_COLOR = "Enter color";
    private static String ENTER_FLOWER = "Enter flower";
    private static String LOADED_LIST_OF_FLOWERS = "Loaded list of flowers:";
    private static String SAVED_LIST_OF_FLOWERS = "Saved list of flowers to file.";

    private static ConsoleHelper consoleHelper = new ConsoleHelper();

    private final FlowerService flowerService;

    public Menu(FlowerService flowerService) {
        this.flowerService = flowerService;
    }


    public void start() {
        MenuItemType choosenOption = null;

        if (flowerService.getFlowerList().getFlowers().size() > 0) {
            System.out.println(LOADED_LIST_OF_FLOWERS);
            showCurrentFlowerList();
        }

        do {
            choosenOption = mainMenu();
            switch (choosenOption) {
                case ADD_FLOWER: {
                    addFlower();
                    break;
                }
                case SHOW_FLOWER_LIST: {
                    showCurrentFlowerList();
                    break;
                }
                case SORT_BY_PRICE: {
                    sortByPrice();
                    break;
                }
                case SORT_BY_WEIGHT: {
                    sortByWeight();
                    break;
                }
                case GET_BY_COLOR: {
                    getByColor();
                    break;
                }
                case GET_BY_PRICE: {
                    getByPrice();
                    break;
                }
                default:
                    break;

            }


        } while (!choosenOption.equals(MenuItemType.EXIT));


        if (flowerService.getFlowerList().getFlowers().size() > 0) {
            System.out.println(SAVED_LIST_OF_FLOWERS);
            flowerService.saveFlowers();
        }


    }

    private MenuItemType mainMenu() {

        StringBuilder mainMenuMessage = new StringBuilder(CHOOSE_OPTIONS_MESSAGE);
        mainMenuMessage.append('\n');
        for(MenuItemType menuItemType: MenuItemType.values()) {
            mainMenuMessage.append(menuItemType.getCode());
            mainMenuMessage.append(" - ");
            mainMenuMessage.append(menuItemType.toString());
            mainMenuMessage.append('\n');
        }

        return consoleHelper.parseMenuItemAnswer(mainMenuMessage.toString());
    }


    private void sortByPrice() {
        flowerService.sortByPrice();
        flowerService.getFlowerList().getFlowers().forEach(System.out::println);
    }

    private void sortByWeight() {
        flowerService.sortByWeight();
        flowerService.getFlowerList().getFlowers().forEach(System.out::println);
    }

    private void getByPrice() {
        int price = consoleHelper.parseIntAnswer(ENTER_PRICE);
        flowerService.getByPrice(price).forEach(System.out::println);
    }

    private void showCurrentFlowerList() {
        flowerService.getFlowerList().getFlowers().forEach(System.out::println);
    }

    private void getByColor() {
        StringBuilder message = new StringBuilder(ENTER_COLOR);
        message.append('(');
        for (ColorType colorType: ColorType.values()) {
            message.append(colorType.getColor());
            message.append(", ");
        }
        message.replace(message.length() - 2, message.length() -1, ") :");

        ColorType colorType = consoleHelper.parseColorAnswer(message.toString());
        flowerService.getByColor(colorType).forEach(System.out::println);
    }

    private void addFlower() {
        StringBuilder message = new StringBuilder(ENTER_FLOWER);
        message.append('(');
        for (FlowerEnumType flower: FlowerEnumType.values()) {
            message.append(flower.getFlower());
            message.append(", ");
        }
        message.replace(message.length() - 2, message.length() -1, ") :");

        FlowerEnumType flowerEnumType = consoleHelper.parseFlowerType(message.toString());
        Flower.Builder builder = FlowerBuilderFactoryMethod.getBuilderForType(flowerEnumType);
        AbstractFlowerConsoleController flowerConsole = FlowerConsoleFactory.getFlowerConsoleControllerByType(flowerEnumType);
        Flower newFLower =  flowerConsole.flowerProcess(builder);
        flowerService.addFlower(newFLower);
    }



}
