package com.abb.demoCRUD.TicTacToe;

import org.apache.commons.lang3.tuple.Pair;

import java.util.ArrayList;
import java.util.List;

public class Board {
    public PlayingPiece[][] board;
    public int size;
    public Board(int size)
    {
        this.size = size;
        board = new PlayingPiece[size][size];
    }
    public Boolean addPiece(int row, int col, PlayingPiece playingPiece)
    {
        if(board[row][col]!=null)
        {
            return false;
        }
        board[row][col] = playingPiece;
        return true;
    }

    public List<Pair<Integer, Integer>> getFreeSpace()
    {
        List<Pair<Integer, Integer>> freeCells = new ArrayList<>();
        for(int i=0;i<size;i++)
        {
            for(int j=0;j<size;j++)
            {
                if(board[i][j]==null)
                {
                    Pair<Integer, Integer> cell = Pair.of(i, j);
                    freeCells.add(cell);
                }
            }
        }
        return freeCells;
    }

    public void printBoard()
    {
        for(int i=0;i<size;i++)
        {
            for(int j=0;j<size;j++)
            {
                if(board[i][j]!=null)
                {
                    System.out.print(board[i][j].pieceType.name() + "   ");
                }
                else {
                    System.out.print("    ");
                }
                System.out.print("  |  ");
            }
            System.out.println();
        }
    }
}
