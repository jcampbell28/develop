package boyle.algoexpert.easy;

import java.util.Arrays;

public class NonConstructibleChange {

    public static void main(String[] args) {
        int[] coins = {5,7,1,1,2,3,22};
        //int[] coins = {1,1,4,5};

        nonConstructibleChange(coins);
    }

    public static int nonConstructibleChange(int[] coins) {
        Arrays.sort(coins);
        int change = 0;

        for (int i = 0; i < coins.length; i++) {
            if (coins[i] > change + 1) {
                System.out.println(change + 1);
                return change + 1;
            }
            change += coins[i];
        }
        System.out.println(change + 1);
        return change + 1;
    }
}


