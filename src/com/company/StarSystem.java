package com.company;

import java.awt.*;
import java.util.LinkedList;


public class StarSystem {

    public void findObject(){

    }

    public int calculateCenterOfMass(LinkedList<Planet> planetList, Point coords){

        public float XPosition(LinkedList<Planet> planetList){
            int weightedmass = 0;
            int totalmass = 0;
            for(Planet p : planetList){
                totalmass = totalmass + p.getMass();
                weightedmass = weightedmass + p.getMass() * Point.getX();
            }
            return weightedmass / totalmass;
        }

        public int YPosition(LinkedList<Planet> planetList){
            int weightedmass = 0;
            int totalmass = 0;
            for(Planet p : planetList){
                totalmass += p.getMass();
                weightedmass += p.getMass() * Point.getY();
            }
            return weightedmass / totalmass;
        }
    }
}
