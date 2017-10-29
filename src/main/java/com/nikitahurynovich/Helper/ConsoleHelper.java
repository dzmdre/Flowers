package com.nikitahurynovich.Helper;

import com.nikitahurynovich.Types.ColorType;
import com.nikitahurynovich.Types.FlowerEnumType;
import com.nikitahurynovich.Types.MenuItemType;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

/**
 * Created by computer on 29.10.2017.
 */
public class ConsoleHelper {

    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public int parseIntAnswer(String message) {
        int answer = 0;
        String input = "";
        try/*(BufferedReader br = new BufferedReader(new InputStreamReader(System.in)))*/ {
            do {
                System.out.println(message);
                input= br.readLine();
            } while (!isNumeric(input));
            answer = Integer.parseInt(input.trim());

        } catch(IOException | NumberFormatException e) {
            e.printStackTrace();
        }
        return answer;
    }



    public ColorType parseColorAnswer(String colorMessage) {
        String input = "";
        ColorType answerColor = null;

        try/*(BufferedReader br = new BufferedReader(new InputStreamReader(System.in)))*/ {
            do {
                System.out.println(colorMessage);
                input = br.readLine();
            } while (ColorType.getColor(input) == null);
            answerColor = ColorType.getColor(input);

        } catch(IOException e) {
            e.printStackTrace();
        }
        return answerColor;
    }

    public ColorType parseColorAnswer(String colorMessage, List<ColorType> colorTypes) {
        String input = "";
        ColorType answerColor = null;

        try/*(BufferedReader br = new BufferedReader(new InputStreamReader(System.in)))*/ {
            do {
                System.out.println(colorMessage);
                input = br.readLine();
            } while (ColorType.getColor(input) == null && !colorTypes.contains(ColorType.getColor(input)));
            answerColor = ColorType.getColor(input);

        } catch(IOException e) {
            e.printStackTrace();
        }
        return answerColor;
    }


    public MenuItemType parseMenuItemAnswer(String message) {
        String input = "";
        MenuItemType answer = null;
        boolean notValidate = true;

        try/*(BufferedReader br = new BufferedReader(new InputStreamReader(System.in)))*/ {
            do {
                System.out.println(message);
                input = br.readLine();
                if (isNumeric(input)) {
                    notValidate = MenuItemType.getCode(Integer.parseInt(input.trim())) == null;
                } else {
                    notValidate = true;
                }

            } while (notValidate);
            answer = MenuItemType.getCode(Integer.parseInt(input.trim()));

        } catch(IOException e) {
            e.printStackTrace();
        }
        return answer;
    }



    public FlowerEnumType parseFlowerType(String message) {
        String input = "";
        FlowerEnumType answer = null;

        try/*(BufferedReader br = new BufferedReader(new InputStreamReader(System.in)))*/ {
            do {
                System.out.println(message);
                input = br.readLine();

            } while (FlowerEnumType.getFlower(input) == null);
            answer = FlowerEnumType.getFlower(input);

        } catch(IOException e) {
            e.printStackTrace();
        }
        return answer;
    }

    public boolean isNumeric(String s) {
        return s != null && s.matches("[-+]?\\d*\\.?\\d+");
    }
}
