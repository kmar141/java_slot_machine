package com.example.kieran.fruitmachine;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/**
 * Created by Kieran on 30/06/2017.
 */

public class FruitMachine {
    ArrayList<Wheel> wheels;
    Wheel wheel1;
    Wheel wheel2;
    Wheel wheel3;
    int credits;
    int playerCash;
    int startBalance;

    public FruitMachine() {
        wheel1 = new Wheel();
        wheel2 = new Wheel();
        wheel3 = new Wheel();
        int credits = 50;
        int playerCash = 20;
        int startBalance = 0;
    }

    public ArrayList<Wheel> getWheels() {
        return wheels;
    }

    public int getCredits() {
        return credits;
    }

    public int getPlayerCash() {
        return playerCash;
    }

    public int getStartBalance() {
        return startBalance;
    }

    public int getRandomSpins() {
        Random random = new Random();
        int wheelSize = Symbol.values().length;
        int index = random.nextInt(wheelSize);
        return index;
    }

    public void spinOneWheel(Wheel wheel) {
        int spinOne = getRandomSpins();
        Collections.rotate(wheel.getWheel(), spinOne);
    }

    public void spinAllWheels() {
        for (Wheel wheel : wheels) {
            spinOneWheel(wheel);
        }
    }

    public boolean checkWin() {
        if ((wheel1.getSymbol() == wheel2.getSymbol()) && (wheel2.getSymbol() == wheel3.getSymbol()))
        {
            return true;
        } else {
            return false;
        }
    }

    public void payCredits(Player player) {
        int payout = wheels.get(0).getSymbol().getValue();
        player.winCredits(payout);
        playerCash += payout;
        credits -= payout;
    }






}
