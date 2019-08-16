package com.company;

public class Box<T, E> extends Number {

    private T number_1;
    private E number_2;

    @Override
    public int intValue() {
        return 0;
    }

    @Override
    public long longValue() {
        return 0;
    }

    @Override
    public float floatValue() {
        return 0;
    }

    @Override
    public double doubleValue() {
        return 0;
    }

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
