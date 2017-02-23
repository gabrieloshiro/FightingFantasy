package ninja.chaoticgabibo.fightingfantasy.model;

public class Hero {

    private int initialSkill;
    private int initialStamina;
    private int initialLuck;

    private int currentSkill;
    private int currentStamina;
    private int currentSLuck;

    public Hero(int initialSkill, int initialStamina, int initialLuck) {
        this.initialSkill = initialSkill;
        this.initialStamina = initialStamina;
        this.initialLuck = initialLuck;
    }

    public int getInitialSkill() {
        return initialSkill;
    }

    public void setInitialSkill(int initialSkill) {
        this.initialSkill = initialSkill;
    }

    public int getInitialStamina() {
        return initialStamina;
    }

    public void setInitialStamina(int initialStamina) {
        this.initialStamina = initialStamina;
    }

    public int getInitialLuck() {
        return initialLuck;
    }

    public void setInitialLuck(int initialLuck) {
        this.initialLuck = initialLuck;
    }

    public int getCurrentSkill() {
        return currentSkill;
    }

    public void setCurrentSkill(int currentSkill) {
        this.currentSkill = currentSkill;
    }

    public int getCurrentStamina() {
        return currentStamina;
    }

    public void setCurrentStamina(int currentStamina) {
        this.currentStamina = currentStamina;
    }

    public int getCurrentSLuck() {
        return currentSLuck;
    }

    public void setCurrentSLuck(int currentSLuck) {
        this.currentSLuck = currentSLuck;
    }
}
