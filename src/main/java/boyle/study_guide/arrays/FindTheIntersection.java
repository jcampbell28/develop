package boyle.study_guide.arrays;

import java.util.HashSet;
/*
* Coderbyte Problem
* FindIntersection Java Solution
* Time Complexity = O(n+m)
* */

public class FindTheIntersection {

    public static String FindIntersection(String[] strArr) {
        String temp = "";

        String first = strArr[0];
        String second = strArr[1];

        String[] firstSplitArray = first.split(", ");
        String[] secondSplitArray = second.split(", ");

        HashSet<String> set = new HashSet();
        for (String s : firstSplitArray) {
            set.add(s);
        }
        for (String t : secondSplitArray) {
            if (set.contains(t)) {
                temp = temp + t + ",";
            }
        }

        temp = temp.substring(0, temp.length() - 1);

        if (temp.length() == 0) {
            temp = "false";
        }

        return temp;
    }

    public static void main(String[] args) {
        // keep this function call here
        String[] bothArrays = {"1, 3, 4, 7, 13, 15", "1, 2, 4, 13, 15"};
        System.out.print(FindIntersection(bothArrays));
    }
}