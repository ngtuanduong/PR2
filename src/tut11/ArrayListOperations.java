package tut11;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListOperations {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(5);
        list.add(2.4);
        list.add(true);
        list.add("asd");

        for(int i = 0 ; i < list.size();i++) {
            System.out.println(list.get(i));
        }
    }

}
