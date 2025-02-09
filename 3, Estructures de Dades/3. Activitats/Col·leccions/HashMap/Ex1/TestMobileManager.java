package Collections.HashMap.Ex1;

public class TestMobileManager {
    public static void main(String[] args) {
        MobileManager mobileManager = new MobileManager();

        Mobile mobile1 = new Mobile("Apple", "iPhone 14", "671151545");
        Mobile mobile2 = new Mobile("Samsung", "Galaxy S22", "607061869");
        Mobile mobile3 = new Mobile("Google", "Pixel 9 Pro", "692975554");

        mobileManager.addMobile("43572893Z", mobile1);
        mobileManager.addMobile("79857392F", mobile2);
        mobileManager.addMobile("98754325A", mobile3);

        mobileManager.addMobile("43572893Z", new Mobile("OnePlus", "9 5G", "640538469"));

        System.out.println("\nCercant mòbil pel DNI '43572893Z':");
        mobileManager.searchMobileByDni("43572893Z");

        System.out.println("\nCercant DNI pel número de mòbil '640538469':");
        mobileManager.searchDniByNumber("640538469");

        System.out.println("\nEliminant mòbil pel DNI '98754325A':");
        mobileManager.removeMobile("98754325A");

        System.out.println("\nCercant mòbil pel DNI '98754325A' després d'eliminar-lo:");
        mobileManager.searchMobileByDni("98754325A");
    }
}