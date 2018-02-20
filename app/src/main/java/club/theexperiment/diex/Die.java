package club.theexperiment.diex;

public abstract class Die {

    private int sides;
    private int numberOfDice;

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

    }
}