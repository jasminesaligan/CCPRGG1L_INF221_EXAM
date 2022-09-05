public class Student {
    String surname;
    String firstName;
    char middleInitial;
    int dateOfBirth;
    int studentNumber;
    String studentEmailAddress;
    boolean iAmAwesome;

    public void sayMyStudentNumber() {
        System.out.println("My student number is " + studentNumber);
    }

    public void sayMyEmailAddress() {
        System.out.println("My email address is " + studentEmailAddress);
    }
    public void amIAwesome() {
        System.out.println("Am I supercalifragilistic expialidocious? " + iAmAwesome);
    }
}
