package com.practice.lld.ticTacToeDesign;

import java.util.List;

public class Game {
    private GameBoard board;
    private List<Player> players;
    private Integer currPlayerIndx;


    private void addPlayer(Player p) {
        players.add(p);
    }
    private void removePlayer(Player p) {
        players.remove(p);
    }

    private void showBoard() {
           board.getBoard();
    }

    public void intializeGame(int n) {
        System.out.println("Intializing the game");
         board.intializeGame(n);
         setDummyPlayers();
         // Intialize the curr player
        currPlayerIndx = 0;

    }

    public void startGame() {
        while(true) {

        }
    }

    private void setDummyPlayers() {
        Player p1 = new Player(1, "garry", Symbol.CROSS);
        Player p2 = new Player(2, "Ankesh", Symbol.CIRCLE);
        players.add(p1);
        players.add(p2);
    }
}
