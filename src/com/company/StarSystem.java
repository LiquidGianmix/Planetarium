package com.company;

import java.awt.*;
import java.util.LinkedList;
import java.util.Scanner;


public class StarSystem {

    Star star;

    public StarSystem(Star s){
        this.star = s;
    }
   // Star getStar(Star){
    //    this.star = star;
    //}

    public boolean findObject(String name){
        LinkedList<Planet> planetList = star.getPlanets();
        for (Planet p : planetList){
            if(p.getName().equals(name))
                return true;
            else{
                for (Moon m : p.getMoons()){
                    if(m.getName().equals(name))
                        star.orbitsAround(name);
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

    public void calculateCenterOfMass() {
        LinkedList<Planet> planetList = star.getPlanets();
        double xmass = 0;
        double ymass = 0;
        double totalmass = 0;
        for (Planet p : planetList) {
            totalmass = totalmass + p.getMass();

            xmass += p.getMass() * p.getCoords().getX();
            ymass += p.getMass() * p.getCoords().getX();
            for (Moon m : p.getMoons()) {
                totalmass = totalmass + m.getMass();
                xmass += m.getMass() * m.getCoords().getX();
                ymass += m.getMass() * m.getCoords().getY();
            }
        }
        totalmass = totalmass + star.getMass();
        xmass += star.getMass() * 0;
        ymass += star.getMass() * 0;

        int x = (int) (xmass / totalmass);
        int y = (int) (ymass / totalmass);

        System.out.println( new Point(x, y));
    }
}
