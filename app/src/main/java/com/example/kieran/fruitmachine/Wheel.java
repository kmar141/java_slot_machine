package com.example.kieran.fruitmachine;




import java.util.ArrayList;

/**
 * Created by Kieran on 30/06/2017.
 */

public class Wheel {

    ArrayList<Symbol> symbols;


    public Wheel(){
        symbols = new ArrayList<Symbol>();
        populate();
    }

    public void populate(){
        for (Symbol symbol : Symbol.values()){
            symbols.add(symbol);
        }
    }

    public int wheelCount() {
        return symbols.size();
    }

    public ArrayList<Symbol> getWheel(){
        return symbols;
    }

    public Symbol getSymbol(){
        return symbols.get(0);
    }


}
