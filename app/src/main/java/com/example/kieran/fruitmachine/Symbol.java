package com.example.kieran.fruitmachine;

/**
 * Created by Kieran on 30/06/2017.
 */

public enum Symbol {
    CHERRY(1),
    BELL(2),
    WATERMELON(3),
    LEMON(4),
    BAR(5),
    DIAMOND(6),
    SEVEN(7),
    HORSESHOE(8),
    PLUM(9),
    JACKPOT(10);

    int value;


    Symbol(int value){
        this.value = value;
    }

    public int getValue(){
        return value;
    }
}
