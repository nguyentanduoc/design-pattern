package com.vn.ntduoc.adapter.ntduoc.interpreter.calculator;

public class Client {
    public static void main(String[] args) {
        String express1 = "20 plus 8";
        System.out.println(express1 + " = " + interpret(express1));
        String express2 = "20 subtract 8";
        System.out.println(express2 + " = " + interpret(express2));
    }

    private static int interpret(String input) {
        Expression exp = null;
        if (input.contains("plus")) {
            exp = new AddExpression(input);
        } else if (input.contains("subtract")) {
            exp = new SubtractExpression(input);
        } else {
            throw new UnsupportedOperationException();
        }
        return exp.interpret(new InterpreterEngineContext());
    }
}
