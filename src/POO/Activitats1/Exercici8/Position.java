package POO.Activitats1.Exercici8;

public class Position {
    private int x;
    private int y;

    public Position(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void incX() {
        this.x++;
    }

    public void incY() {
        this.y++;
    }

    public void decX() {
        this.x--;
    }

    public void decY() {
        this.y--;
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}