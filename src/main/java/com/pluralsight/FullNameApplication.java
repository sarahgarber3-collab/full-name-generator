package com.pluralsight;

import java.sql.SQLOutput;
import java.util.Scanner;

public class FullNameApplication {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        System.out.print("Please enter your first name: ");
        String firstName = scan.nextLine();

        System.out.print("please enter your middle first initial if you have one, if not just press enter: ");
        String middleInitial = scan.nextLine().trim().toUpperCase();

        System.out.print("Please enter your last name: ");
        String lastName = scan.nextLine().trim();

        System.out.print("Please enter a suffix if you have one, if not just hit enter: ");
        String suffix = scan.nextLine().trim();



        String fullName = "";
        if (suffix.equalsIgnoreCase("") && middleInitial.equalsIgnoreCase("")) {
            fullName = firstName + " " + lastName;
        }
        else if (suffix.equalsIgnoreCase("")) {
            fullName = firstName + " " + middleInitial + " . " + lastName;
        } else if (middleInitial.equalsIgnoreCase("")) {
            fullName = firstName + " " + lastName + "," + suffix;
        }
        else {
            fullName = firstName + " " + middleInitial + " . " + lastName + ", " + suffix + ".";
        }
        System.out.println(fullName);





    }
}
