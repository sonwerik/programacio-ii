package Collections.HashSet.Ex1;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

class Player {
    private String dni;
    private Set<Integer> ticket;

    public Player(String dni) {
        this.dni = dni;
        this.ticket = new HashSet<>();
        generateTicket();
    }

    public String getDni() {
        return dni;
    }

    public Set<Integer> getTicket() {
        return ticket;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setTicket(Set<Integer> ticket) {
        this.ticket = ticket;
    }

    private void generateTicket() {
        Random rand = new Random();
        while (ticket.size() < 4) {
            ticket.add(rand.nextInt(101));
        }
    }

    public boolean hasWon(Set<Integer> drawnBalls) {
        return drawnBalls.containsAll(ticket);
    }

    @Override
    public String toString() {
        return "DNI: " + dni + ", Ticket: " + ticket;
    }
}