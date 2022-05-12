package ib.exo6;

public class Personne {
protected int age;

    public Personne(int age) {
        this.age = age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void displayAge(){
        System.out.println("My age is :"+getAge()+"years old");
    }
}
