package POO.Practica;

public class Worker {
    private int hoursWorked;
    private String sector; // iron, stone or industry
    private boolean sold;

    public Worker(int hoursWorked, String sector, boolean sold) {
        this.hoursWorked = hoursWorked;
        this.sector = sector;
        this.sold = sold;
    }

    public Worker() {
        this.hoursWorked = 0;
        this.sector = "";
        this.sold = false;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    public boolean isSold() {
        return sold;
    }

    public void setSold(boolean sold) {
        this.sold = sold;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "hoursWorked=" + hoursWorked +
                ", sector='" + sector + '\'' +
                ", sold=" + sold +
                '}';
    }
}
