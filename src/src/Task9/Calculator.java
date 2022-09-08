package src.Task9;

import src.Task8.CustomDouble;

public class Calculator {
    public double operations(final CustomDouble a, final char symbol, final CustomDouble b) {
        return switch (symbol) {
            case '+' -> a.addition(b).toDouble();
            case '-' -> a.subtraction(b).toDouble();
            case '*' -> a.multiplying(b).toDouble();
            case '/' -> a.division(b).toDouble();
            default -> throw new UnsupportedOperationException("Error: wrong symbol!");
        };
    }
}