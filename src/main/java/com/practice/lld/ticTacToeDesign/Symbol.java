package com.practice.lld.ticTacToeDesign;

public enum Symbol {
    CROSS("X"), CIRCLE("O"), PLUS("+"), STAR("*");
    private final String desc;
    Symbol(String desc) {
        this.desc = desc;
    }

    public String getDesc() {
        return this.desc;
    }
}
