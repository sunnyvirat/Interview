package com.abb.demoCRUD.TicTacToe;

import org.apache.commons.lang3.tuple.Pair;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Game {
    public Deque<Player> players;
    public Board board;
    public Game()
    {
        initializeGame();
    }
    public void initializeGame()
    {
        players = new LinkedList<>();
        PlayingPiece cross = new PlayingPieceX();
        Player p1 = new Player("Sunny", cross);
        PlayingPiece nought = new PlayingPieceO();
        Player p2 = new Player("Ayush", nought);
        players.add(p1);
        players.add(p2);
        board = new Board(3);
    }
    public String startGame()
    {
        boolean isWinner = false;
        while(!isWinner)
        {
            Player playerTurn = players.removeFirst();
            board.printBoard();
            List<Pair<Integer, Integer>> freeSpaces = board.getFreeSpace();
            if(freeSpaces.isEmpty())
            {
                isWinner = true;
                continue;
            }
            System.out.println("Player: " + playerTurn.name + " Enter row & column : ");
            Scanner inputScanner = new Scanner(System.in);
            String s = inputScanner.nextLine();
            String[] values = s.split(",");
            int row = Integer.parseInt(values[0]);
            int col = Integer.parseInt(values[1]);
            boolean isAdded = board.addPiece(row, col, playerTurn.playingPiece);
            if(!isAdded)
            {
                System.out.println("Incorrect position chosen, try again");
                players.addFirst(playerTurn);
                continue;
            }
            players.addLast(playerTurn);
            boolean winner = IsWinner(row, col, playerTurn.playingPiece.pieceType);
            if(winner)
            {
                return playerTurn.name;
            }
        }
        return "tie";
    }
    public boolean IsWinner(int row, int col, PieceType type)
    {
        boolean rowMatch = true;
        boolean columnMatch = true;
        boolean diagonalMatch = true;
        boolean antiDiagonal = true;

        for(int i=0;i<board.size;i++)
        {
            if (board.board[row][i] == null || board.board[row][i].pieceType != type) {
                rowMatch = false;
                break;
            }
        }
        for(int i=0;i<board.size;i++)
        {
            if (board.board[i][col] == null || board.board[i][col].pieceType != type) {
                columnMatch = false;
                break;
            }
        }
        for(int i=0,j=0;i<board.size && j< board.size;i++,j++)
        {
            if (board.board[i][j] == null || board.board[i][j].pieceType != type) {
                diagonalMatch = false;
                break;
            }
        }
        for(int i=0,j= board.size-1; i< board.size && j>=0;i++,j--)
        {
            if (board.board[i][j] == null || board.board[i][j].pieceType != type) {
                antiDiagonal = false;
                break;
            }
        }

        return rowMatch || columnMatch || diagonalMatch || antiDiagonal;
    }
}
