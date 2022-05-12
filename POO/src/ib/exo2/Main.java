package ib.exo2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Siasir le premier nombre");
        int n1 = scanner.nextInt();
        System.out.println("Siasir le deuxieme nombre");
        int n2 = scanner.nextInt();
        Somme my_somme = new Somme(n1, n2);
        my_somme.sum();
    }
}
