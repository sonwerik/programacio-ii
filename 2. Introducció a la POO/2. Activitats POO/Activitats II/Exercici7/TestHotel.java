package POO.Activitats2.Exercici7;

import java.time.LocalDate;

public class TestHotel {
    public static void main(String[] args) {
        Hotel hotel = new Hotel("Hotel Bellavista");

        Habitacio h1 = new Habitacio("Simple");
        h1.afegirServei(new Servei("Wifi"));
        h1.afegirServei(new Servei("Minibar"));

        Habitacio h2 = new Habitacio("Doble");
        h2.afegirServei(new Servei("Aire condicionat"));

        Habitacio h3 = new Habitacio("Suite");
        h3.afegirServei(new Servei("Jacuzzi"));
        h3.afegirServei(new Servei("Televisió 4K"));

        hotel.afegirHabitacio(h1);
        hotel.afegirHabitacio(h2);
        hotel.afegirHabitacio(h3);

        System.out.println("Reserva habitació 1: " +
                hotel.reservarHabitacio(LocalDate.of(2024, 12, 20), LocalDate.of(2024, 12, 25), h1));
        System.out.println("Reserva habitació 2: " +
                hotel.reservarHabitacio(LocalDate.of(2024, 12, 22), LocalDate.of(2024, 12, 23), h2));
        System.out.println("Reserva habitació 3: " +
                hotel.reservarHabitacio(LocalDate.of(2024, 12, 24), LocalDate.of(2024, 12, 28), h3));

        System.out.println("Habitacions disponibles entre 2024-12-21 i 2024-12-22: " +
                hotel.obtenirHabitacionsDisponibles(LocalDate.of(2024, 12, 21), LocalDate.of(2024, 12, 22)));

        hotel.mostrarServeisHabitacio(h3);

        System.out.println("Habitació 1 reservada el 2024-12-23? " +
                hotel.estaReservada(LocalDate.of(2024, 12, 23), h1));
    }
}