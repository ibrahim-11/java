package ib.exo5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrer l'abscisse P1: ");
        double x1 = scanner.nextDouble();
        System.out.println("Entrer l'oordonne P1: ");
        double y1 = scanner.nextDouble();
        System.out.println();
        System.out.println("Entrer l'abscisse P2: ");
        double x2 = scanner.nextDouble();
        System.out.println("Entrer l'oordonne P2: ");
        double y2 = scanner.nextDouble();

        Point p1 = new Point(x1,y1);
        Point p2 = new Point(x2,y2);

        System.out.println("P1("+p1.getX()+","+p1.getY()+")");
        System.out.println("P2("+p2.getX()+","+p2.getY()+")");

        p2.distance(p1);

    }
}
