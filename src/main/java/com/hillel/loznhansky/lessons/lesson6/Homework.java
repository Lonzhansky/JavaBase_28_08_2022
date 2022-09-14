package com.hillel.loznhansky.lessons.lesson6;

import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int player1 = 0;

        String str = scanner.nextLine();

        System.out.println(str.isBlank());
        System.out.println(str.isEmpty());


        for (char ch : str.toCharArray()) {
            if (ch == ' ') {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

        if (scanner.hasNextInt()) {
            player1 = scanner.nextInt();
        } else {
            System.out.println("Wrong data!");
            System.exit(0);
        }


    }
}
