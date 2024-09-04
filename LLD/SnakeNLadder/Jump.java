package com.abb.demoCRUD.SnakeLadder;

import org.apache.commons.lang3.tuple.Pair;

public class Jump {
    int start;
    int end;
    public Jump(int start, int end)
    {
        this.start = start;
        this.end = end;
    }

    public Pair<Integer, Integer> getJump()
    {
        return Pair.of(this.start, this.end);
    }

    public void setJump(int start, int end)
    {
        this.start = start;
        this.end = end;
    }
}
