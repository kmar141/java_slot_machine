package com.example.kieran.fruitmachine;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static com.example.kieran.fruitmachine.Symbol.BELL;
import static org.junit.Assert.assertEquals;


/**
 * Created by Kieran on 30/06/2017.
 */

public class FruitMachineTest {

    Wheel wheel;
    Wheel wheel2;
    Wheel wheel3;
    Player player;
    FruitMachine fruitmachine;

    @Before
    public void setUp() throws Exception {
        wheel = new Wheel();
        player = new Player(50);


    }

    @Test
    public void testFullWheel() throws Exception {
        assertEquals(10, wheel.wheelCount());
        
    }

    @Test
    public void testPlayerFunds() throws Exception {
        assertEquals(50, player.getCash());

    }

    @Test
    public void testWheelSymbol() throws Exception {
        Wheel spyWheel = Mockito.spy(wheel);
        Mockito.when(spyWheel.getSymbol()).thenReturn(BELL);
        assertEquals(BELL, spyWheel.getSymbol());
    }

    @Test
    public void testPlayerWinCredits() throws Exception {
        Wheel spyWheel = Mockito.spy(wheel);
        Mockito.when(spyWheel.getSymbol()).thenReturn(BELL);
        fruitmachine.payCredits(player);
        assertEquals(52, player.getCash());


    }
}
