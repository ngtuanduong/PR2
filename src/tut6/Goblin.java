package tut6;

public class Goblin extends Monster {

    public Goblin (String name) {
        super(name);
    };
    public Goblin (String name,int health){
        super(name,health);
    }
    public Goblin (String name,int health,int attackPower){
        super(name,health,attackPower);
    }public Goblin (String name,int health,int attackPower,Point2D position){
        super(name,health,attackPower,position);
    }

    @Override
    public void attack(Monster m) {
        m.deceaseHealth(this.getAttackPower());
        System.out.println( this.getName() + "[" + this.getClass().getSimpleName() + "]"  + " hit " + m.getName() + "[" + m.getClass().getSimpleName() + "]" );

    }





}
