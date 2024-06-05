package tut6;

public class Zombie extends Monster {

    public Zombie (String name) {
        super(name);
    };
    public Zombie (String name,int health){
        super(name,health);
    }
    public Zombie (String name,int health,int attackPower){
        super(name,health,attackPower);
    }public Zombie (String name,int health,int attackPower,Point2D position){
        super(name,health,attackPower,position);
    }

    @Override
    public void attack(Monster m) {
        m.deceaseHealth(this.getAttackPower());
        System.out.println( this.getName() + "[" + this.getClass().getSimpleName() + "]"  + " attacked " + m.getName() + "[" + m.getClass().getSimpleName() + "]" );

    }


}
