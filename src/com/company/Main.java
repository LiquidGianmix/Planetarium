package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Give me a name");
        String name = input.next();
        System.out.println("Give me unicode");
        String unicode = input.next();
        System.out.println("Give me mass");
        int mass = input.nextInt();

        StarSystem s = new StarSystem(new Star(name, unicode, mass));

        System.out.println("Hello Emperors of the Galaxy!");
        System.out.println("\n*** WELCOME TO THE  P L A N E T A R I U M ***");
        System.out.println("Great things you can do:");
        System.out.println("1. Add a new planet");
        System.out.println("2. Add a new moon");
        System.out.println("3. Remove a planet, star or moon");
        System.out.println("4. Find if a celestial object exists");
        System.out.println("5. Calculate the center of mass");
        System.out.println("6. Get path to moon");
        System.out.println("+++ ENTER A NUMBER TO SELECT AN OPTION +++");


        int choice = input.nextInt();

        switch (choice) {

            case 1:
                .addPlanet();
                break;

            case 2:
                s.addMoon();
                break;

            case 3:
                System.out.println("Do you want to remove a planet a star or a moon?");
                s.removeStar();
                removePlanet();
                removeMoon();
                break;

            case 4:
                String newinput = input.next();
                if(s.findObject(newinput)) {
                    System.out.println("It exists");
                }
                    else{
                        System.out.println("It doesnt exist");
                    }

                break;

            case 5:
            System.out.println("Calculating center of mass please wait: [...]");
                s.calculateCenterOfMass();
                break;

            case 6:
                s.getMoonPath;

                break;

            case 7:

                break;

            default:
                System.out.println("Invalid number");

        }
    }
}
