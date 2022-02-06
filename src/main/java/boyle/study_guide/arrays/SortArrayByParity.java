package boyle.study_guide.arrays;

import java.util.Arrays;

/*
 * LeetCode Problem
 * https://leetcode.com/problems/sort-array-by-parity/
 * Sort Array By Parity Java Solution
 * Time Complexity = O(n)
 * Space Complexity = O(n)
 * */
public class SortArrayByParity {

    public static int[] sortArray(int[] nums) {
        int[] solution = new int[nums.length];
        int startingIndex = 0;
        int endingIndex = nums.length - 1;
        for (int i : nums) {
            if (i % 2 == 0) {
                solution[startingIndex] = i;
                startingIndex++;
            } else {
                solution[endingIndex] = i;
                endingIndex--;
            }
        }
        return solution;
    }

    public static void main(String[] args) {
        int[] arraySample = {3,1,2,4};
        System.out.print(Arrays.toString(sortArray(arraySample)));
    }
}
