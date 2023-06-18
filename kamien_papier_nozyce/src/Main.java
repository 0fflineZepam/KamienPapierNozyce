import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("   ~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Witaj podejmij wybor sowojej broni:");
        System.out.println("1. kamien");
        System.out.println("2. papier");
        System.out.println("3. nozyce");

        List<String> listaNazw = new ArrayList<>();
        listaNazw.add("Pierwsza nazwa");
        listaNazw.add("Druga nazwa");
        listaNazw.add("Trzecia nazwa");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj liczbę: ");
        int liczba = scanner.nextInt();

        if (liczba >= 0 && liczba < listaNazw.size()) {
            String nazwa = listaNazw.get(liczba);
            System.out.println("Wprowadzona liczba: " + liczba);
            System.out.println("Nazwa z listy: " + nazwa);
        } else {
            System.out.println("Podano nieprawidłową liczbę.");
        }

        Random losowy = new Random();
        int wynik = losowy.nextInt(3) + 1; // Losowanie liczby od 1 do 5

        String tekst;

        switch (wynik) {
            case 1:
                tekst = "kamien";
                break;
            case 2:
                tekst = "papier";
                break;
            case 3:
                tekst = "nozyce";
                break;
            default:
                tekst = "Nieznany tekst";
                break;
        }

        System.out.println("Wybor Przeciwnika: " + tekst);

    }
}