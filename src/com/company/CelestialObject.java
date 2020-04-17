package com.company;

import java.awt.*;
import java.util.LinkedList;

public class CelestialObject {
    Point coords;
    String name;
    String unicode;
    int mass;

    public void identificateUnicode(LinkedList<Planet> planetList){
        for (int i = 0; i < planetList.size(); i++) {
            if ((planetList.get(i).name).equals(name)) {
                System.out.println( planetList.get(i).getUnicode() );
            } else {
                for (int j = 0; j < planetList.size(); j++) {
                    if (planetList.get(i).getMoons().get(j).equals(name)) {
                        System.out.println( (planetList.get(i).getMoons()).get(j).getUnicode() );
                    } else {
                        System.out.println("There is no such object");
                    }
                }
            }
        }
    }
}