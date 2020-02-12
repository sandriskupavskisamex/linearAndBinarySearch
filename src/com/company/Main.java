package com.company;

import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException{

        String sample = Files.readString(Paths.get("words.txt"), Charset.forName("windows-1252"));
        String[] arr = sample.split("\n");
        List<String> list = Arrays.asList(arr);

//        The below lines are here to test smaller input sizes
//        list = list.subList(0, list.size()/2);
//        list = list.subList(0, list.size()/2);
//        list = list.subList(0, list.size()/2);
//        list = list.subList(0, list.size()/2);

        String randomWordToFind;

        int rangeForRandom = list.size() + 1;

        LinearSearch linearSearch = new LinearSearch(list);
        BinarySearch binarySearch = new BinarySearch(list);

        System.out.println("Looking for strings in a list that's the length of " + list.size() + "\n");

        long startTime = System.currentTimeMillis();
        for(int i = 0; i < 10000; i++) {
            randomWordToFind = list.get( (int) (Math.floor(Math.random() * rangeForRandom)));
            linearSearch.search(randomWordToFind);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("It took " + (endTime - startTime) + " milliseconds for Linear search\n");

        startTime = System.currentTimeMillis();
        for(int i = 0; i < 10000; i++) {
            randomWordToFind = list.get( (int) (Math.floor(Math.random() * rangeForRandom)));
            binarySearch.search(randomWordToFind);
        }
        endTime = System.currentTimeMillis();
        System.out.println("It took " + (endTime - startTime) + " milliseconds for Binary search\n");

    }
}
