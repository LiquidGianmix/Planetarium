package com.company;

import java.awt.*;
import java.util.LinkedList;



public class StarSystem {

    public void findObject(LinkedList<Planet> planetList, String name){
        for (Planet p : planetList){
            if (p.name.equals(name)){
                System.out.println("This object exists");
            }
            for(Moon m : p.getMoons()){
            }
        }

    }

    public double calculateCenterOfMass() {
        return (CoordXCenterOfMass(), CoordYCenterOfMass())

    }

    public double CoordXCenterOfMass(LinkedList<Planet> planetList){
        double weightedmass = 0;
        double totalmass = 0;
        for(Planet p : planetList){
            for(Moon m:  p.getMoons()){
            totalmass = totalmass + p.getMass();
            weightedmass = weightedmass + p.getMass() * p.getCoords().getX();
        }
            }
        return weightedmass / totalmass;
    }

    public double CoordYCenterOfMass(LinkedList<Planet> planetList){
        double weightedmass = 0;
        double totalmass = 0;
        for(Planet p : planetList){
            totalmass += p.getMass();
            weightedmass += p.getMass() * p.getCoords().getY();
        }
        return weightedmass / totalmass;
    }


}
