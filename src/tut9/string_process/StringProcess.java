package tut9.string_process;

import tut9.utils.InvalidInputException;
import tut9.utils.WordLengthException;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StringProcess {
    public static void inputException(String word){
        if(word == null){
            throw new WordLengthException("Word can not be null");
        }
        else if(word.equals("")){
            throw new WordLengthException("Word can not be empty");
        }
        else if(word.matches(" +")){
            throw new WordLengthException("Word can not only contain space");
        }

    }
    public String reverse(String s) {
        StringBuilder sb = new StringBuilder();
        for(int i = s.length()-1;i >= 0;i--) {
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }
    private static boolean isVowel(char c){
        return c == 'a' || c == 'e' ||c == 'i' ||c == 'o' ||c == 'u' ;
    }
    public int vowelsCount(String s){
        int count = 0;

        for(int i = 0; i < s.length();i++) {
            if( isVowel(s.charAt(i)) ){
                count++;
            }
        }

        return count;
    }
    public int consonantsCount(String s){
        int count = 0;

        for(int i = 0; i < s.length();i++){
            if( !isVowel(s.charAt(i)) ){
                count++;
            }
        }
        return count;
    }

    public void oddPosition(String s) {
        for(int i = 0; i < s.length();i++){
            if(i % 2 != 0){
                System.out.print(s.charAt(i) + " ");
            }
        }
        System.out.println();
    }

    public void evenPosition(String s) {
        for(int i = 0; i < s.length();i++){
            if(i % 2 == 0){
                System.out.print(s.charAt(i) + " ");
            }
        }
        System.out.println();
    }

    public int countUpperCase(String s) {
        int count=0;
        for(int i = 0; i < s.length();i++){
            if(Character.isUpperCase(s.charAt(i))){
                count++;
            }
        }
        return count;
    }

    public int countLowerCase(String s) {
        int count=0;
        for(int i = 0; i < s.length();i++){
            if(Character.isLowerCase(s.charAt(i))){
                count++;
            }
        }
        return count;
    }

    public String subString(String s,int pos,int length){
        if(pos + length > s.length()){
            throw new InvalidInputException("Out of bound");
        }
        StringBuilder sb = new StringBuilder();
        for(int i = pos; i < pos + length;i++) {
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }

    public int firstOccur(String s,String sub){


        for(int i = 0 ; i < s.length();i++) {
            for(int j = 0; j < s.length();j++){
                StringBuilder sb = new StringBuilder();
                sb.append(j);
                if(sb.toString() == sub){
                    return i;
                }
            }
        }
        return -1;
    }
    public int lastOccur(String s,String sub){


        for(int i = s.length() - 1 ; i >=0 ;i--) {
            for(int j = s.length() - 1; j >= 0 ;j--){
                StringBuilder sb = new StringBuilder();
                sb.append(j);
                if(sb.toString() == sub){
                    return i;
                }
            }
        }
        return -1;
    }
    public String[] divide(String s,String seperator){
        return s.split(seperator);
    }
}
