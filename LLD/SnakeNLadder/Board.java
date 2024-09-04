package com.abb.demoCRUD.SnakeLadder;

public class Board {
    public Cell[][] cells;
    int size;
    public Board(int size)
    {
        this.size = size;
        cells = new Cell[size][size];
    }
    public void setPosition(int count, Player player)
    {
        player.pos += count;
        int row = player.pos/size;
        int col = player.pos%size;
        if(row>=0 && row<size  && col>=0 && col<size && cells[row][col]!=null)
        {
            Jump jump = cells[row][col].jump;
            int new_r, new_c;
            new_r = jump.end/size;
            new_c = jump.end%size;
            player.pos = size*new_r + new_c;
        }
    }
}
