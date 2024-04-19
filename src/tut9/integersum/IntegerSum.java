package tut9.integersum;

import tut9.utils.NumberFormatException;

import java.util.Scanner;

public class IntegerSum {
    public static void inputException(String string) {
        if(string.charAt(string.length()-1) == ' '){
            throw new NumberFormatException("Input must not have space in the end");
        }

        for(int i = 0 ; i < string.length();i++) {
            if(string.charAt(i) == ' '){
                if(string.charAt(i+1) == ' '){
                    throw new NumberFormatException("Input must have only 1 space between each number");
                }
            }
        }

        String[] numbers = string.split(" +");
        for(int i = 0 ; i < numbers.length;i++) {
            if(numbers[i].matches(".*[a-zA-Z]+.*") || numbers[i].matches(".*\\W+.*")){
                throw new NumberFormatException("Input must have only number");
            }
        }


    }
    public static void integerSum(String string){
        String[] numbers = string.split(" +");
        int sum = 0;
        for(int i = 0; i < numbers.length;i++){
            sum += Integer.parseInt(numbers[i]);
        }
        System.out.println(sum);

    }

}
