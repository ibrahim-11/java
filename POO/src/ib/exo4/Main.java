package ib.exo4;

import ib.exo3.Student;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Premiere nombre");
        System.out.println();

        System.out.println("Entrer la partie réelle: ");
        int nb1 = scanner.nextInt();
        System.out.println("Entrer la partie imaginaire: ");
        int nb1i = scanner.nextInt();
        System.out.println();

        System.out.println("Deuxieme nombre");
        System.out.println("Entrer la partie réelle: ");
        int nb2 = scanner.nextInt();
        System.out.println("Entrer la partie imaginaire: ");
        int nb2i = scanner.nextInt();
        Complex my_somme = new Complex(nb1,nb1i,nb2,nb2i);
        my_somme.affichage();
    }

}
