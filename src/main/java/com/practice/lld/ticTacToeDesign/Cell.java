package com.practice.lld.ticTacToeDesign;

public class Cell {
    private Integer x;
    private Integer y;
    private Symbol symbol;

    public Cell(Integer x, Integer y, Symbol s) {
          this.x = x;
          this.y = y;
          this.symbol = s;
    }

    public Boolean isCellEmpty() {
        return symbol == null;
    }

    public void setSymbol(Symbol symbol) {
        this.symbol = symbol;
    }

    public void getValue() {
        System.out.println("x = "+ this.x + " y = "+ this.y + " symbol = "+ this.symbol);
    }
}
