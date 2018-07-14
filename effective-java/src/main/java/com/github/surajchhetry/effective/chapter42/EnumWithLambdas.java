package com.github.surajchhetry.effective.chapter42;

import java.util.function.DoubleBinaryOperator;

public enum EnumWithLambdas {
    PLUS("+", (x, y) -> x + y),
    MINUS("-", (x, y) -> x - y);


    private DoubleBinaryOperator operator;
    private String symbol;

    EnumWithLambdas(String symbol, DoubleBinaryOperator operator) {
        this.operator = operator;
        this.symbol = symbol;
    }

    public double apply(double x, double y) {
        return this.operator.applyAsDouble(x, y);
    }

    @Override
    public String toString() {
        return this.symbol;
    }
}