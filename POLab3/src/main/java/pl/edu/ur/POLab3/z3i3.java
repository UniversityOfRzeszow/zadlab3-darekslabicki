package pl.edu.ur.POLab3;

import java.util.Scanner;

public class z3i3 {

    public static long potrek(int x, int y) {
        if (y == 0) {
            return 1;
        } else if (y % 2 == 1) {
            return x * potrek(x, y - 1);
        } else {
            long a = potrek(x, y / 2);
            return a * a;
        }

    }

    public static long potite(int x, int y) {
        long w = 1;

        while (y > 0) {
            if (y % 2 == 1) {
                w *= x;
            }
            x *= x;
            y /= 2;
        }
        return w;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj podstawe potegi");
        int a = input.nextInt();
        System.out.println("Podaj wykladnik potegi");
        int b = input.nextInt();
        System.out.println("Wynik: " + potrek(a, b));
        System.out.println("Wynik: " + potite(a, b));
    }

}
