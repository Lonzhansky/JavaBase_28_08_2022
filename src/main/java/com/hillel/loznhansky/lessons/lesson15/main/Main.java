package com.hillel.loznhansky.lessons.lesson15.main;

public class Main {

    public static void main(String[] args) {


//        System.out.println(TransportTypeClass.MOTORCYCLE.getTitle());


//        System.out.println(TransportType.MOTORCYCLE.getTitle());
//
//
        for (TransportType transportType : TransportType.values()) {
            System.out.println(transportType);
            System.out.println(transportType.getTitle());
        }

//        TransportType motorcycle = TransportType.MOTORCYCLE;
//
//
//        switch (motorcycle) {
//            case CAR: {
//                System.out.println("its car");
//                break;
//            }
//
//            case BUS: {
//                System.out.println("its bus");
//                break;
//            }
//
//            case MOTORCYCLE: {
//                System.out.println("YES!!!!!!!!!!!!!!");
//                break;
//            }
//        }

    }


    static boolean getBoolean() {
        return (Math.random() * 10) > 5;
    }

    static void demo() {
        TransportType transportType = null;
        try {
            transportType = TransportType.valueOf("BUS");
        } catch (IllegalArgumentException e) {
            System.out.println("error");
        }

        if (transportType != null) {
            System.out.println(transportType.getTitle());
        }
    }

}
