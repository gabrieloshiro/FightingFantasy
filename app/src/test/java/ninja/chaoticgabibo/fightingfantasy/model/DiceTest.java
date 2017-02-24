package ninja.chaoticgabibo.fightingfantasy.model;

import org.junit.Test;

import static org.junit.Assert.assertTrue;


public class DiceTest {

    @Test
    public void rollDice() {
        for (int i = 1; i < 1000; i++) {
            int roll = Dice.rollDice(i);
            assertTrue("Roll " + roll + " with " + i + " dice.", roll > 0 && roll <= i * 6);
        }
    }

    @Test
    public void rollDie() {
        for (int i = 0; i < 100; i++) {
            int roll = Dice.rollDie();
            assertTrue("Roll " + roll + " with 1 die.", roll > 0 && roll < 7);
        }
    }


}