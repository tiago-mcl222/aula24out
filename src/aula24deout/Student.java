package aula24deout;

public class Student extends PersonClass {

    String StudentNumber;
    String nif;

    public Student(String name, String StudentNumber, String nif) {
        this.nif = nif;
        this.StudentNumber = StudentNumber;
        super.name = name;
    }

    public String getStudentNumber() {
        return StudentNumber;
    }

    public String getNif() {
        return nif;
    }

    public static void main(String[] args) {
        Person person = new Student("Aluno", "192837465", "33339999" );
        person.getName();
        ((Student)person).getStudentNumber();
        ((Student)person).getNif();

        System.out.println("Person: " + person.getName() + " " + ((Student)person).getStudentNumber() + " " + ((Student)person).getNif() );

    }
}

