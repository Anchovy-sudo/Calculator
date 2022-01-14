package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        while(true) {
            System.out.println("For ( + ) press 1");
            System.out.println("For ( - ) press 2");
            System.out.println("For ( x ) press 3");
            System.out.println("For ( / ) press 4");
            System.out.println("For EXIT press 5");
            System.out.println("Please choose your operator: ");

            int choice = sc.nextInt();
            switch (choice) {
                case 1 -> {
                    System.out.println("Enter the first number: ");
                    int a = sc.nextInt();
                    System.out.println("Enter the second number: ");
                    int b = sc.nextInt();
                    System.out.println(a + b);
                }
                case 2 -> {
                    System.out.println("Enter the first number: ");
                    int a = sc.nextInt();
                    System.out.println("Enter the second number: \n");
                    int b = sc.nextInt();
                    System.out.println(a - b);
                }
                case 3 -> {
                    System.out.println("Enter the first number: \n");
                    int a = sc.nextInt();
                    System.out.println("Enter the second number: \n");
                    int b = sc.nextInt();
                    System.out.println(a * b);
                }
                case 4 -> {
                    System.out.println("Enter the first number: \n");
                    int a = sc.nextInt();
                    System.out.println("Enter the second number: \n");
                    int b = sc.nextInt();
                    System.out.println(a / b);
                }
                case 5 -> System.exit(0);
            }
        }

    }
}
