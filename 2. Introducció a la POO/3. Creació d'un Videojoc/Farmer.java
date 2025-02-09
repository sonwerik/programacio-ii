package POO.Practica;

public class Farmer {
    private int hoursWorked;
    private double cultivatedMeters;
    private boolean sold;

    public Farmer(int hoursWorked, int cultivatedMeters, boolean sold) {
        this.hoursWorked = hoursWorked;
        this.cultivatedMeters = cultivatedMeters;
        this.sold = sold;
    }

    public Farmer() {
        this.hoursWorked = 0;
        this.cultivatedMeters = 0.0;
        this.sold = false;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public double getCultivatedMeters() {
        return cultivatedMeters;
    }

    public void setCultivatedMeters(double cultivatedMeters) {
        this.cultivatedMeters = cultivatedMeters;
    }

    public boolean isSold() {
        return sold;
    }

    public void setSold(boolean sold) {
        this.sold = sold;
    }

    @Override
    public String toString() {
        return "Farmer{" +
                "hoursWorked=" + hoursWorked +
                ", cultivatedMeters=" + cultivatedMeters +
                ", sold=" + sold +
                '}';
    }
}