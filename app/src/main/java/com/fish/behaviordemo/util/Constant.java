package com.fish.behaviordemo.util;

/**
 * Created by fish on 16/9/21.
 */
public class Constant {
    public static String[] name = {"Saul Molinero", "Dianne Hackborn", "cheesesquare"};

    public static String getName(int index){
        if (index<name.length){
            return name[index];
        }
        return null;
    }

}
