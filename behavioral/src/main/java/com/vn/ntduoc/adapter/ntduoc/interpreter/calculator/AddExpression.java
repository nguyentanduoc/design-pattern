package com.vn.ntduoc.adapter.ntduoc.interpreter.calculator;

public class AddExpression implements Expression {

    private final String expression;

    public AddExpression(String expression) {
        this.expression = expression;
    }

    @Override
    public int interpret(InterpreterEngineContext context) {
        return context.add(expression);
    }
}
