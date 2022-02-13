package com.Randle;

import java.util.Scanner;
import java.lang.System;

public class Dragon {

    public static void main(String[] args) {
        System.out.println("You are in a land full of dragons.");
        System.out.println("In front of you, you see two caves");
        System.out.println("In one cave, the dragon is friendly and share his treasure with you.");
        System.out.println("The other dragon is greedy and hungry and will eat you on sight");
        System.out.println("Which cave will you go into? (1 or 2)");

        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        if (s.equals("1")) {
            System.out.println("You approach the cave...");
            System.out.println("It is dark and spooky");
            System.out.println("A large dragon jumps out in front of you! He opens his jaws and...");
            System.out.println("Gobbles you down in one bite!");
        } else if (s.equals("2")) {
            System.out.println("You approach the cave...");
            System.out.println("It is dark and spooky");
            System.out.println("You see a dragon in the distance.");
            System.out.println("The dragon approaches you, opens its mouth and...");
            System.out.println("Vomits all the treasure it has been hiding for centuries to share with you");
            System.out.println("What is your name?");
            System.out.println("Enter what you're called");

            Scanner console = new Scanner(System.in);
            String name = console.nextLine();

            System.out.println("You shout back, 'My name is " + name + "'");


        }

    }
}
