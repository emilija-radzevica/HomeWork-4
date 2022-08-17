package com.company;

import java.text.Normalizer;
import java.util.Random;
import java.util.Scanner;


public class RockPaperScisors {
    public static void main(String[] args) {

        // VERSION I

//        while (true) {
//
//            Scanner scan = new Scanner(System.in);
//            System.out.println("Izvēlies savu ieroci - akmens, šķēres vai papīrīts!");
//            String user = scan.next();
//
//            String[] elements = {"akmens", "šķēres", "papīrīts"};
//            String computer = elements[new Random().nextInt(elements.length)];
//            System.out.println("Dators: " + computer);
//
//            if (user.equals(computer)) {
//                System.out.println("Neizšķirts");
//            } else if (user.equals("akmens") && computer.equals("šķēres")) {
//                System.out.println("Tu uzvarēji");
//            } else if (user.equals("akmens") && computer.equals("papīrīts")) {
//                System.out.println("Tu zaudēji");
//                break;
//            } else if (user.equals("papīrīts") && computer.equals("akmens")) {
//                System.out.println("Tu uzvarēji");
//            } else if (user.equals("papīrīts") && computer.equals("šķēres")) {
//                System.out.println("Tu zaudēji");
//                break;
//            } else if (user.equals("šķēres") && computer.equals("papīrīts")) {
//                System.out.println("Tu uzvarēji");
//            } else {
//                System.out.println("Tu zaudēji");
//                break;
//            }
//        }
        // VERSION 1 END

        // VERSION 2

        while (true) {
            Scanner scan = new Scanner(System.in);

            System.out.println("Izvēlies savu ieroci - akmens, šķēres vai papīrīts!");
            String user = scan.nextLine();

            user = Normalizer.normalize(user, Normalizer.Form.NFD);
            user = user.replaceAll("\\p{InCombiningDiacriticalMarks}+", "");
            user = user.replaceAll("\\s+", "");
            user = user.toLowerCase();


            String[] elements = {"akmens", "šķēres", "papīrīts"};
            String computer = elements[new Random().nextInt(elements.length)];
            System.out.println("Dators: " + computer);

            computer = Normalizer.normalize(computer, Normalizer.Form.NFD);
            computer = computer.replaceAll("\\p{InCombiningDiacriticalMarks}+", "");


            if (user.equals(computer)) {
                System.out.println("Neizšķirts");
            } else if (user.equals("akmens")){
                switch (computer) {
                    case "skeres":
                        System.out.println("Tu uzvarēji");
                        break;
                    case "papirits":
                        System.out.println("Tu zaudēji");
                        break;
                }
            } else if (user.equals("papirits")) {
                switch (computer) {
                    case "akmens":
                        System.out.println("Tu uzvarēji");
                        break;
                    case "skeres":
                        System.out.println("Tu zaudēji");
                        break;

                }
            } else if (user.equals("skeres")) {
                switch (computer) {
                    case "papirits":
                        System.out.println("Tu uzvarēji");
                        break;
                    case "akmens":
                        System.out.println("Tu zaudēji");
                        break;
                }
            } else {
                try {
                    Thread.sleep(800);
                    System.out.println("Hm?");
                    Thread.sleep(1000);
                    System.out.println("There seems to be a problem with your input.");
                    Thread.sleep(2000);
                    System.out.println("It can't be the capital letters..");
                    Thread.sleep(1800);
                    System.out.println("or accents...");
                    Thread.sleep(1500);
                    System.out.println("or even spacing.");
                    Thread.sleep(1500);
                    System.out.println("'Why?' you might ask, well...");
                    Thread.sleep(2000);
                    System.out.println("it's because I tried very hard to include code that would help the program work around such obstacles.");
                    Thread.sleep(6000);
                    System.out.println("So stop blaming me, because you had one job - TYPE THE LETTERS IN THE CORRECT SEQUENCE!");
                    Thread.sleep(4500);
                    System.out.println("You know what I'm not mad...");
                    Thread.sleep(2000);
                    System.out.println("just disappointed.");
                    Thread.sleep(2000);
                    System.out.println("I could give you a second chance, a redemption from your mistyping crimes but...you know what?");
                    Thread.sleep(6000);
                    System.out.println("I don't need your wrong input drama right now, I'm out of here.");
                    Thread.sleep(4000);
                    System.out.println("BYE!");
                    break;
                }
                catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
            }
            System.out.println("Revanšs?");
            Scanner scanTwo = new Scanner(System.in);
            String rematch = scanTwo.next();

            rematch = Normalizer.normalize(rematch, Normalizer.Form.NFD);
            rematch = rematch.replaceAll("\\p{InCombiningDiacriticalMarks}+", "");
            rematch = rematch.replaceAll("\\s+", "");
            rematch = rematch.toLowerCase();

            if (rematch.equals("ne") || rematch.equals("no")) {
                break;
            } else {}
        }
        // VERSION2 END
    }
}
