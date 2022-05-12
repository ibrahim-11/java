package ib.exo6;

public class Teacher extends Personne {
    private String subject;

    public Teacher(int age) {
        super(age);
    }

    public void explain(){
        System.out.println("Explanation begins");
    }
}
