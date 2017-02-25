package ninja.chaoticgabibo.fightingfantasy.model.character;

public abstract class Character {

    public static final int DEFAULT_DAMAGE = 2;

    private int initialSkill;
    private int currentSkill;

    private int initialStamina;
    private int currentStamina;

    public Character(int initialSkill, int initialStamina) {
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

    public void receiveDamage(int damage) {
        currentStamina = currentStamina - damage;
    }

    public void receiveDamage() {
        receiveDamage(DEFAULT_DAMAGE);
    }

    /**
     * TODO Check "O ladrão da meia noite", existe uma criatura chamada Poltergeist que pode causar
     * dano mas tem stamina 0. A batalha funciona de um jeito diferente
     */
    public boolean isDead() {
        return currentStamina == 0;
    }

}