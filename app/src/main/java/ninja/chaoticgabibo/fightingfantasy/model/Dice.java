package ninja.chaoticgabibo.fightingfantasy.model;

import java.util.Random;

public class Dice {

    public static int rollDice(int dieCount) {
        // TODO check argument

        Random random = new Random();
        return random.nextInt(6 * dieCount) + 1;
    }

    public static int rollDie() {
        return rollDice(1);
    }

}
