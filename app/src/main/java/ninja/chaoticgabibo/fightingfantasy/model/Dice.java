package ninja.chaoticgabibo.fightingfantasy.model;

public class Dice {

    public static int rollDice(int dieCount) {
        return 3 * dieCount;
    }

    public static int rollDie() {
        return rollDice(1);
    }

}
