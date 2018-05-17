package club.theexperiment.diex;

/**
 * Created by 1806357 on 5/15/2018.
 */

public class Gaem {

    private Weapon wep;
    private int health;
    public Gaem() {
        this.wep = new Weapon(1,3);
        this.health = 100;
    }

    public boolean Damage(int a){
        this.health -= a;
        return this.health <= 0;
    }

    public int Attack(){
        MainActivity.dice.setSides(wep.getD());
        MainActivity.dice.setNumberOfDice(wep.getN());
        MainActivity.dice.roll();
        return MainActivity.dice.getTotal();
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
}
