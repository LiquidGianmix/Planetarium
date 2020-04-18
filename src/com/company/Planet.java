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



    LinkedList<Moon> moonList = new LinkedList<Moon>();

    void addMoon(Star star){
        star.printPlanets();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to select a Planet");
        int index = sc.nextInt();
        System.out.println("Give me a name");
        String name = sc.next();
        System.out.println("Give me unicode");
        String unicode = sc.next();
        System.out.println("Give me mass");
        int mass = sc.nextInt();
        System.out.println("Give me coordinate x");
        int coordsx = sc.nextInt();
        System.out.println("Give me coordinate y");
        int coordsy = sc.nextInt();

        Moon tempMoon = new Moon(name, unicode, mass, new Point (coordsx, coordsy));
        star.getPlanets().get(index).moonList.add(tempMoon);
    }

    LinkedList<Moon> getMoons(){
        return moonList;
    }

    void removeMoon() {
        for (int i = 0; i < moonList.size(); i++) {
            System.out.println((i + 1) + ")" + moonList.get(i).getName());
        }
        System.out.println("What moon do you want to cancel?");
        Scanner sc = new Scanner(System.in);
        String nameYoureLookingFor = sc.nextLine();

        for (int j = 0; j < moonList.size(); j++) {
            if(moonList.get(j).getName().equals(nameYoureLookingFor)){
                moonList.remove(j);
                System.out.println(moonList.get(j).getName() + "has been removed" );
                break;
            }
        }
    }
    public boolean hasMoon(String name){
        for (int i = 0; i < moonList.size(); i++) {
            if ((moonList.get(i).getName()).equals(name)){
                return true;
            }
        }
        return false;
    }
    public void printMoons(){
        for(int i = 0; i < moonList.size(); i++){
            System.out.println(i + ". " + moonList.get(i).getName());
        }
    }

}
