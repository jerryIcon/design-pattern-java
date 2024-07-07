package com.jerryicon.design.interpreterPattern;

public class AndExpression implements Expression{

    private Expression expressionA = null;

    private Expression expressionB= null;

    public AndExpression(Expression expressionA, Expression expressionB){
        this.expressionA = expressionA;
        this.expressionB = expressionB;
    }


    @Override
    public boolean interpret(String context) {
        return expressionA.interpret(context) && expressionB.interpret(context);
    }
}
