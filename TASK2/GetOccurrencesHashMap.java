package TASK2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class GetOccurrencesHashMap {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the String in form of semicolon ");
        String str=sc.nextLine();

        HashMap<Integer, Integer> hashMap=getOccurrencesHashMap(str);

        for (Map.Entry<Integer,Integer> entry: hashMap.entrySet()){
            System.out.print(entry.getKey()+"="+entry.getValue()+", ");
        }
    }

    static HashMap<Integer, Integer> getOccurrencesHashMap(String str) {
        HashMap<Integer,Integer> hashMap=new HashMap<>();
        for (int i = 0; i <str.length() ; i+=2) {
            if(hashMap.containsKey(str.charAt(i)-48)){
                hashMap.put(str.charAt(i)-48, hashMap.get(str.charAt(i)-48)+1);
            }
            else {
                hashMap.put(str.charAt(i)-48,1);
            }
        }
        return hashMap;
    }
}
