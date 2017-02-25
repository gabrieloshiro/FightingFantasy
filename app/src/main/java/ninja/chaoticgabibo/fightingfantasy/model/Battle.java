package ninja.chaoticgabibo.fightingfantasy.model;

// TODO Add luck

import ninja.chaoticgabibo.fightingfantasy.model.character.Enemy;
import ninja.chaoticgabibo.fightingfantasy.model.character.Hero;

public class Battle {

    private Hero hero;
    private Enemy enemy;

    public Battle(Hero hero, Enemy enemy) {
        this.hero = hero;
        this.enemy = enemy;
    }

    public RoundResult calculateRound() {
        int enemyAttackStrength = Dice.rollDice(2) + enemy.getCurrentSkill();
        int heroAttackStrength = Dice.rollDice(2) + hero.getCurrentSkill();

        if (enemyAttackStrength == heroAttackStrength) {
            return RoundResult.TIE;
        }

        if (enemyAttackStrength > heroAttackStrength) {
            hero.receiveDamage();
            return RoundResult.HERO_LOST;
        }

        enemy.receiveDamage();
        return RoundResult.HERO_WON;
    }

    public enum RoundResult {
        TIE,
        HERO_WON,
        HERO_LOST
    }

}
