package TASK0.Decision_making_and_loops;

import java.util.Scanner;

public class CheckWhetheraCharacterisAlphabetorNot {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter The  character");
        char ch=sc.next().charAt(0);

        if((ch>='A'&&ch<='Z')||(ch>='a'&&ch<='z')){
            System.out.println(ch+ " is an Alphabet");
        }
        else {
            System.out.println(ch+ " is not an Alphabet");
        }
    }
}
