package pl.edu.ur.POLab3;

import java.util.Scanner;

public class z1i7 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj 2 liczby a, b dla ktorej chcesz sprawdzic warunki ");
        int a = input.nextInt();
        int b = input.nextInt();
        if (a < 0 ^ b > 0) {
            System.out.println("Obie liczby sa wieksze od zera lub obie sa mniejsze");
        } else {
            System.out.println("Jedna z liczba jest mniejsza od zera a druga wieksza");
        }
        if (b != 0) {
            System.out.println("Mozna wykonac dzielenie a/b gdzyz b jest rozne od 0");
        } else {
            System.out.println("Nie mozna wykonac dzielenia a/b gdyz b jest rowne 0");
        }
    }
}
