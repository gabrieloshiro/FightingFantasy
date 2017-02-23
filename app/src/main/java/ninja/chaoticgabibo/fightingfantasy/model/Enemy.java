package ninja.chaoticgabibo.fightingfantasy.model;

public class Enemy {

    private int initialSkill;
    private int initialStamina;

    private int currentSkill;
    private int currentStamina;

    public Enemy(int initialSkill, int initialStamina) {
        this.initialSkill = initialSkill;
        this.initialStamina = initialStamina;
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
}
