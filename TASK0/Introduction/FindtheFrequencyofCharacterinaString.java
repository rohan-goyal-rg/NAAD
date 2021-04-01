package TASK0.Introduction;

import java.util.Scanner;

public class FindtheFrequencyofCharacterinaString {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the String");
        String str= sc.nextLine();
        System.out.println("Enter the Character for string");
        char ch= sc.next().charAt(0);
        int frequency = 0;

        for(int i = 0; i < str.length(); i++) {
            if(ch == str.charAt(i)) {
                ++frequency;
            }
        }
        System.out.println("Number of Frequency " + frequency);
    }
}
