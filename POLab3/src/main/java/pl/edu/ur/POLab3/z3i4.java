package pl.edu.ur.POLab3;

import java.util.Scanner;

public class z3i4 {

    public static long fibo(int x) {
        if (x == 1 || x == 2) {
            return 1;
        } else {
            return fibo(x - 1) + fibo(x - 2);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ktory wyraz ciagu chcesz obliczyc?");
        int a = input.nextInt();
        System.out.println(a + " wyraz ciagu wynosi " + fibo(a));
    }

}
