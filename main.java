package com.company;



import java.util.*;
import java.io.*;

public class Main {


    public static void main (String[] args) {

        String original = "Hello, World!";
        String reversed = reverseString(original);
        System.out.println("Original: " + original);
        System.out.println("Reversed: " + reversed);


    }

    public static String reverseString(String str){
        char[] charArray = str.toCharArray();
        int left = 0;
        int right = charArray.length - 1;

        while (left<right){
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;

            left++;
            right--;
        }

        return new String(charArray);
    }

}
