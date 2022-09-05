public class Student {
    String surname;
    String firstName;
    String middleInitial;
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
        System.out.println("supercalifragilistic expialidocious " + iAmAwesome);
    }
}
