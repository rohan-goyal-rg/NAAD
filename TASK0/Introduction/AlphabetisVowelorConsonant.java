package TASK0.Introduction;

import java.util.Scanner;

public class AlphabetisVowelorConsonant {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter The Character");
        char cha= sc.next().charAt(0);

        if (cha=='a' || cha=='e' || cha=='i' || cha=='o' || cha=='u'|| cha=='A' || cha=='E' || cha=='I' || cha=='O' || cha=='U')
            System.out.println(cha + "  is a Vowel");
        else
            System.out.println(cha + "  is a Consonant");
    }
}
