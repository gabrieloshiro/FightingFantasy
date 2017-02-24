package ninja.chaoticgabibo.fightingfantasy.model;

public class Test {

    public static boolean isLucky(int current) {
        return test(current, 2);
    }

    public static boolean isSkilled(int current) {
        return test(current, 2);
    }

    public static boolean test(int current, int dieCount) {
        return Dice.rollDice(dieCount) <= current;
    }

}
