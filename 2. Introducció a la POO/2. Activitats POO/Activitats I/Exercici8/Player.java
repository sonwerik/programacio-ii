package POO.Activitats1.Exercici8;

public class Player {
    private final Position POSITION;
    private String name;

    public Player(Position position, String name) {
        this.POSITION = position;
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void moveRight() {
        POSITION.incX();
    }

    public void moveLeft() {
        POSITION.decX();
    }

    public void jump() {
        POSITION.incY();
    }

    public void fall() {
        POSITION.decY();
    }

    @Override
    public String toString() {
        return "Player: " + name + ", Position: " + POSITION;
    }
}