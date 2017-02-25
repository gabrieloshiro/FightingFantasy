package ninja.chaoticgabibo.fightingfantasy.model.character;

public class Hero extends Character {

    private int initialLuck;
    private int currentSLuck;

    private int provisions = 6;

    public Hero(int initialSkill, int initialStamina, int initialLuck) {
        super(initialSkill, initialStamina);
        this.initialLuck = initialLuck;
    }

    public int getInitialLuck() {
        return initialLuck;
    }

    public void setInitialLuck(int initialLuck) {
        this.initialLuck = initialLuck;
    }

    public int getCurrentSLuck() {
        return currentSLuck;
    }

    public void setCurrentSLuck(int currentSLuck) {
        this.currentSLuck = currentSLuck;
    }

    public void consumeProvision() {
        if (provisions < 1) {
            // TODO Error
        }

        
    }

}
