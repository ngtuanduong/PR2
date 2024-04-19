package tut9.pyramid;

import tut9.utils.NumberFormatException;

import java.util.Scanner;

public class Pyramid {
    public void halfRightPyramid(int numberOfRows){
        if(numberOfRows < 0) {
            throw new NumberFormatException("Number of rows must be integer.");
        }
        for(int i = 0 ; i < numberOfRows-1;i++){
            for(int j = 0 ; j < 100;j+=1){
                if (j == 0 || j == i*2 && i!= 0){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
        for(int i = 0 ; i < numberOfRows*2;i++){
            if(i % 2 == 0){
                System.out.print("*");
            }else{
                System.out.print(" ");
            }
        }
        System.out.println();

    }
    public void halfLeftPyramid(int numberOfRows) {
        if(numberOfRows < 0) {
            throw new NumberFormatException("Number of rows must be integer.");
        }
        for (int i = 0; i < numberOfRows-1;i++) {
            for(int j = 0; j < numberOfRows*10;j++) {
                if (j == numberOfRows * 2 - 2 || j == numberOfRows * 2 - 2 - i * 2) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for(int i = 0 ; i < numberOfRows*2;i++){
            if(i % 2 == 0){
                System.out.print("*");
            }else{
                System.out.print(" ");
            }
        }
        System.out.println();
    }
    public void fullPyramid(int numberOfRows){
        if(numberOfRows < 0) {
            throw new NumberFormatException("Number of rows must be integer.");
        }
        for(int i = 0 ; i < numberOfRows-1; i++){
            for(int j = 0; j < numberOfRows*10;j++){
                if( j == numberOfRows*2 - 2 + i*2 || j == numberOfRows*2 -2 - i*2){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for(int i = 0 ; i < numberOfRows*4-3;i++){
            if(i % 2 == 0){
                System.out.print("*");
            }else{
                System.out.print(" ");
            }
        }
        System.out.println();
    }

    public void invertedHalfRightPyramid (int rows) {
        if(rows < 0) {
            throw new NumberFormatException("Number of rows must be integer.");
        }
        for(int i = 0 ; i < rows*2;i++){
            if(i % 2 == 0){
                System.out.print("*");
            }else{
                System.out.print(" ");
            }
        }
        for(int i = rows ; i >= 0;i--){
            for(int j = 0 ; j < rows*2;j++){
                if (j == 0 || j == i*2 && i != 0){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
        System.out.println();

    }

    public void invertedHalfLeftPyramid(int rows) {
        if(rows < 0) {
            throw new NumberFormatException("Number of rows must be integer.");
        }
        for(int i = 0 ; i < rows*2;i++){
            if(i % 2 == 0){
                System.out.print("*");
            }else{
                System.out.print(" ");
            }
        }
        System.out.println();
        for (int i = rows-2; i >= 0;i--) {
            for(int j = 0; j < rows*10;j++) {
                if (j == rows * 2 - 2 || j == rows * 2 - 2 - i * 2) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public void invertedFullPyramid(int rows) {
        if(rows < 0) {
            throw new NumberFormatException("Number of rows must be integer.");
        }
        for(int i = 0 ; i < rows*4-3;i++){
            if(i % 2 == 0){
                System.out.print("*");
            }else{
                System.out.print(" ");
            }
        }
        System.out.println();

        for(int i = rows-2 ; i >=0 ; i--){
            for(int j = rows*4-4; j >= 0;j--){
                if( j == rows*2 - 2 + i*2 || j == rows*2 -2 - i*2){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }

    public int factorial(int n) {
        if(n == 0){
            return 1;
        }
        return n * factorial(n-1);
    }

    public void pascalPyramid(int rows) {
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < rows * 2 - i; j++) {
                System.out.print(" ");
            }
            for(int j = 0 ; j <= i; j++){
                if(factorial(i)/(factorial(i-j)*factorial(j)) < 10){
                    System.out.print("  " + factorial(i)/(factorial(i-j)*factorial(j)));
                }
                else{
                    System.out.print(" " + factorial(i)/(factorial(i-j)*factorial(j)));
                }
            }
            System.out.println();
        }
    }
    public void floydPyramid(int rows){
        int count = 1;
        for(int i = 0; i < rows; i++){
            for(int j = 0; j <= i; j++){
                System.out.print(count++ + " ");
            }
            System.out.println();
        }
    }
    public void pyramidMultipleOfTwo(int rows) {
        for(int i = 0; i < rows*2; i+=2) {


            for(int j = 0; j < rows*2 - i; j++) {
                System.out.print(" ");
            }
            int l = i / 2  ;
            for(int j = 0 ; j <= i; j++){
                if(j <= i / 2){
                    System.out.print( (int) Math.pow(2,j) + " ");
                }
                else{
                    System.out.print( (int) Math.pow(2,--l) + " ");
                }
            }
            System.out.println();
        }
    }

}
