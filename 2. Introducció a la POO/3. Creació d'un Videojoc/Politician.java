package POO.Practica;

public class Politician {
    private String party;
    private String position; // Stores the person's role in the party
    private boolean sold;

    public Politician(String party, String position, boolean sold) {
        this.party = party;
        this.position = position;
        this.sold = sold;
    }

    public Politician() {
        this.party = "";
        this.position = "";
        this.sold = false;
    }

    public String getParty() {
        return party;
    }

    public void setParty(String party) {
        this.party = party;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public boolean isSold() {
        return sold;
    }

    public void setSold(boolean sold) {
        this.sold = sold;
    }

    @Override
    public String toString() {
        return "Politician{" +
                "party='" + party + '\'' +
                ", position='" + position + '\'' +
                ", sold=" + sold +
                '}';
    }
}