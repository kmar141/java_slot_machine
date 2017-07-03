package com.example.kieran.fruitmachine;

import java.util.ArrayList;

/**
 * Created by Kieran on 30/06/2017.
 */

public class Print {
    FruitMachine fruitmachine;
    ArrayList<Wheel> wheels;
    Player player;

    public Print(FruitMachine fruitmachine, Player player){
        player = new Player(50);
        fruitmachine = new FruitMachine();
        wheels = fruitmachine.getWheels();

    }

    public void printThreeWheels(){
        for (Wheel wheel : wheels) {
            System.out.print(wheel.getSymbol());

        }
    }




}
