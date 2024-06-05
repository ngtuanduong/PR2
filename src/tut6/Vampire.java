package tut6;

public class Vampire extends Monster {

    public Vampire (String name) {
        super(name);
    };
    public Vampire (String name,int health){
        super(name,health);
    }
    public Vampire (String name,int health,int attackPower){
        super(name,health,attackPower);
    }public Vampire (String name,int health,int attackPower,Point2D position){
        super(name,health,attackPower,position);
    }

    @Override
    public void attack(Monster m) {
        m.deceaseHealth(this.getAttackPower());
        System.out.println( this.getName() + "[" + this.getClass().getSimpleName() + "]"  + " bite " + m.getName() + "[" + m.getClass().getSimpleName() + "]" );

    }





}
