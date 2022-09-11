package com.hillel.loznhansky.lessons.lesson5;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        System.out.println("0" + Integer.toBinaryString(5));
//        System.out.println(Integer.toBinaryString(8));
//
//
//        System.out.println(5 & 8); // AND
//
//        System.out.println(5 | 8); // OR
//
//        System.out.println(5 ^ 9); // XOR
//
//
//        System.out.println(5 << 5);
//
//        System.out.println(160 >> 5);


//        int a = 10;
//        int b = 10;
//        boolean result = a > b;


//        if (a > b) {
//            System.out.println("a > b");
//        }


//        if (a > b) {
//            System.out.println("a > b");
//        } else {
//            System.out.println("b >= a");
//        }


//        if (a > b) {
//            System.out.println("a > b");
//        } else if (b >= a) {
//            System.out.println("b > a");
//        } else {
//            System.out.println("a == b");
//        }


//        if (a > b) {
//            System.out.println("a > b");
//        }
//        if (b >= a) {
//            System.out.println("b > a");
//        }
//        if (a == b) {
//            System.out.println("a == b");
//        }


//        if (a >= b) {
//            System.out.println("a >= b");
//
//            if (a == b) {
//                System.exit(0);
//            } else {
//                System.out.println("a > b");
//            }
//
//        } else {
//            System.out.println("a < b");
//        }


//        if (a < b) {
//            System.out.println("YES");
//        } else {
//            System.out.println("NO");
//        }
//
//
////        умова ? вираз1 : вираз2
//        System.out.println((a < b) ? "YES" : "NO");
//
//
//        System.out.println((a < b) ? "YES" : (a > b) ? ">" : "==");


//        int a = 22;

//        if (a == 1) {
//            System.out.println("1");
//        } else if (a == 2) {
//            System.out.println("2");
//        } else if (a == 3) {
//            System.out.println("3");
//        } else if (a == 4) {
//            System.out.println("4");
//        } else if (a == 5) {
//            System.out.println("5");
//        }


//        String str1 = "HELLO";
//        String str2 = "Hello";
//        String str3 = new String("Hello");
//
//        System.out.println(str1 == str3);
//
//
//        System.out.println();
//        System.out.println(str1.equalsIgnoreCase(str2));
//        System.out.println(str1.equalsIgnoreCase(str3));

//        switch (str1) {
//            case "QWERTY": {
//                System.out.println("qwerty");
//                break;
//            }
//            case "Hello": {
//                System.out.println("2");
//                break;
//            }
//            case "HELLO": {
//                System.out.println("HELLO");
//                break;
//            }
//        }


//        switch (a) {
//            case 1: {
//                System.out.println("1");
//                break;
//            }
//            case 2: {
//                System.out.println("2");
//                break;
//            }
//            case 3: {
//                System.out.println("3");
//                break;
//            }
//            case 4: {
//                System.out.println("4");
//                break;
//            }
//            case 5: {
//                System.out.println("5 YES!");
//                break;
//            }
//            default: {
//                System.out.println("default");
//                break;
//            }
//        }


        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter some line:");
        String value = scanner.nextLine();
        System.out.println(value);

        System.out.println("please enter some integer: ");
        if (scanner.hasNextInt()) {
            int a = scanner.nextInt();
            System.out.println(a);
        } else {
            System.out.println("WRONG DATA! PLEASE RESTART APP AND TRY AGAIN");
            System.exit(0);
        }
        scanner.nextLine();

        System.out.println("Please enter some line:");
        value = scanner.nextLine();
        System.out.println(value);

    }
}



