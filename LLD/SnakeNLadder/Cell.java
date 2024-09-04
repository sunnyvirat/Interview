package com.abb.demoCRUD.SnakeLadder;

public class Cell {
    Jump jump;
    public Cell(Jump jump)
    {
        this.jump = jump;
    }
    public Jump getJump()
    {
        return this.jump;
    }
}
