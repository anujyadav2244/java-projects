import java.util.*;

public class QuizApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Questions and Answers
        String[] questions = {
            "Q1 What is the orange part of an egg called?\nA) Yolk\nB) Shell\nC) Albumen\nD) Chalaza",
            "Q2 How many legs do insects have?\nA) Four\nB) Six\nC) Eight\nD) Ten",
            "Q3 What is a baby kangaroo called?\nA) Cub\nB) Pup\nC) Joey\nD) Calf",
            "Q4 What is the closest planet to the Sun?\nA) Venus\nB) Mars\nC) Mercury\nD) Earth",
            "Q5 In which country can you find the Eiffel Tower?\nA) Italy\nB) Spain\nC) France\nD) Germany",
            "Q6 How many days are there in a year?\nA) 365\nB) 366\nC) 360\nD) 364",
            "Q7 How many players are in a kabaddi team?\nA) Nine\nB) Eleven\nC) Ten\nD) Seven",
            "Q8 Where do polar bears live?\nA) Antarctica\nB) The Arctic\nC) Greenland\nD) Iceland",
            "Q9 Which is faster, light or sound?\nA) Light\nB) Sound",
            "Q10 How many letters are in the English alphabet?\nA) Twenty-four\nB) Twenty-five\nC) Twenty-six\nD) Twenty-seven"
        };

        char[] answers = {'A', 'B', 'C', 'C', 'C', 'A', 'D', 'B', 'A', 'C'};
        
        int correct = 0, incorrect = 0;

        // Quiz Loop
        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
            char ans = sc.next().toUpperCase().charAt(0); // Convert to uppercase for consistency
            if (ans == answers[i]) {
                correct++;
            } else {
                incorrect++;
            }
        }

        // Calculate Percentage
        double percent = (correct / 10.0) * 100;

        // Results
        System.out.println("Your total marks: " + correct + "/10");
        System.out.println("Correct answers: " + correct);
        System.out.println("Incorrect answers: " + incorrect);
        System.out.println("Your percentage: " + percent + "%");

        sc.close();
    }
}
