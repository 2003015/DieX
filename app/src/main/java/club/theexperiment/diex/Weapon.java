package club.theexperiment.diex;

/**
 * Created by 1806357 on 5/15/2018.
 */

public class Weapon {
    private int D;
    private int N;
    private String name;
    public Weapon(int d, int n){
        this.D = d;
        this.N = n;
    }

    public int getD() {
        return D;
    }

    public int getN() {
        return N;
    }

    public void setD(int d) {
        D = d;
    }

    public void setN(int n) {
        N = n;
    }
}
