package TASK0.String;

import java.util.Scanner;

public class CapitalizethefirstcharacterofeachwordinaString {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the String");
        String str1=sc.nextLine();
        String firstLetter = str1.substring(0, 1);
        String remainingLetters = str1.substring(1, str1.length());
        firstLetter = firstLetter.toUpperCase();
        str1 = firstLetter + remainingLetters;
        System.out.println("String is : " + str1);
    }
}
