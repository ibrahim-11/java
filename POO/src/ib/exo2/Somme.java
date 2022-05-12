package ib.exo2;

public class Somme {
    // Attributs
    public  int n1;
    public  int n2;

    public Somme( ) {
        this.n1 = 5;
        this.n2 = 10;
    }
    public Somme(int n1, int n2) {
        this.n1 = n1;
        this.n2 = n2;
    }

    /**
     * Cette methode calcule la somme de deux
     * nombre et l'affiche lors de son appel
     */
    public  void sum(){
        System.out.println(n1+n2);

    }
}
