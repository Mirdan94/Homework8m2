package com.company;

public class Box<T extends Number, E extends Number>  {

    private T number_1;
    private E number_2;


    public T getNumber_1() {
        return number_1;
    }

    public E getNumber_2() {
        return number_2;
    }

    public Box(T number_1, E number_2) {
        this.number_1 = number_1;
        this.number_2 = number_2;
    }
}
