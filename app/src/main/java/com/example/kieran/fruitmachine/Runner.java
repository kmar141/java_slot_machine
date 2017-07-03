package com.example.kieran.fruitmachine;

import java.util.ArrayList;

/**
 * Created by Kieran on 30/06/2017.
 */

public class Runner {


    public static void main(String[] args) {
        FruitMachine fruitmachine = new FruitMachine();
        Player player = new Player(50);
        Print print = new Print(fruitmachine, player);
        Logic logic = new Logic(fruitmachine, player, print);

        logic.run();

    }


}

