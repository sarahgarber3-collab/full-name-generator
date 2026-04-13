package com.pluralsight;

import java.sql.SQLOutput;
import java.util.Scanner;

public class FullNameApplication {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        System.out.print("Please enter your first name: ");
        String firstName = scan.nextLine();

        System.out.print("please enter your middle first initial if you have one, if not just press enter: ");
        String middleInitial = scan.nextLine();

        System.out.print("Please enter your last name: ");
        String lastName = scan.nextLine();

        System.out.print("Please enter a suffix if you have one, if not just hit enter: ");
        String suffix = scan.nextLine();


        String fullName = firstName.trim() + " " + middleInitial.trim().toUpperCase() + ". " + lastName.trim() + " , " + suffix.trim() + " ";

        System.out.println(fullName);



    }
}
