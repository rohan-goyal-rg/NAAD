package TASK0.String;

import java.util.Scanner;

public class CompareStrings {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the two String");
        String str1=sc.nextLine();
        String str2=sc.nextLine();
        if(str1.equals(str2))
            System.out.println("Strings are equal");
        else
            System.out.println("Strings are not equal");

    }
}
