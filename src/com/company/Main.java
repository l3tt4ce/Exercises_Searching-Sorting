package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        dictionaryLength();
    }

    // 14 - Write code to read a dictionary from a file, then prompt the ser for two words and tell the user how
    // many words in the dictionary fall between those two words.
    public static void dictionaryLength() throws FileNotFoundException {
        List<String> list = new LinkedList<>();
        Scanner scanner = new Scanner(new File("/home/l3ttuce/IdeaProjects/Exercises_Searching-Sorting/Dictionary.txt"));
        Scanner console = new Scanner(System.in);

        String word1 = "";
        String word2 = "";
        System.out.println("Type two words: ");
        String lineInput = console.nextLine();
        Scanner line = new Scanner(lineInput);
        while(line.hasNext()){
            word1 = line.next();
            word2 = line.next();
        }
        System.out.println(word1 + " " + word2);

        // need to store every word in Dictionary.txt in a List - or an array -
        // to then check how many words in between the two user input

        // wil try to use recursion for going through the file

        while(scanner.hasNextLine()){
            Scanner lineFile = new Scanner(scanner.nextLine());
            while(lineFile.hasNext()){
                list.add(lineFile.next());
            }
        }

        System.out.printf("There are %s words between your chosen words", Collections.binarySearch(list, word2) - Collections.binarySearch(list, word1));
    }
}
