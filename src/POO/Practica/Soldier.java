package POO.Practica;

public class Soldier {
    private String specialization; // land, air, navy
    private int yearsOfExperience;
    private boolean hasBeenToWar;
    private boolean sold;

    public Soldier(String specialization, int yearsOfExperience, boolean hasBeenToWar, boolean sold) {
        this.specialization = specialization;
        this.yearsOfExperience = yearsOfExperience;
        this.hasBeenToWar = hasBeenToWar;
        this.sold = sold;
    }

    public Soldier() {
        this.specialization = "";
        this.yearsOfExperience = 0;
        this.hasBeenToWar = false;
        this.sold = false;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

    public boolean isHasBeenToWar() {
        return hasBeenToWar;
    }

    public void setHasBeenToWar(boolean hasBeenToWar) {
        this.hasBeenToWar = hasBeenToWar;
    }

    public boolean isSold() {
        return sold;
    }

    public void setSold(boolean sold) {
        this.sold = sold;
    }

    @Override
    public String toString() {
        return "Soldier{" +
                "specialization='" + specialization + '\'' +
                ", yearsOfExperience=" + yearsOfExperience +
                ", hasBeenToWar=" + hasBeenToWar +
                ", sold=" + sold +
                '}';
    }
}
