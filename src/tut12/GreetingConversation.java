package tut12;

public class GreetingConversation {

    private static GreetingConversation instance;

    private GreetingConversation(){};
    public static GreetingConversation getGreetingConversation(){
        if(instance == null){
            return instance = new GreetingConversation();
        }
        else{
            return instance;
        }
    }
    public  void print(){
        System.out.println("Get instance successfully");
    }

    public static void main(String[] args) {
//        Person p1 = new Person(1, "Quan Dang");
//        Person p2 = new Person(2, "Thuan Nguyen");
//        MobilePhone m1 = new MobilePhone("Apple", "M-ABC-123", Color.Yellow, 2008, false);
//        MobilePhone m2 = new MobilePhone("Apple", "M-DUX-872", Color.Red, 2021, true);
//        p1.setPhone(m1);
//        p2.setPhone(m2);
//        p1.greet();
//        p2.greet();
//        System.out.println(p1);
//        System.out.println(p2);
//
//        GreetingConversation gc = getGreetingConversation();
//
//        gc.print();
//
//        // TODO: test more methods (all the public ones)
//
//
//        FirstSequence fs = FirstSequence.get(3);
//        //print stateStruc
//        for(int i = 0 ; i < FirstSequence.stateStruc.size();i++){
//            System.out.println( i +" " + FirstSequence.stateStruc.get(i)+" ");
//        }
//        //print
//        System.out.println(fs);
//
//
//        SecondSequence sq = SecondSequence.get(5);
//        for(int i = 0 ; i < SecondSequence.stateStruc.size();i++){
//            System.out.println( i +" " + SecondSequence.stateStruc.get(i)+" ");
//        }
//
//        System.out.println(sq.getValue());

        FibonacciNumber fn = FibonacciNumber.get(2);
//        for(int i = 0 ; i < FibonacciNumber.stateStruc.size();i++){
//            System.out.println( i +" " + FibonacciNumber.stateStruc.get(i)+" ");
//        }
        System.out.println(fn);


    }
}
