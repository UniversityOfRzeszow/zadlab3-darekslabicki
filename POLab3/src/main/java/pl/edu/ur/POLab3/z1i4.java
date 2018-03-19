package pl.edu.ur.POLab3;

public class z1i4 {

    public static void main(String[] args) {
        int a = 97, b = -20;
        System.out.println("Przesuniecie w lewo liczby 97 to " + (a << 3));
        System.out.println("Przesuniecie w prawo ze znakiem liczby 97 to " + (a >> 3));
        System.out.println("Przesuniecie w prawo bez znaku liczby 97 to " + (a >>> 3));
        System.out.println("Przesuniecie w lewo liczby -20 to " + (b << 3));
        System.out.println("Przesuniecie w prawo ze znakiem liczby -20 to " + (b >> 3));
        System.out.println("Przesuniecie w prawo bez znaku liczby -20 to " + (b >>> 3));
    }

}
