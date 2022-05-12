package ib.exo3;

import ib.exo2.Somme;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Siasir votre nom");
        String nom = scanner.nextLine();
        System.out.println("Siasir le premier note");
        double note1 = scanner.nextDouble();
        System.out.println("Siasir la deuxieme note");
        double note2 = scanner.nextDouble();
        Student ibrahim = new Student(nom,note1,note2);
        ibrahim.show();
    }
}
