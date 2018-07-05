package sviprimarnibrojeviizmedjudvaunesenabroja;

import java.util.Scanner;

public class SviPrimarniBrojeviIzmedjuDvaUnesenaBroja {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //int i = 0;
        //int broj = 0;
        String primarniBrojevi = ""; //Prazan string
        System.out.println("Unesite broj do kojeg želite ispisati primarne brojeve:");
        int n = scanner.nextInt();
        scanner.close();
        for (int i = 1; i <= n; i++) {
            int brojac = 0;
            for (int broj = i; broj >= 1; broj--) {
                if (i % broj == 0) {
                    brojac = brojac + 1;
                }
            }
            if (brojac == 2) {
                
                primarniBrojevi = primarniBrojevi + i + " "; //Dodavanje primarnog broja stringu.
            }
        }
        System.out.println("Primarni brojevi između 1 i " + n + " su:");
        System.out.println(primarniBrojevi);
    }

}
