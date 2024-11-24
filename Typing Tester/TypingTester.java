import java.util.Scanner;

public class TypingTester {
    public static double accuracy(String sentence, String mySentence) {
        double charsCorrect = 0;
        int minLength = Math.min(sentence.length(), mySentence.length());

        // Compare character by character
        for (int i = 0; i < minLength; i++) {
            if (sentence.charAt(i) == mySentence.charAt(i)) {
                charsCorrect++;
            }
        }

        // Calculate accuracy based on the total length of the original sentence
        return (charsCorrect / mySentence.length()) * 100;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sentence = "At 19, Rishabh Pant has gone through all the highs and lows of a cricketing career. A promising talent from Delhi, Pant came into reckoning after his exploits for India Under-19 in the 2016 World Cup. A dashing left-handed wicket-keeper batsman, he lit up the tournament with a blitzing 24-ball 75, the fastest half-century of the tournament, against Nepal and followed it up with a century against Namibia. India lost the title round - but came back with several positives - nothing bigger than the emergence of Pant.";
        System.out.println("\n\n"+sentence);
        System.out.print("\n\nStart typing: ");
        long startTime = System.currentTimeMillis();  
        String mySentence = sc.nextLine(); 
        
        // If the user doesn't type anything, ask for input again
        if (mySentence.length() == 0) {
            System.out.println("Please write the above sentence.");
            return; // Exit early to avoid further processing
        }   
        
        long endTime = System.currentTimeMillis();
        double seconds = (endTime - startTime) / 1000.0;
        
        // Calculate words per minute (wpm)
        double words = mySentence.split(" ").length;
        double wpm = (words / seconds) * 60;
        
        System.out.println("Your total words per minute: " + wpm);
        System.out.println("You took " + seconds + " seconds.");

        // Check accuracy
        if (sentence.equals(mySentence)) {
            System.out.println("Wow! Your accuracy is 100%");
        } else {
            System.out.println("Your accuracy is: " + accuracy(sentence, mySentence) + " %");
        }
        
        sc.close();
    }
}
