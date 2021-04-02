package TASK0.String;

import java.util.Scanner;

public class Iteratethrougheachcharactersofthestring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String str1 = sc.nextLine();

        System.out.println("The Character string are");

        for (int i = 0; i < str1.length(); i++) {
            char str2 = str1.charAt(i);
            System.out.print(str2 + ", ");
        }
    }
}