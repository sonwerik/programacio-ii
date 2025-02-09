package Funcions;

import java.util.Scanner;

public class Ex12ConvertidorDeTemperatures {
    public static void main(String[] ignoredArgs) {
        Scanner sc = new Scanner(System.in);

        System.out.print("En quina magnitud vols entrar la temperatura? (Celsius, Farenheit, Kelvin): ");
        String magnitud = sc.next().toLowerCase();

        System.out.print("Entra el valor de la temperatura: ");
        double temperatura = sc.nextDouble();

        System.out.println("\nMenú de conversions: ");

        switch (magnitud) {
            case "celsius" -> {
                System.out.println("1. Celsius a Farenheit");
                System.out.println("2. Celsius a Kelvin");
            }
            case "farenheit" -> {
                System.out.println("1. Farenheit a Celsius");
                System.out.println("2. Farenheit a Kelvin");
            }
            case "kelvin" -> {
                System.out.println("1. Kelvin a Celsius");
                System.out.println("2. Kelvin a Farenheit");
            }
            default -> {
                System.out.println("Error: Magnitud desconeguda.");
                return;
            }
        }

        System.out.println("3. Sortir");
        System.out.print("\nEscull la conversió: ");

        int opcio = sc.nextInt();
        double resultat;

        switch (opcio) {
            case 1:
                if (magnitud.equals("celsius")) resultat = celsiusAFarenheit(temperatura);
                else if (magnitud.equals("farenheit")) resultat = farenheitACelsius(temperatura);
                else resultat = kelvinACelsius(temperatura);
                break;
            case 2:
                if (magnitud.equals("celsius")) resultat = celsiusAKelvin(temperatura);
                else if (magnitud.equals("farenheit")) resultat = farenheitAKelvin(temperatura);
                else resultat = kelvinAFarenheit(temperatura);
                break;
            case 3:
                System.out.println("Sortint del programa.");
                return;
            default:
                System.out.println("Opció no vàlida.");
                return;
        }

        System.out.println("Resultat: " + resultat);
    }

    public static double celsiusAFarenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static double celsiusAKelvin(double celsius) {
        return celsius + 273.15;
    }

    public static double farenheitACelsius(double farenheit) {
        return (farenheit - 32) * 5 / 9;
    }

    public static double farenheitAKelvin(double farenheit) {
        return celsiusAKelvin(farenheitACelsius(farenheit));
    }

    public static double kelvinACelsius(double kelvin) {
        return kelvin - 273.15;
    }

    public static double kelvinAFarenheit(double kelvin) {
        return celsiusAFarenheit(kelvinACelsius(kelvin));
    }
}