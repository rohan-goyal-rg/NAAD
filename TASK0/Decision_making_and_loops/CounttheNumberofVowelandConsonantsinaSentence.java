package TASK0.Decision_making_and_loops;

import java.util.Scanner;

public class CounttheNumberofVowelandConsonantsinaSentence {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String");
        String str=sc.nextLine();
        int countVowel=0,
                countConsonant=0;

        str=str.trim();
        for (int i = 0; i <str.length() ; i++) {
            char ch=str.charAt(i);

            if (ch=='a'||ch=='A'||ch=='e'||ch=='E'
                    ||ch=='i'||ch=='I'||ch=='o'
                    ||ch=='O'||ch=='u'||ch=='U'){
                countVowel++;
            }
            else if (ch!=' '){
                countConsonant++;
            }

        }
        System.out.println("Number of vowel in \""+str+"\" is "+countVowel);
        System.out.println("Number of consonant in \""+str+"\" is "+countConsonant);
    }
}
