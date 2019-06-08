package Zadanie2;

import java.util.Scanner;

public class MainAutostrada {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Autostrada autostrada = new Autostrada();

        // zmienna w której będziemy przechowywać komendę wpisaną przez użytkownika
        String komenda;
        do {
            // wczytujemy komendę
            System.out.println("Podaj komendę:");
            komenda = scanner.nextLine();

            String[] słowa = komenda.split(" "); // podziel zdanie po spacji.
            // jeśli wpisano "wjazd GD234 OSOBOWY"
            // to podział będzie następujący: [ "wjazd", "GD234", "OSOBOWY" ]

            // sprawdzamy co jest komendą
            if (słowa[0].equalsIgnoreCase("wjazd")) {
                // poza słowem "wjazd" komenda wymaga 2 parametrów, więc długość tablicy to minimum 3
                if (słowa.length >= 3) {
                    String nrRej = słowa[1];
                    String slowoTypPojazdu = słowa[2];

                    // jeśli posiadacie string który reprezentuje jakiegoś enuma
                    // np. OSOBOWY - enum OSOBOWY
                    // każdy enum ma metodę valueof - która zmienia string na enum
                    try {
                        TypPojazdu typ = TypPojazdu.valueOf(slowoTypPojazdu.toUpperCase());

                        autostrada.wjazdPojazduNaAutostradę(nrRej, typ);
                    }catch (IllegalArgumentException iae){
                        // wyjątek rzuci się jeśli zamiast np. Osobowy zrobię literówkę lub wpiszę słowo którego enuma nie mamy
                        // np. hulajnoga
                        System.err.println("Błąd, zły typ pojazdu.");
                    }
                }
            } else if (słowa[0].equalsIgnoreCase("wyjazd")) {
                // poza słowem "wyjazd" komenda wymaga 1 parametru, więc długość tablicy to minimum 2
                if (słowa.length >= 2) {
                    String nrRej = słowa[1];

                    System.out.println(autostrada.wyjazdPojazdu(nrRej));
                }
            } else if (słowa[0].equalsIgnoreCase("sprawdz")) {
                // poza słowem "sprawdz" komenda wymaga 1 parametru, więc długość tablicy to minimum 2
                if (słowa.length >= 2) {
                    String nrRej = słowa[1];

                    System.out.println(autostrada.znajdzPojazd(nrRej));
                }
            }

            // sprawdzamy czy użytkownik wpisał "zamknij"
        } while (!komenda.equalsIgnoreCase("zamknij"));
    }
 }

