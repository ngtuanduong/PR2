package tut6;

public class MonsterApp {
    public static void main(String[] args) {
        Monster m1 = new Goblin("tuan",100,1,new Point2D(3,7));
        Monster m2 = new Vampire("duong",100,2,new Point2D(10,-4));
        Monster m3 = new Zombie("dinh",100,3,new Point2D(-10,9));

        printPosition(m1);

        m1.teleport(new Point2D(6,-1));

        printPosition(m1);


        System.out.println(m2.getName()+" health: "+m2.getHealth());
        m1.attack(m2);
        System.out.println(m2.getName()+" health: "+m2.getHealth());

        m2.attack(m3);

        System.out.println( m2.getName() + " attackPower: " + m2.getAttackPower());
        System.out.println( m3.getName() + " health: " + m3.getHealth());


    }

    public static void printPosition(Monster m) {
        System.out.println(m.getName() + "'s position = " + m.getPosition());
    }
}
