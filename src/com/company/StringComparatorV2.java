package com.company;

import java.util.Comparator;
import java.util.Scanner;

// 16 - Write a Comparator that compares String objects of a particular format.
// Each string is of a form such as "123456 Seatle, WA", beginning with a numeric token that is followed by additional text tokens
// Your job is to treat the first tokens as integers and compare in numerical order.
// You cannot simply ocmpare them using the strings' comapreTo method, since it would treat the numbers as text, not integers.
// For example, "276453 Helena, MT" is greater than "9847 New York, NY". Use a Scanner to tokenize the strings while comparing them.

public class StringComparatorV2 implements Comparator<String> {
    @Override
    public int compare(String s, String t1) {
        Scanner scanner = new Scanner(s);
        Scanner scanner1 = new Scanner(t1);

        int num = scanner.nextInt();
        int numt1 = scanner1.nextInt();

        return num - numt1;
    }
}
