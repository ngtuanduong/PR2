package tut12;

import java.util.ArrayList;

public class FibonacciNumber {
    private int value;
    static ArrayList<FibonacciNumber> stateStruc = new ArrayList<>();

    private FibonacciNumber(int index){
        if(index > stateStruc.size()) {
            new FibonacciNumber(index-1);
        }
        if(index == 0){
            value = 0;
        }else if(index == 1){
            value = 1;
        }else{
            value = stateStruc.get(index-1).getValue() + stateStruc.get(index-2).getValue();
        }
        stateStruc.add(this);

    }
    public static FibonacciNumber get(int index){
        if(index < 0){
            return null;
        }else{
            return lookUp(index);
        }
    }
    public int getValue(){
        return value;
    }
    private static FibonacciNumber lookUp(int index){
        if(index < stateStruc.size()){
            return stateStruc.get(index);
        }else{
            return new FibonacciNumber(index);
        }
    }

    @Override
    public String toString() {
        return "RecursiveClass{" +
                "value=" + value +
                '}';
    }
}
