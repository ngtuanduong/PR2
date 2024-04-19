package tut12;

import java.util.ArrayList;
import java.util.Vector;

public class FirstSequence {
    private int value;
    static ArrayList<FirstSequence> stateStruc = new ArrayList<>();

    private FirstSequence(int index){
        value = index * 2;
        if(index > stateStruc.size()) {
            new FirstSequence(index-1);
        }
        stateStruc.add(this);

    }
    public static FirstSequence get(int index){
        return lookUp(index);
    }
    public int getValue(){
        return value;
    }
    private static FirstSequence lookUp(int index){
        if(index < stateStruc.size()){
            return stateStruc.get(index);
        }else{
            return new FirstSequence(index);
        }
    }

    @Override
    public String toString() {
        return "RecursiveClass{" +
                "value=" + value +
                '}';
    }
}
