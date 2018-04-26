package club.theexperiment.diex;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 1806357 on 4/20/2018.
 */

public class BotBoi {

    private int[][] store; //sides, usual amount rolled
    private List<Integer> usNumRolls1 = new ArrayList<>();
    private int[] usNumRollsTop1;
    private boolean changed1;


    public BotBoi(){
        store = new int[][]{{2,0},{4,0},{6,0},{8,0},{10,0},{12,0},{20,0},{0,0}};
        usNumRollsTop1 = new int[]{0,0,0};
        changed1 = true;
    }

    public void updateUsNumRolls1(int num){
        usNumRolls1.set(num-1, usNumRolls1.get(num-1)+1);
        changed1=true;
    }

    public int getUsNumRollsTop1(int num){
        if(changed1){
            for(int i = 0; i < usNumRolls1.size(); i++){
                if (usNumRolls1.get(i) > usNumRollsTop1[0]){
                    usNumRollsTop1[2] = usNumRollsTop1[1];
                    usNumRollsTop1[1] = usNumRollsTop1[0];
                    usNumRollsTop1[0] = usNumRolls1.get(i);
                }
            }
            changed1 = false;
        }
        return usNumRollsTop1[num];
    }

    //public void

}
