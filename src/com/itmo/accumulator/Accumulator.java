package com.itmo.accumulator;

public class Accumulator {
    private int value;
    private final Operation operation;
    public Accumulator(int initialValue) {
        this.value = initialValue;
        this.operation = new Operation() {
            @Override
            public int apply(int arg1, int arg2) {
                return arg1 * arg1 * arg2;
            }
        };
    }
    public void calculate(int arg) {
        value = operation.apply(value, arg);
    }
    public int getValue() {
        return value;
    }
}