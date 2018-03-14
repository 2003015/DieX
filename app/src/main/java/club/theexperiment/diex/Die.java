package club.theexperiment.diex;

import java.util.Random;

public abstract class Die {

    private int sides;
    private int numberOfDice;
    private Random rand = new Random();
    private int total;
    private int[] rolls;
    public Die() {
        sides = 0;
        numberOfDice = 0;
    }

    public int getSides() {
        return sides;
    }

    public void setSides(int sides) {
        this.sides = sides;
    }

    public int getNumberOfDice() {
        return numberOfDice;
    }

    public void setNumberOfDice(int numberOfDice) {
        this.numberOfDice = numberOfDice;
    }

    public int getTotal() {return total;}

    public int[] getRolls() {return rolls;}

    public void roll(int r) {
        rolls = new int[this.sides];
        for(int x : rolls){
            rolls[x] = 0;
        }

        for (int i = 0; i < this.numberOfDice; i++) {
            int n = rand.nextInt(this.sides) + 1;
            total += n;
            rolls[n-1]++;
        }
    }
}
