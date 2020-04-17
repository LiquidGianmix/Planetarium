package com.company;

import java.awt.*;
import java.util.LinkedList;
import java.util.Scanner;


public class Star extends CelestialObject {



    public Star(String name, String unicode, int mass){
        this.name=name;
        this.unicode = unicode;
        this.mass = mass;
        this.coords = new Point( 0,0);
    }

    LinkedList<Planet> getPlanets(){
        return planetList;
    }
    LinkedList<Planet> planetList = new LinkedList<Planet>();


    void addPlanet(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Give me name");
        String name = sc.next();
        System.out.println("Give me unicode");
        String unicode = sc.next();
        System.out.println("Give me mass");
        int mass = sc.nextInt();
        System.out.println("Give me coordinate x");
        int coordsx = sc.nextInt();
        System.out.println("Give me coordinate y");
        int coordsy = sc.nextInt();

        Planet tempPlanet = new Planet(name, unicode, mass, new Point (coordsx, coordsy));
        planetList.add(tempPlanet);
    }
    void removePlanet() {
        for (int i = 0; i < planetList.size(); i++) {
            System.out.println((i + 1) + ")" + planetList.get(i).getName());
        }
        System.out.println("What planet do you want to cancel?");
        Scanner sc = new Scanner(System.in);
        String nameYoureLookingFor = sc.nextLine();

        for (int j = 0; j < planetList.size(); j++) {
            if(planetList.get(j).getName().equals(nameYoureLookingFor)){
                planetList.remove(j);
                System.out.println(planetList.get(j).getName() + "has been removed" );
                break;
            }
        }
    }
    void getMoonPath(String name){
        for (int i = 0; i < planetList.size(); i++) {
            if(planetList.get(i).hasMoon(name)){
                System.out.println(this.name + " > " + planetList.get(i) + " > " + name);

            }
        }
    }

    public void orbitsAround(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the name of a planet to see which moons orbit around it");
        String name = input.nextLine();
        for(int i = 0; i < planetList.size(); i++){
            if(planetList.get(i).name.equals(name)){
                planetList.get(i).printMoons(planetList);
            }
        }
    }



}

