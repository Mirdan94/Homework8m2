package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Box<Double, Integer> object = new Box<>(1.0, 2);

        Box<Float, Float> object2 = new Box<>(123f, 44f);

        System.out.println("Вызываем сложение");
        addition(object,object2);
        System.out.println("Вызываем умножение");
        multiplication(object,object2);
    }

        public static void addition (Box < ? extends Double, ? extends Integer > object,
                Box < ? extends Float, ? extends Float > object2){

            Number number = object.getNumber_1() + object.getNumber_2() + object2.getNumber_1() + object2.getNumber_2();
            System.out.println(number);

        }

        private static void multiplication (Box < ? extends Double, ? extends Integer > object,
                Box < ? extends Float, ? extends Float > object2){
            Number number2 = object.getNumber_1() * object.getNumber_2() * object2.getNumber_1() * object2.getNumber_2();

            System.out.println(number2);

        }

}

