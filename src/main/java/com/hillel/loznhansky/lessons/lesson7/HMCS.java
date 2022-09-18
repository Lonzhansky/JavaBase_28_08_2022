package com.hillel.loznhansky.lessons.lesson7;

import java.util.Arrays;
import java.util.Scanner;

public class HMCS {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] team1 = new int[5];
        int[] team2 = new int[5];

        for (int i = 0; i < team1.length + team2.length; i++) {
            System.out.println(
                    i < team1.length
                            ? "Please enter count frags for player " + (i + 1) + " team1"
                            : "Please enter count frags for player " + (i + 1 - team1.length) + " team2");
            if (scanner.hasNextInt()) {
                int value = scanner.nextInt();
                if (i < team1.length) {
                    team1[i] = value;
                } else {
                    team2[i - team1.length] = value;
                }
                scanner.nextLine();
            } else {
                System.out.println("wrong data, try again");
                scanner.nextLine();
                i--;
            }
        }
        System.out.println(Arrays.toString(team1));


//        for (int i = 0; i < team2.length; i++) {
//            System.out.println("Please enter count frags for player " + (i + 1));
//            if (scanner.hasNextInt()) {
//                team2[i] = scanner.nextInt();
//                scanner.nextLine();
//            } else {
//                System.out.println("wrong data, try again");
//                scanner.nextLine();
//                i--;
//            }
//        }
        System.out.println(Arrays.toString(team2));

        double sumFragsTeam1 = 0;
        double sumFragsTeam2 = 0;
        for (int frag: team1) {
            sumFragsTeam1 += frag;
        }
        for (int frag: team2) {
            sumFragsTeam2 += frag;
        }

        double avgTeam1 = sumFragsTeam1 / team1.length;
        double avgTeam2 = sumFragsTeam2 / team2.length;

        System.out.println("team1 avg = " + avgTeam1);
        System.out.println("team2 avg = " + avgTeam2);

        if (avgTeam1 == avgTeam2) {
            System.out.println("draw");
        } else if (avgTeam1 > avgTeam2) {
            System.out.println("team1 won");
        } else {
            System.out.println("team2 won");
        }
    }
}
