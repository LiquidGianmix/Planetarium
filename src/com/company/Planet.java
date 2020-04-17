package com.company;

import java.awt.*;
import java.util.LinkedList;
import java.util.Scanner;

public class Planet extends CelestialObject {


    public Planet(String name, String unicode, int mass, Point coords){
        this.name = name;
        this.unicode = unicode;
        this.mass = mass;
        this.coords = coords;
    }
    public String getName() {
        return name;
    }
    public int getMass() {
        return mass;
    }
    public String getUnicode(){
        return unicode;
    }
    public Point coords(){
        return coords;
    }


    LinkedList<Moon> moonList = new LinkedList<Moon>();

    void addMoon(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Give me a name");
        String nome = sc.next();
        System.out.println("Give me unicode");
        String unicode = sc.next();
        System.out.println("Give me mass");
        int massa = sc.nextInt();
        System.out.println("Give me coordinate x");
        int coordsx = sc.nextInt();
        System.out.println("Give me coordinate y");
        int coordsy = sc.nextInt();

        Moon tempMoon = new Moon(nome, unicode, massa, new Point (coordsx, coordsy));
        moonList.add(tempMoon);
    }

    void removePlanet() {
        for (int i = 0; i < moonList.size(); i++) {
            System.out.println((i + 1) + ")" + moonList.get(i).name);
        }
        System.out.println("What moon do you want to cancel?");
        Scanner sc = new Scanner(System.in);
        String nameYoureLookingFor = sc.nextLine();

        for (int j = 0; j < moonList.size(); j++) {
            if(moonList.get(j).name.equals(nameYoureLookingFor)){
                moonList.remove(j);
                System.out.println(moonList.get(j).name + "has been removed" );
                break;
            }
        }
    }
    public boolean hasMoon(String name){
        for (int i = 0; i < moonList.size(); i++) {
            if ((moonList.get(i).name).equals(name)){
                return true;
            }
        }
        return false;
    }
    public void printMoons(LinkedList<Planet> planetList){
        for(int i = 0; i < planetList.size(); i++){
            System.out.println(planetList.get(i).name);
        }
    }

}
