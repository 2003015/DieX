package club.theexperiment.diex;

import java.util.Random;

public abstract class Die {

    private int sides;
    private int numberOfDice;
    private Random rand = new Random();
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

    public void roll() {
        int[] rolls = new int[this.sides];
        int i = 0;
        while (i < this.numberOfDice) {


            int n = rand.nextInt(this.sides) + 1;

            rolls[i] = n;
        }
    }
}
