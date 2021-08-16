package com.company;

import java.util.Comparator;
import java.util.Scanner;
// 16 - Write a Comparator that compares String objects by the number of words they contain.
// Consider any nonwhitespace string of characters to be a word
// For example, "Hello" comes before "I see", which comes before "You can do it"

public class StringComparator implements Comparator<String> {
    @Override
    public int compare(String s, String t1) {
        Scanner scanner = new Scanner(s);
        Scanner scanner1 = new Scanner(t1);
        int countS = 0;
        int countT1 = 0;

        while (scanner.hasNext()){
            countS++;
            scanner.next();
        }
        while (scanner1.hasNext()){
            countT1++;
            scanner1.next();
        }
        return countS - countT1;
    }
}
