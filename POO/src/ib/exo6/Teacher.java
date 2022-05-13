package ib.exo6;

public class Teacher extends Personne {
    private String subject;

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }



    public void explain(){
        System.out.println("Explanation begins");
    }
    public void displayAge(){
        System.out.println("My age is :"+getAge()+"years old");
    }
}
