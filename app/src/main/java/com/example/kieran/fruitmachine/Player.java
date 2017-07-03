package com.example.kieran.fruitmachine;

/**
 * Created by Kieran on 30/06/2017.
 */

public class Player {

    int cash;

    public int getCash() {
        return cash;
    }

    public Player(int cash){
        this.cash = cash;
    }

    public void winCredits (int payCredits) {
        cash += payCredits;
    }


}
