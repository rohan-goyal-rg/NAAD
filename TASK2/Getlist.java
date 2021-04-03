package TASK2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Getlist {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the String in form of semicolon ");
        String str=sc.nextLine();

        List<Integer> list=getList(str);

        for (int i : list) {
            System.out.print(i+" , ");
        }

    }
    static List<Integer> getList(String str){

        List<Integer> list=new ArrayList<>();

        for (String value : str.split(";")) {
            list.add(Integer.parseInt(value));
        }
        return list;
    }
}
