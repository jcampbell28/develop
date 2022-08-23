package boyle.interviewquestions.glassdoor;

import java.util.Arrays;

/*
* Find out how many boats are needed for the amount of people on the boat.
* Each boat has a limit, all numbers are positive
* input [] = {150, 100, 80, 200}
* BoatLimit = 200
* Return number of boats needed to hold everyone.
* Output = 3
* O(n log n) Time
* O(1) Space
*/
public class BoatProblem {
    public static void main(String[] args) {
        int[] input = {150, 100, 80, 200};
        System.out.println(countNumberOfBoatsNeeded(input, 200));
    }
    public static int countNumberOfBoatsNeeded(int[] people, int boatLimit){
        Arrays.sort(people);
        int numberOfBoats = 0;
        int i = 0;
        int j = people.length -1;
        while(i <= j){
            if(people[i] + people[j] <= boatLimit){
                i++;
                j--;
            } else {
                j--;
            }
            numberOfBoats++;
        }
        return numberOfBoats;
    }
}
