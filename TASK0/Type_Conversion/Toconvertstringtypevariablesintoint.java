package TASK0.Type_Conversion;

import java.util.Scanner;

public class Toconvertstringtypevariablesintoint {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string");
        String str=sc.nextLine();

        try {
            System.out.println("The integer value of String "+str+" is " +Integer.parseInt(str));

        }catch (Exception e){
            System.out.println(e.toString());
        }
    }
}
