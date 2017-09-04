package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj pierwszą liczbę: ");
        int a = in.nextInt();
        System.out.println("Podaj drugą liczbę - większą od pierwszej: ");
        int b = in.nextInt();
        int a1 = a;
        int a2 = a;
        int a3 = a;
        int z = b - a;
        if (a >= b) {
            System.out.print("Pierwsza liczba musi być mniejsza od drugiej");
        }
        else {
            int aw = 0;
            while (aw < z) {
               aw++;
               a1 += a + aw;
            }
            int ad = 0;
            do {
              ad++;
              a2 += ad +ad;

            }
            while (ad < z);
            for(int i = 1; i <= z; i++){
                a3 += a + i;

            }
            System.out.println(a1);
            System.out.println(a2);
            System.out.println(a3);

        }
    }
}