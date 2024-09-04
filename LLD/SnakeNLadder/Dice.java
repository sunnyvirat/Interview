package com.abb.demoCRUD.SnakeLadder;

import java.util.Random;

public class Dice {
    int diceCount;
    public Dice(int diceCount)
    {
        this.diceCount = diceCount;
    }
    public int rollDice()
    {
        int sum = 0;
        Random random = new Random();
        for(int i=0;i<diceCount;i++)
        {
            int rand = random.nextInt(1,6);
            sum+=rand;
        }
        return sum;
    }
}
