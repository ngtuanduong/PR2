package tut9.integersum;

import java.util.Scanner;

public class IntegerSumApp {
    public static void main(String[] args) {
        IntegerSum is = new IntegerSum();
        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine();
        is.inputException(string);
        is.integerSum(string);
    }
}
