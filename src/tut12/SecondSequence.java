package tut12;

import java.util.ArrayList;

public class SecondSequence {
    private int value;
    static ArrayList<SecondSequence> stateStruc = new ArrayList<>();

    private SecondSequence(int index){
        if(index > stateStruc.size()) {
            new SecondSequence(index-1);
        }
        if(index == 0){
            value = 0;
        }else{
            value = stateStruc.get(index-1).getValue() +index;
        }
        stateStruc.add(this);

    }
    public static SecondSequence get(int index){
        return lookUp(index);
    }
    public int getValue(){
        return value;
    }
    private static SecondSequence lookUp(int index){
        if(index < stateStruc.size()){
            return stateStruc.get(index);
        }else{
            return new SecondSequence(index);
        }
    }

    @Override
    public String toString() {
        return "RecursiveClass{" +
                "value=" + value +
                '}';
    }
}
