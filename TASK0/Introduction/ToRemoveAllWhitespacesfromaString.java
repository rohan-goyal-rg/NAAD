package TASK0.Introduction;

import java.util.Scanner;

public class ToRemoveAllWhitespacesfromaString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String str=sc.nextLine();
        str = str.trim();

        String newStr="";
        for (int i = 0; i <str.length() ; i++) {
            if(!(str.charAt(i)==' ')){
            newStr+=str.charAt(i);}
        }

        System.out.println(newStr);
    }
}
