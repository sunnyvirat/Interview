package com.abb.demoCRUD.TicTacToe;

public class Player {
    String name;
    PlayingPiece playingPiece;
    public Player(String name, PlayingPiece piece)
    {
        this.name = name;
        this.playingPiece = piece;
    }
    public String getName()
    {
        return this.name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public PlayingPiece getPlayingPiece()
    {
        return this.playingPiece;
    }
    public void setPlayingPiece(PlayingPiece piece)
    {
        this.playingPiece = piece;
    }
}
