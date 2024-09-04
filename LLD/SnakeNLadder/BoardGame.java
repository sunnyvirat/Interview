package com.abb.demoCRUD.SnakeLadder;

import java.util.Deque;
import java.util.LinkedList;

public class BoardGame {
    Deque<Player> players;
    Board board;
    Dice dice;
    public BoardGame()
    {
        initializeGame();
    }
    public void initializeGame()
    {
        players = new LinkedList<>();
        Player p1 = new Player("Sunny", 1, 0);
        Player p2 = new Player("Aditya", 2, 0);
        players.add(p1);
        players.add(p2);
        board = new Board(10);
        dice = new Dice(2);
        board.cells[0][1] = new Cell(new Jump(1, 50));
        board.cells[2][5] = new Cell(new Jump(25, 80));
        board.cells[6][0] = new Cell(new Jump(60, 20));
        board.cells[9][0] = new Cell(new Jump(90, 5));
    }

    public String startGame()
    {
        boolean isWinner = false;
        String winner = "";
        while(!isWinner)
        {
            Player playerTurn = players.removeFirst();
            int pos = dice.rollDice();
            board.setPosition(pos, playerTurn);
            if(IsWinner(playerTurn)) {
                winner = playerTurn.name;
                isWinner = true;
            }
            players.addLast(playerTurn);
        }
        return winner;
    }
    public boolean IsWinner(Player playerTurn)
    {
        if(playerTurn.pos >= board.size*board.size)
            return true;
        else
            return false;
    }
}
