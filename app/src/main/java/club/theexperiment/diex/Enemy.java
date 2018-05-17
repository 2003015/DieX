package club.theexperiment.diex;

/**
 * Created by 1806357 on 5/16/2018.
 */

public class Enemy {
    private int health;
    private int D;
    private int N;
    public Enemy(int d, int n, int h){
        this.D = d;
        this.N = n;
        this.health = h;
    }

    public Enemy(){
        this.D = 1;
        this.N = 2;
        this.health = 20;
    }

    public boolean Damage(int a){
        this.health -= a;
        return this.health <= 0;
    }

    public int Attack(){
        MainActivity.dice.setSides(this.D);
        MainActivity.dice.setNumberOfDice(this.N);
        MainActivity.dice.roll();
        return MainActivity.dice.getTotal();
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getD() {
        return D;
    }

    public void setD(int d) {
        D = d;
    }

    public int getN() {
        return N;
    }

    public void setN(int n) {
        N = n;
    }
}
