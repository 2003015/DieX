package club.theexperiment.diex;

/**
 * Created by 1806357 on 5/15/2018.
 */

public class Gaem {

    private Weapon wep;
    private int health;
    private dPreset die;
    public Gaem() {
        this.wep = new Weapon(3,1);
        this.health = 100;
        die = new dPreset(wep.getD());
    }

    public boolean Damage(int a){
        this.health -= a;
        return this.health <= 0;
    }

    public int Attack(){

        die.setNumberOfDice(wep.getN());
        die.roll();
        return die.getTotal();
    }

    public Weapon getWep() {
        return wep;
    }

    public void setWep(Weapon wep) {
        this.wep = wep;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public String getStrHealth(){
        return "Health: " + health;
    }
    public String getStrWep(){
        return "Weapon: " + wep.getN() + " d" + wep.getD();
    }
}
