package ib.exo4;

public class Complex {
    public int nb1,nb1i,nb2,nb2i;

    public Complex(int nb1, int nb1i, int nb2, int nb2i) {
        this.nb1 = nb1;
        this.nb1i = nb1i;
        this.nb2 = nb2;
        this.nb2i = nb2i;
    }

    /**
     * Clule la partie eelle
     * @return la somme des partie reelle
     */
    public int calculerPartieReelle(){
        return this.nb1 + this.nb2;
    }
    /**
     * Clule la partie imaginaire
     * @return la somme des partie imaginaire
     */
    public int calculerPartieImaginaire(){
        return this.nb1i + this.nb2i;
    }

    /**
     * Affiche le resultat des deux partie separee
     */
    public void affichage(){
        System.out.println("La somme est "+ calculerPartieReelle() +"+"+ calculerPartieImaginaire() +"i");
    }
}
