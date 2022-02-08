package boyle.study_guide.maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
/*
 * Hackerrank Problem
 * 30 Days of Code - Day 8: Dictionaries and Maps - Java Solution
 * Time Complexity = ?
 * */

public class HackerrankDay8DictionariesAndMaps {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numberOfEntries = in.nextInt();
        Map<String, Integer> phoneBook = new HashMap<>();

        // populate map n number of times
        for (int i = 0; i < numberOfEntries; i++) {
            String name = in.next();
            int phone = in.nextInt();
            phoneBook.put(name, phone);
        }
        // query phonebook
        while (in.hasNext()) {
            String name = in.next();
            if (phoneBook.containsKey(name)) {
                System.out.println(name + "=" + phoneBook.get(name));
            } else {
                System.out.println("Not found");

            }
        }
        in.close();
    }
}