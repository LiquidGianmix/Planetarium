package com.company;

import java.awt.*;

public class Moon extends CelestialObject {

    public Moon(String name, String unicode, int mass, Point coords){
        this.name = name;
        this.unicode = unicode;
        this.mass = mass;
        this.coords = coords;
    }
    public String getName() {
        return name;
    }
    public int getMass(){
        return mass;
    }
    public String getUnicode(){
        return unicode;
    }
    public Point coords(){
        return coords;
    }


}
