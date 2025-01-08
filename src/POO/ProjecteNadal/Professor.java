package POO.ProjecteNadal;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

class Professor {
    private String dni;
    private String firstName;
    private String lastName;
    private String email;
    private Map<String, Map<String, Boolean>> availability;  // Key: date -> key: timeSlot -> available

    public Professor(String dni, String firstName, String lastName, String email) {
        this.dni = dni;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.availability = new HashMap<>();
    }

    public String getDni() {
        return dni;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // Set availability for a given date and time slot
    public void setAvailability(String date, String timeSlot, boolean available) {
        availability.putIfAbsent(date, new HashMap<>());
        availability.get(date).put(timeSlot, available);
    }

    // Check if the professor is available for a given date and time slot
    public boolean isAvailable(String date, String timeSlot) {
        return availability.containsKey(date) && availability.get(date).getOrDefault(timeSlot, false);
    }

    // Get all availability for the professor (dates and time slots)
    public Map<String, Map<String, Boolean>> getAvailability() {
        return availability;
    }

    public Set<String> getAvailableDates() {
        return availability.keySet();
    }

    // Get the time slots for a specific date
    public Set<String> getAvailableTimeSlots(String date) {
        return availability.getOrDefault(date, new HashMap<>()).keySet();
    }
}
