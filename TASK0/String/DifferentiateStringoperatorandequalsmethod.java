package TASK0.String;

import java.util.Scanner;

public class DifferentiateStringoperatorandequalsmethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first String");
        String str1 = sc.nextLine();
        System.out.println("Enter the Second String");
        String str2 = sc.nextLine();

        boolean result1 = (str1 == str2);
        System.out.println("Using == operator: " + result1);

        boolean result2 = str1.equals(str2);
        System.out.println("Using equals(): " + result2);

    }
}
