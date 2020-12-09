import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String grade ="";
        double credit1;
        double credit2;
        double credit3;
        double credit4;
        double gradeValue=0;
        double totPtsClass1=0;
        double totPtsClass2=0;
        double totPtsClass3=0;
        double totPtsClass4=0;
        double totPts=0;
        double totCredits=0;
        double gpa;   //Declaring Variables

        Scanner console = new Scanner(System.in);  //Prepares console for inputs
        System.out.println("Please enter number of credits for class 1 (numerical)");
        credit1 = console.nextDouble();  //Takes the user's input for the variable
        System.out.println("Please enter your grade for class 1 (Letter grade)");
        grade = console.next().toUpperCase(); //Next input is grade.
        gradeValue = getGradeValue(grade, gradeValue); //Passes grade and gradeValue into getGradeValue method
        totPtsClass1 = gradeValue * credit1;

        System.out.println("Please enter number of credits for class 2 (numerical)");
        credit2 = console.nextDouble();  //Takes the user's input for the variable
        System.out.println("Please enter your grade for class 2 (Letter grade)");
        grade = console.next().toUpperCase(); //Next input is grade.
        gradeValue = getGradeValue(grade, gradeValue);
        totPtsClass2 = gradeValue * credit2;

        System.out.println("Please enter number of credits for class 3 (numerical)");
        credit3 = console.nextDouble();  //Takes the user's input for the variable
        System.out.println("Please enter your grade for class 3 (Letter grade)");
        grade = console.next().toUpperCase(); //Next input is grade.
        gradeValue = getGradeValue(grade, gradeValue);
        totPtsClass3 = gradeValue * credit3;

        System.out.println("Please enter number of credits for class 4 (numerical)");
        credit4 = console.nextDouble();  //Takes the user's input for the variable
        System.out.println("Please enter your grade for class 4 (Letter grade)");
        grade = console.next().toUpperCase(); //Next input is grade.
        gradeValue = getGradeValue(grade, gradeValue);
        totPtsClass4 = gradeValue * credit4;

        totPts=totPtsClass1+totPtsClass2+totPtsClass3+totPtsClass4;
        totCredits=credit1+credit2+credit3+credit4;
        gpa=totPts/totCredits; //Calculates average gpa based on all 4 classes

        System.out.printf("Your GPA is: %.2f\n", + gpa); // Rounds final gpa to decimal
    }

    private static double getGradeValue(String grade, double gradeValue) {//Calculates GPA value from grade
        if (grade.equals("A"))
            gradeValue =4.00;
        else if (grade.equals("A-"))
            gradeValue =3.67;
        else if (grade.equals("B+"))
            gradeValue =3.33;
        else if (grade.equals("B"))
            gradeValue =3.00;
        else if (grade.equals("B-"))
            gradeValue =2.67;
        else if (grade.equals("C+"))
            gradeValue =2.33;
        else if (grade.equals("C"))
            gradeValue =2.00;
        else if (grade.equals("C-"))
            gradeValue =1.33;
        else if (grade.equals("D"))
            gradeValue =1.00;
        else if (grade.equals("F"))
            gradeValue =0.00;
        else
            System.out.println("Invalid Grade");
        return gradeValue;
    }
}
