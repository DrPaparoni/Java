public class Main {

    public static void main(String[] args) {
        StudentProfile profileOne = new StudentProfile("Eric", "Walter", "Software Programming", 3.0, 2020);
        StudentProfile profileTwo = new StudentProfile("Bob", "Barker", "Announcing", 4.0, 2024);

        profileTwo.incrementExpectedGraduationYear();
        System.out.println(profileTwo.expectedYearToGraduate);
    }
}
