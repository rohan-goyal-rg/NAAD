package TASK0.String;

import java.util.Scanner;

public class Checkifastringcontainsasubstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String str0 = sc.nextLine();
        System.out.println("Enter the Second String");
        String str1 = sc.nextLine();

        boolean result = str0.contains(str1);
        if (result) {
            System.out.println(str1 + " is present in the string  " + str0);
        } else {
            System.out.println(str1 + " is not present in the string  " + str0);
        }

    }
}
