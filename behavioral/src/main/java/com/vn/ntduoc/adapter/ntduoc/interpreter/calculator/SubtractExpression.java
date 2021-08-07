package com.vn.ntduoc.adapter.ntduoc.interpreter.calculator;

public class SubtractExpression implements Expression {

    private final String expression;

    public SubtractExpression(String expression) {
        this.expression = expression;
    }

    @Override
    public int interpret(InterpreterEngineContext context) {
        return context.subtract(expression);
    }
}
