package tut9.count_letters;

import tut9.utils.InvalidInputException;
import tut9.utils.WordLengthException;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountLetters {


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
        else if(word.length() > 45){
            throw new WordLengthException("Word can not exceed 45 characters");

        }
        if(word.matches(".*\\W+.*") && word.matches(".*[1-9]+.*") ) {
            throw new InvalidInputException("Word can not contain special characters or numbers");
        }
        else if(word.matches(".*\\W+.*")) {
            throw new InvalidInputException("Word can not contain a special character");
        }else if(word.matches(".*[1-9]+.*")){
            throw new InvalidInputException("Word can not contain a number");
        }

    }

    public static void countLetter(String word){
        HashMap<Character,Integer> chars = new HashMap();

        for(int i = 0 ; i < word.length();i++) {

            char ch = word.charAt(i);

            if(chars.containsKey(ch)){
                chars.replace(ch,chars.get(ch),chars.get(ch) + 1);
            }
            else{
                chars.put(ch,1);
            }
        }

        for(Map.Entry<Character,Integer> entry : chars.entrySet()){
            System.out.println(entry);
        }

    }



}
