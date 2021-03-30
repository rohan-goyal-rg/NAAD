package TASK0.Decision_making_and_loops;

public class DisplayAlphabetsAtoZusingloop {
    public static void main(String[] args) {
        char ch='A';
        for (int i = 'A'; i <='Z' ; i++) {
            System.out.print(ch+",");
            ch+=1;
        }
    }
}
