package com;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class Item {
    public String img;
    public String name;
    public String type;
    public Color color;
    public int value;

    public static String[] types = {
            "Normal",
            "Magic",
            "Rare",
            "Unique",
    };

    public static HashMap<String, Color> colorKey = new HashMap<String, Color>();


    //TODO: get correct colors
    static {
        colorKey.put("Normal", new Color(222,222,222));
        colorKey.put("Magic", new Color(37, 139, 198));
        colorKey.put("Rare", new Color(243, 243,80));
        colorKey.put("Unique", new Color(242, 128, 15));
    }

    public Item(String name, String rarity, Color color, int value) {
        this.name = name;
        this.type = rarity;
        this.value = value;
        this.color = color;


    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}