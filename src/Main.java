import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Zawodnik {
    private String imie;
    private int wiek;
    private String pozycja;
    private int numerKoszulki;

    public Zawodnik(String imie, int wiek, String pozycja, int numerKoszulki) {
        this.imie = imie;
        this.wiek = wiek;
        this.pozycja = pozycja;
        this.numerKoszulki = numerKoszulki;
    }

    public String getImie() {
        return imie;
    }

    public int getWiek() {
        return wiek;
    }

    public String getPozycja() {
        return pozycja;
    }

    public int getNumerKoszulki() {
        return numerKoszulki;
    }

    @Override
    public String toString() {
        return "Nr." + numerKoszulki + " " + imie + " (" + wiek + ")" + " - " + pozycja;
    }
}


public class Main {
    public static void main(String[] args) {

    }
}
