package org.example;

import java.util.Scanner;

public class ConditionalStatements2 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter your num: ");
        int input = reader.nextInt();

        if(input > 10)
        {
            System.out.println("MORE!");
        }
        else
        {
            System.out.println("LESS!");
        }
    }
}
