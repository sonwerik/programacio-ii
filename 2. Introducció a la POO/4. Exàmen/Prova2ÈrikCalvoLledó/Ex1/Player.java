package POO.Examen.ex1;

public class Player {
    private String name;
    private Weapon weapon;
    private Position position;
    private int health;
    private String status;

    public Player(String name, Position position) {
        this.name = "Default";
        this.position = position;
        this.health = 100;
        this.status = "ALIVE";
    }

    public Player(String name, Position position, Weapon weapon) {
        this.name = "Default";
        this.position = position;
        this.weapon = weapon;
        this.health = 100;
        this.status = "ALIVE";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void damage(int damage) {
        health -= damage;
    }

    public void moveTo(Position position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", weapon=" + weapon +
                ", position=" + position +
                ", health=" + health +
                ", status='" + status + '\'' +
                '}';
    }
}
