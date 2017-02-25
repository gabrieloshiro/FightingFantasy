package ninja.chaoticgabibo.fightingfantasy.usecase;

import ninja.chaoticgabibo.fightingfantasy.model.Dice;
import ninja.chaoticgabibo.fightingfantasy.model.character.Hero;

public class CreateHeroUseCase {

    public Hero createRandomHero() {
        return new Hero(Dice.rollDie() + 6, Dice.rollDice(2) + 12, Dice.rollDie() + 6);
    }

    public Hero createVignorFirestorm() {
        return new Hero(9, 22, 7);
    }

    public Hero createHaldarEriksson() {
        return new Hero(8, 18, 12);
    }

    public Hero createOpheliaLapwing() {
        return new Hero(11, 19, 8);
    }




}
