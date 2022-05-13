package ib.exo6;

public class Test {
    public static void main(String[] args) {
        Personne personne = new Personne();
        personne.sayHello();
        Student student = new Student();
        student.goToClasse();
        student.setAge(15);
        student.displayAge();
        Teacher teacher = new Teacher();
        teacher.setAge(45);
        teacher.displayAge();
        teacher.explain();
    }
}
