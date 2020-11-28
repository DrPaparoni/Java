import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
       String question = "Which anime is my favorite?";
       String choiceOne = "dragon ball z";
       String choiceTwo = "jojo";
       String choiceThree = "one piece";

       String correctAnswer = choiceTwo;

       // Print statement asking the question
        System.out.println(question);
        // Print statement giving the answer choices
        System.out.println("Choose one of the following: " +
                choiceOne + ", " + choiceTwo + ", or " + choiceThree + ".");

        // Have the user input an answer
        Scanner scanner = new Scanner(System.in);
        // Retrieve the user's input
        String input = scanner.next();

        // If the user's input matches the correctAnswer...
        // then the user is correct and we want to print a congrats message.
        if(correctAnswer.equals(input.toLowerCase())){
            System.out.println("Congrats! that's the correct answer");
        } else {
            System.out.println("You are incorrect. The correct answer is " + correctAnswer);
        }
    }
}
