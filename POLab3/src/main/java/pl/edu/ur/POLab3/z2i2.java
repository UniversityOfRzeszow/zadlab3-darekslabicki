package pl.edu.ur.POLab3;

import java.util.Arrays;
import java.util.Scanner;

public class z2i2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj ktora metode chcesz wyswietlic");
        int n = input.nextInt();
        String s1 = new String("Happy ");
        String s2 = new String("Birthday");
        switch (n) {
            case 1:
                System.out.printf("s1 = %s\ns2 = %s\n\n", s1, s2);
                System.out.print("Result of s1.toChar Array() = ");
                System.out.println(s1.toCharArray());                //Zmienia String s1 w tablice 5 elementowa z kolejno wyrazami H,a,p,p,y
                System.out.print("Result of s2.toChar Array() = ");
                System.out.println(s2.toCharArray());                //Zmienia String s2 w tablice 8 elementowa z kolejno wyrazami B,i,r,t,h,d,a,y
                break;
            case 2:
                System.out.printf("s1 = %s\ns2 = %s\n\n", s1, s2);
                System.out.print("Result of s1.getBytes() = ");
                System.out.println(Arrays.toString(s1.getBytes()));                //Koduje String s1 w sekwencje byte'ów
                System.out.print("Result of s2.getBytes() = ");
                System.out.println(Arrays.toString(s2.getBytes()));                //Koduje String s2 w sekwencje byte'ów
                break;
            case 3:
                System.out.printf("s1 = %s\ns2 = %s\n\n", s1, s2);
                System.out.print("Result of s1.equals(Happy ) = ");
                System.out.println(s1.equals("Happy "));                //Porownuje dwa stringi zwraca prawda/fałsz
                System.out.print("Result of s2.equals(Christmas) = ");
                System.out.println(s2.equals("Christmas"));
                break;
            case 4:
                System.out.printf("s1 = %s\ns2 = %s\n\n", s1, s2);
                System.out.print("Result of s1.equals(HaPpY ) = ");
                System.out.println(s1.equalsIgnoreCase("HaPpY "));                //Porownuje dwa stringi zwraca prawda/fałsz bez zwracania uwagi na małe/duże litery
                System.out.print("Result of s2.equals(BIRTYHDAT) = ");
                System.out.println(s2.equalsIgnoreCase("BIRTHDAY"));
                break;
            case 5:
                System.out.printf("s1 = %s\ns2 = %s\n\n", s1, s2);              //Porownuje dwa stringi bazujac na wartosci pojedynczych znakow w Unicode
                System.out.print("Result of s1.compareTo(s1) = ");
                System.out.println(s1.compareTo(s1));                           //Zwraca 0 dla rownych    
                System.out.print("Result of s1.compareTo(s2) = ");
                System.out.println(s1.compareTo(s2));                           //Zwraca liczbe >0 dla mniejszy.comapreTo(wiekszy)
                System.out.print("Result of s2.compareTo(s1) = ");
                System.out.println(s2.compareTo(s1));                           //Zwraca liczby <0 dla wiekszy.compareTo(mniejszy)
                break;
            case 6:
                System.out.printf("s1 = %s\ns2 = %s\n\n", s1, s2);              //Porownuje dwa stringi bazujac na wartosci pojedynczych znakow w Unicode
                System.out.print("Result of s1.compareToIgnoraCase(HAPPY) = "); //Nie zwraca uwagi na male/duze litery
                System.out.println(s1.compareToIgnoreCase("HAPPY "));           //Zwraca 0 dla rownych    
                System.out.print("Result of s1.compareToIgnoreCAse(BIRTHDAY) = ");
                System.out.println(s1.compareToIgnoreCase("BIRTHDAY"));         //Zwraca liczbe >0 dla mniejszy.comapreTo(wiekszy)
                System.out.print("Result of birthDAY.compareToIgnoreCase(s1) = ");
                System.out.println("birthDAY".compareToIgnoreCase(s1));         //Zwraca liczby <0 dla wiekszy.compareTo(mniejszy)
                break;
            case 7:
                System.out.printf("s1 = %s\ns2 = %s\n\n", s1, s2);              //Zwraca index w danym ciagu do pierwszego napotkania podanego znaku
                System.out.print("Result of s1.indexOf('p') = ");
                System.out.println(s1.indexOf('p'));                            //Zwraca wartosc dodatnia 
                System.out.print("Result of s2.indexOf('g') = ");
                System.out.println(s2.indexOf('g'));                            //Zwraca -1 gdy znak nie wystepuje w stringu
                break;
            case 8:
                System.out.printf("s1 = %s\ns2 = %s\n\n", s1, s2);              //Zwraca index w danym ciagu do pierwszego napotkania podanego ciagu
                System.out.print("Result of s1.indexOf(ppy) = ");
                System.out.println(s1.indexOf("ppy"));                          //Zwraca wartosc dodatnia   
                System.out.print("Result of s2.indexOf(dayy) = ");
                System.out.println(s2.indexOf("dayy"));                         //Zwraca -1 gdy znak nie wystepuje w stringu
                break;
            case 9:
                System.out.printf("s1 = %s\ns2 = %s\n\n", s1, s2);              //Zwraca index w danym ciagu do ostatniego napotkania podanego znaku
                System.out.print("Result of s1.lastIndexOf('p') = ");
                System.out.println(s1.lastIndexOf('p'));                        //Zwraca wartosc dodatnia   
                System.out.print("Result of s2.lastIndexOf('g') = ");
                System.out.println(s2.lastIndexOf('g'));                        //Zwraca -1 gdy znak nie wystepuje w stringu
                break;
            case 10:
                System.out.printf("s1 = %s\ns2 = %s\n\n", s1, s2);              //Zwraca index w danym ciagu do ostatniego napotkania podanego ciagu
                System.out.print("Result of s1.lastIndexOf(ppy) = ");
                System.out.println(s1.indexOf("ppy"));                          //Zwraca wartosc dodatnia   
                System.out.print("Result of s2.lastIndexOf(dayy) = ");
                System.out.println(s2.indexOf("dayy"));                         //Zwraca -1 gdy znak nie wystepuje w stringu
                break;
            case 11:
                System.out.printf("s1 = %s\ns2 = %s\n\n", s1, s2);              //Zwraca ciag zaczynajacy sie od podanego indexu
                System.out.print("Result of s1.substring(3) = ");
                System.out.println(s1.substring(3));                        
                System.out.print("Result of s2.substring(5) = ");
                System.out.println(s2.substring(5));   
                break;
            case 12:
                System.out.printf("s1 = %s\ns2 = %s\n\n", s1, s2);              //Zwraca ciag zaczynajacy sie i konczacy od podanych indexow
                System.out.print("Result of s1.substring(2,4) = ");
                System.out.println(s1.substring(2,4));                        
                System.out.print("Result of s2.substring(1,6) = ");
                System.out.println(s2.substring(1,6));   
                break;
            case 13:
                System.out.printf("s1 = %s\ns2 = %s\n\n", s1, s2);              //Zmienia dany znak na inny
                System.out.print("Result of s1.replace('p','q') = ");
                System.out.println(s1.replace('p','q'));                        
                System.out.print("Result of s2.lastIndexOf('t','g') = ");
                System.out.println(s2.replace('t','g')); 
                break;
            case 14:
                System.out.printf("s1 = %s\n", s1);                             //Zwraca kopie stringa bez zbednej pustej przestrzeni
                System.out.print("Result of s1.trim() = ");
                System.out.println(s1.trim());
                break;
            case 15:
                System.out.printf("s1 = %s\n", s1);                             //Zwraca string zapisany w jedynie malymi literami
                System.out.print("Result of s1.trim() = ");
                System.out.println(s1.toLowerCase());
                break;
            case 16:
                System.out.printf("s1 = %s\n", s1);                             //Zwraca string zapisany w jedynie duzymi literami
                System.out.print("Result of s1.trim() = ");
                System.out.println(s1.toUpperCase());
                break;
            case 17:
                s2="acafacabad";
                System.out.printf("s2 = %s\n", s2);                             //Oddziela string na kilka innych wstawiajac za pierwszy podany parametr  ,
                System.out.print("Result of s2.split(a,5) = ");                 //Drugi parametr wyznacza krotnosc zastosowania metody
                System.out.println(Arrays.toString(s2.split("a",5)));
                break;
            case 18:
                s2="acafacabad";
                System.out.printf("s2 = %s\n", s2);                             //Jak poprzednio tylko bez ograniczen dla kazdego wystapienia parametru
                System.out.print("Result of s2.split(a) = ");                 
                System.out.println(Arrays.toString(s2.split("a")));
                break;
        }
    }

}
