package com.company;

import java.awt.*;
import java.util.LinkedList;
import java.util.Scanner;


public class StarSystem {

    Star star;

    public StarSystem(Star s){
        this.star = s;
    }

    public boolean findObject(String name) {

        LinkedList<Planet> planetList = star.getPlanets();
        if (planetList.isEmpty()) {
            if (star.getName().equals(name)) {
                return true;
            } else return false;
        } else {
            for (Planet p : planetList) {
                if (p.getName().equals(name) || star.getName().equals(name)) {
                    return true;
                } else {
                    LinkedList<Moon> moonList = p.getMoons();
                    for (Moon m : p.getMoons()) {
                        if (m.getName().equals(name)) {
                            star.orbitsAround(name);
                            return true;
                        }
                    }
                }
            }
            return false;
        }
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
        if(star==null){
            System.out.println("there is no star in this system anymore");
        }
        else {
            System.out.println("This is the star system's star: " + star.name);
            Scanner sc = new Scanner(System.in);
            String nameYoureLookingFor = sc.nextLine();
            if (star.name.equals(nameYoureLookingFor)) {
                System.out.println(star.name + " has been removed");
                star = null;
            } else {
                System.out.println(nameYoureLookingFor + " is not a star");
            }
        }
    }

    public void calculateCenterOfMass() {
        LinkedList<Planet> planetList = star.getPlanets();
        double xmass = 0;
        double ymass = 0;
        double totalmass = 0;
        for (Planet p : planetList) {
            totalmass = totalmass + p.getMass();

            xmass += p.getMass() * p.getCoords().getX();
            ymass += p.getMass() * p.getCoords().getY();
            for (Moon m : p.getMoons()) {
                totalmass = totalmass + m.getMass();
                xmass += m.getMass() * m.getCoords().getX();
                ymass += m.getMass() * m.getCoords().getY();
            }
        }
        totalmass = totalmass + star.getMass();
        xmass += star.getMass() * 0;
        ymass += star.getMass() * 0;

        double x =  (xmass / totalmass);
        double y =  (ymass / totalmass);

        System.out.println( "The center of mass is " + "("+ x +"," +y+")" );
    }
}
