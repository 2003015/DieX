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

}
