package com.itmo.accumulator;

public class Main {

    public static void main(String[] args) {
        // Создание экземпляра анонимного класса: new com.itmo.accumulator.Operation {...}
        Accumulator acc = new Accumulator(100);
        acc.calculate(rand(2, 155));
        System.out.println(acc.getValue());

    }


    static public int rand(int rFrom, int rTo) {
        return rFrom + (int)(Math.random() * ((rTo - rFrom) + 1));
    }
}
