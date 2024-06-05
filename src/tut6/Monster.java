package tut6;

abstract public class Monster implements Movable,SpecialAbility {
    private String name;
    private int health = 100;
    private int attackPower = 1;
    private Point2D position = new Point2D();
    public Monster(){};
    public Monster(String name) {
        setName(name);
    }

    public Monster(String name, int health) {
        setName(name);
        this.health = health;
    }

    public Monster(String name, int health, int attackPower) {
        setName(name);
        this.health = health;
        this.attackPower = attackPower;
    }
    public Monster(String name, int health, int attackPower,Point2D position) {
        setName(name);
        this.health = health;
        this.attackPower = attackPower;
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(isValidName(name)) {
            this.name = name;
        }else{
            System.out.println("Can't set monster's name. Try again with correct format.");
        }
    }

    public int getHealth() {
        return health;
    }
    public void deceaseHealth(int amount) {
        if(health - amount  > 0) {
            health -= amount;
        }
        else{
            health = 0;
        }
    }

    public int getAttackPower() {
        return attackPower;
    }
    public void raiseAttackPower(int amount) {
        attackPower += amount;
    }

    public Point2D getPosition() {
        return position;
    }

    abstract public void attack(Monster m);

    private boolean isValidName(String s) {
        return s.matches("[a-zA-Z]+");
    }

    public String toString () {
        return "Monster[name = " + name + ",health = " + health + ",attackPower = " + attackPower + ",position = " + position;
    }


    @Override
    public void moveUp() {
        position.increaseX(1);
    }

    @Override
    public void moveDown() {
        position.increaseX(-1);
    }

    @Override
    public void moveLeft() {
        position.increaseY(-1);

    }

    @Override
    public void moveRight() {
        position.increaseY(1);
    }


    @Override
    public void transform() {
        System.out.println("Monster transformed.");
    }

    @Override
    public void teleport(Point2D position) {
        this.position = position;
    }
}
