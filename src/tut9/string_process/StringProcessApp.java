package tut9.string_process;

import java.util.Scanner;

public class StringProcessApp {
    public static void main(String[] args) {

        StringProcess sp = new StringProcess();


//        System.out.println("Type in a string: ");
//        Scanner sc = new Scanner(System.in);
//        String s = sc.nextLine();\
        String s = "asdoiqwe";
        sp.inputException(s);
        String[] a = sp.divide(s,"i");
        for(int i = 0;i < a.length;i++){
            System.out.println(a[i]);
        }
        System.out.println();
        System.out.println(sp.reverse(s));

    }
}
