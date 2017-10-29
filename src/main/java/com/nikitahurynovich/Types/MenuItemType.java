package com.nikitahurynovich.Types;

/**
 * Created by computer on 28.10.2017.
 */
public enum MenuItemType {
    SHOW_FLOWER_LIST(1), SORT_BY_PRICE(2), SORT_BY_WEIGHT(3), GET_BY_PRICE(4), GET_BY_COLOR(5), ADD_FLOWER(6), EXIT(7);

    private final int code;

    MenuItemType(int code){
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public static MenuItemType getCode(int value) {
        for(MenuItemType v : values()) {
            if (v.getCode() == value) {
                return v;
            }
        }
        return null;
    }
}
