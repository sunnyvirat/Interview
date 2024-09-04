package com.abb.demoCRUD.SnakeLadder;

public class Player {
    String name;
    int playerId;
    int pos;
    public Player(String name, int playerId, int pos)
    {
        this.name = name;
        this.playerId = playerId;
        this.pos = pos;
    }
    public String getName(){
        return this.name;
    }
    public int getPlayerId()
    {
        return this.playerId;
    }
    public int getPos()
    {
        return this.pos;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public void setPos(int pos)
    {
        this.pos = pos;
    }

}
