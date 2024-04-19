package tut9.count_letters;

import tut8.course.Course;

import java.util.Scanner;

public class CountLetterApp {
    public static void main(String[] args) {
        CountLetters cl = new CountLetters();
        System.out.println("Type in a word: ");
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        cl.inputException(word);
        cl.countLetter(word);
    }
}
