package com.hillel.loznhansky.lessons.lesson6;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

//        for(  БЛОК ІНІЦІАЛІЗАЦІЇ ІТЕРАТОРА;
//              БЛОК УМОВИ ВИХОДУ З ЦИКЛУ;
//              БЛОК ЗМІНИ ІТЕРАТОРА (++ або --)
//              )
//              {
//                  код
//              }


//        -- BREAK --
//        ОБРИВАННЯ ВСЬОГО ЦИКЛУ

//        -- CONTINUE --
//        ОБРИВАЄ ПОТОЧНУ ІТЕРАЦІЮ

//        for (int i = 10; i >= 0; i--) {
//            if (i == 5) {
//                continue;
//            }
//
//            if (i == 2) {
//                break;
//            }
//            System.out.println(i);
//        }

//        Scanner scanner = new Scanner(System.in);
//        int player1;
//        for ( ; ; ) {
//            if (scanner.hasNextInt()) {
//                player1 = scanner.nextInt();
//                break;
//            } else {
//                System.out.println("Wrong data! please try again");
//                scanner.nextLine();
//            }
//        }
//
//        System.out.println("your number: " + player1);


//        виведення лише парних за допомогою циклу FOR
//        0 2 4 6 8 10 12 14 16 18 20

//        for (int i = 0; i <= 20; i++) {
//            if (i % 2 != 0) {
//                System.out.println(i);
//            }
//        }


//        Виведіть на екран перші 11 членів послідовності Фібоначчі
//        0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55

//        int number1 = 0;
//        int number2 = 1;
//        int sum;
//        System.out.print(number1 + " " + number2 + " ");
//        for (int i = 0; i < 9; i++) {
//            sum = number1 + number2;
//            System.out.print(sum + " ");
//            number1 = number2;
//            number2 = sum;
//        }

//        int i = 0;
//        while (i < 10) {
//            System.out.println("Hello world");
//            i++;
//        }

//        Scanner scanner = new Scanner(System.in);
//        int player1;
//        while (true) {
//            if (scanner.hasNextInt()) {
//                player1 = scanner.nextInt();
//                break;
//            } else {
//                System.out.println("Wrong data! please try again");
//                scanner.nextLine();
//            }
//        }

//        int i = 10;
//        while (true) {
//            if (i == 9) {
//                break;
//            }
//            System.out.println(i);
//            i++;
//        }

//        Scanner scanner = new Scanner(System.in);
//        int player1;
//        do {
//            if (scanner.hasNextInt()) {
//                player1 = scanner.nextInt();
//                break;
//            } else {
//                System.out.println("Wrong data! please try again");
//                scanner.nextLine();
//            }
//        } while (true);


//        a. Зробіть бомбу зі зворотним відліком від 10 до 0 за допомогою циклу WHILE
//        b. додайте до вашої бомби умову, якщо бомба розмінована, вона не вибухне (85 - 100) - win

//        Math.random(); // 0.0 - 0.99999 ->  0.99999 * 101 = 100.9999 -> int = 100
//        int timer = 10;
//        while (timer > -1) {
//            if ((int) (Math.random() * 101) >= 85) {
//                System.out.println("DEFUSE");
//                break;
//            }
//
//            System.out.println(timer);
//            if (timer == 0) {
//                System.out.println("BOOOOOM!!!!!");
//            }
//            timer--;
//        }


//        Обчислити факторіал числа від 0 до N (вводимо з консолі)

//        5! = 1 * 2 * 3 * 4 * 5;
//        3! = 1 * 2 * 3;

//        Scanner scanner = new Scanner(System.in);
//        int N = -1;
//
//        while (true) {
//            if (scanner.hasNextInt()) {
//                N = scanner.nextInt();
//                if (N < 0 || N > 10) {
//                    System.out.println("Please enter number from 0 to 10");
//                } else {
//                    break;
//                }
//            } else {
//                System.out.println("Wrong data! Try again");
//                scanner.nextLine();
//            }
//        }
//
//        int result = 1;
//        for (int i = 1; i <= N; i++) {
//            result *= i;
//        }
//
//        System.out.println(result);


//        У Японії числа 4 та 9 вважаються нещасливими. Вам потрібно пронумерувати
//        100 космічних шатлів для перевезення людей на Марс так, щоб в
//        У номерах шатлів не траплялося нещасливих чисел. Напишіть функцію,
//        яка виводить усі номери таких шатлів.

//        int counter = 0;
//        for (int i = 1; i < 11; i++) {
//            if ((i == 4) || (i == 9)) {
//                continue;
//            }
//            System.out.println("shuttle number:" + i);
//            counter++;
//        }
//
//        System.out.println("count = " + counter);



        int counter = 0;
        for (int i = 1; i < 101; i++) {
            if ((i == 4) || (i == 9) || (i / 10 == 4) || (i / 10 == 9) || (i % 10 == 4) || (i % 10 == 9)) {
                continue;
            }
            System.out.println("shuttle number:" + i);
            counter++;
        }

        System.out.println("count = " + counter);


    }
}
