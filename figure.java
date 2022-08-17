package com.company;

import java.util.Scanner;

public class Figure {
    public static void main(String[] args) {

        while(true) {

            Scanner scan = new Scanner(System.in);

            System.out.println("How many rows?");
            int rows = scan.nextInt();

            for(int a = 1; a <= rows; a++) {
                for(int c = rows - a; c > 0; c--) {
                    System.out.print(" ");
                }
                for(int b = 1; b <= a; b++) {
                    System.out.print("* ");
                }
                System.out.println();
            }

            System.out.println("Do you want to stop?");
            System.out.println("(type yes or no)");
            String end = scan.next();

            if(end.equals("yes")) {
                break;
            } else {}

        }
    }
}
