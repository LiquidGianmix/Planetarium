package com.company;

import java.awt.*;
import java.sql.SQLOutput;
import java.util.LinkedList;
import java.util.Scanner;


public class StarSystem {

    Star star;

    public StarSystem(Star s){
        this.star = s;
    }

    public boolean findObject(String name){
        LinkedList<Planet> planetList = star.getPlanets();
        for (Planet p : planetList){
            if(p.getName().equals(name))
                return true;
            else{
                for (Moon m : p.getMoons()){
                    if(m.getName().equals(name))
                        return true;
                }
            }
        }
        return  false;

    }
    void addStar(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Give me a name");
        String name = sc.next();
        System.out.println("Give me unicode");
        String unicode = sc.next();
        System.out.println("Give me mass");
        int mass = sc.nextInt();

        Star tempStar = new Star(name, unicode, mass);
    }
    void removeStar() {
        System.out.println(star.name);
        Scanner sc = new Scanner(System.in);
        String nameYoureLookingFor = sc.nextLine();
            if(star.name.equals(nameYoureLookingFor)){
                System.out.println(star.name + "has been removed" );
            }
            else{
                System.out.println(nameYoureLookingFor + "is not a star");
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
