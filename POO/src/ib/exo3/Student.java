package ib.exo3;

public class Student {
    public String nom;
    public double note1,note2;

    public Student() {
        this.nom = "Ibrahim";
        this.note1 = 15;
        this.note2 = 17;
    }

    public Student(String nom, double note1, double note2) {
        this.nom = nom;
        this.note1 = note1;
        this.note2 = note2;
    }

    /**
     * Cette methode calcule la moyenne de
     * note1 et note2 et le renvoie
     */
    public double calcAverage(){
        return  (this.note1+this.note2)/2;
    }
    /**

     *  affiche lors de son appel  la moyenne note1 et note2 et le nom
     */
    public void show(){
        System.out.println(" Nom        :"+ this.nom +"\n La moyenne : " + calcAverage());
    }
}
