package com.company;

import java.awt.*;
import java.util.ListIterator;
import java.util.Scanner;

public class StarSystem {

    public void findObject(){


        Star star = new Star();


        Scanner sc = new Scanner(System.in);
        String nameYoureLookingFor = sc.nextLine();

        ListIterator<Planet> planetIterator = planetLinkedListObject.listIterator();
        boolean exists = false;
        while (planetIterator.hasNext() && exists == false) {
            Planet currentPlanet = planetIterator.next();
            if (currentPlanet.getName().equals(nameYoureLookingFor)) {
                exists = true;
            } else {
                ListIterator<Moon> moonIterator = currentPlanet.getMoonLinkedListObject.listIterator();
                while (moonIterator.hasNext() && exists == false) {
                    Moon currentMoon = moonIterator.next();
                    if (currentMoon.getName().equals(nameYoureLookingFor){
                        exists = true;
                    }
                }
            }
            return exists;
        }

        /* Basically you're iterating through your planets and if the planet name matches the search name,
         you make exists = true which takes you out of the loop.
         If the planet name doesn't match the search name, you iterate through
         that planet's moons and check each moon to see if they match the search name.
        If one of them does you set exists = true. If they don't you move on to the next planet and do the same thing.
        */
    }
    public void calculateCenterOfMass(int mass, Point coords){

    }

    public void moonOrbitsAround(){

    }
}
