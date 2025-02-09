package Collections.HashMap.Ex1;

import java.util.HashMap;

class MobileManager {
    private HashMap<String, Mobile> mobiles;

    public MobileManager() {
        mobiles = new HashMap<>();
    }

    public void addMobile(String dni, Mobile mobile) {
        if (!mobiles.containsKey(dni)) {
            mobiles.put(dni, mobile);
            System.out.println("Mòbil afegit correctament per al DNI " + dni);
        } else {
            System.out.println("Error: El DNI " + dni + " ja està registrat.");
        }
    }

    public void removeMobile(String dni) {
        if (mobiles.containsKey(dni)) {
            mobiles.remove(dni);
            System.out.println("Mòbil eliminat correctament per al DNI " + dni);
        } else {
            System.out.println("Error: No es va trobar cap mòbil amb el DNI " + dni);
        }
    }

    public void searchMobileByDni(String dni) {
        if (mobiles.containsKey(dni)) {
            System.out.println("Mòbil trobat: " + mobiles.get(dni));
        } else {
            System.out.println("No es va trobar cap mòbil amb el DNI " + dni);
        }
    }

    public void searchDniByNumber(String number) {
        boolean found = false;
        for (String dni : mobiles.keySet()) {
            if (mobiles.get(dni).getNumber().equals(number)) {
                System.out.println("El número de mòbil " + number + " pertany al DNI " + dni);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("No es va trobar cap mòbil amb el número " + number);
        }
    }
}