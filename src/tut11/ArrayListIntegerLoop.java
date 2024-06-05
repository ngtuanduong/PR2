package tut11;

import java.util.ArrayList;

public class ArrayListIntegerLoop {
    public static void main(String[] args) {
        ArrayList<Integer> myArray = new ArrayList<>();

        for(int i = 1 ; i <= 10;i++) {
            myArray.add(i);
        }
        for(int i = 0 ; i < 10;i++) {
            System.out.print(myArray.get(i) + " ");
        }

    }
}
