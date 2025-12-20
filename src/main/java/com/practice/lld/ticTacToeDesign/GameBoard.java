package com.practice.lld.ticTacToeDesign;

public class GameBoard {
    private Cell[][] board;
//    private Integer n; // board Size


    public void intializeGame(int n) {
        /**
         *   a. intialize the board
         */
        board = new Cell[n+1][n+1];
        for(int i=0;i<n; i++) {
            for (int j=0;j<n;j++) {
                  board[i][j] = new Cell(i, j, null);
            }
        }

    }

    public void getBoard() {
        for (int i=0;i<board.length;i++) {
            for(int j=0;j<board[i].length;j++) {
               board[i][j].getValue();
            }
        }
    }

    public boolean isValidMove(Cell cell) {
          return cell.isCellEmpty();
    }

    public void makeMove(Cell cell, Symbol s) {
        cell.setSymbol(s);
        System.out.println("Move completed");
    }

}
