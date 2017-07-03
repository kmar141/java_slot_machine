package com.example.kieran.fruitmachine;

import java.util.ArrayList;

/**
 * Created by Kieran on 30/06/2017.
 */

public class Logic {
    FruitMachine fruitmachine;
    Player player;
    Print print;
    ArrayList<Symbol> wheels;

    public Logic(FruitMachine fruitmachine, Player player, Print print){
        this.fruitmachine = fruitmachine;
        this.player = player;
        this.print = print;

    }

    public void run() {
        while (fruitmachine.playerCash < 20) {
         (fruitmachine.playerCash -= 1}
        print.printThreeWheels();
    }
}
