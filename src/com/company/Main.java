package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("src/com/company/text.txt");
        if(file.exists()){
            counter(file);
        }
        else {
            System.out.println("File does not exists!");
        }
    }

    public static void counter(File file) throws FileNotFoundException {
        Character [] vowels = {'a', 'o', 'e', 'u', 'i'};
        HashSet<Character> hashSet = new HashSet<>(Arrays.asList(vowels));
        int v=0, c=0;

        Scanner in = new Scanner(file);
        while(in.hasNext()){
            char [] word = in.next().toLowerCase(Locale.ROOT).toCharArray();
            for (char value : word) {
                if (value >= 'a' && value <= 'z') {
                    if (hashSet.contains(value)) ++v;
                    else ++c;
                }
            }
        }
        System.out.printf("Vowels: %d\nConsonants: %d", v, c);
    }
}
