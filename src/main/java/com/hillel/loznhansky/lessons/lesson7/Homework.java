package com.hillel.loznhansky.lessons.lesson7;

import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {
//        int number = 12345;
//        int temp;
//
//        while (number != 0) {
//            temp = number % 10;
//            System.out.println(temp);
//            number /= 10;
//        }
//
//        for (; number != 0; number /= 10) {
//            temp = number % 10;
//            System.out.println(temp);
//        }

        Scanner scanner = new Scanner(System.in);
        int randomNumber = 5;
        for (int i = 0; i < 3; i++) {
            if (scanner.hasNextInt()) {
                if (randomNumber == scanner.nextInt()) {
                    System.out.println("win");
                    break;
                } else {
                    System.out.println("try again");
                }
                scanner.nextLine();
            } else {
                System.out.println("wrong data");
                i--;
                System.out.println(scanner.nextLine());
            }
        }
    }
}
