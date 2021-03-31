package TASK0.String;

import java.util.Scanner;

public class CheckifaStringisNumeric {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String str=sc.nextLine();

        if(str.matches("[0-9]+(\\.[0-9]+)?")){
            System.out.println("\""+str+"\" is a number");
        }
        else{

            System.out.println("\""+str+"\" is not a number");
        }
    }

}
