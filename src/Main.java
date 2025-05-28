import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] answers = {3,3,2,4};
        int guess;
        int count = 0;

        String[] questions = {  "What is the main function of a router",
                                "Which planet is known as the Red Planet?",
                                "Who wrote the play Romeo and Juliet?",
                                "What is the capital of Japan?"};



        String [][] options = {  {"1.Storing files","2.Encypting dsta","3.Directing Internet traffic","4.Managing passwords"},
                                 {"1.Erth","2.Venus","3.Mars","4.Jupiter"},
                                 {"1.Charles Dickens","2.William Shakespeare","3.Mark Twain","4. Jane Austen"},
                                 {"1.Seoul","2.Beijing","3.Bangkok","4.Tokiyo"}
                                   };


        System.out.println("*********************************");
        System.out.println("Welcome to the Java Quiz Game!");
        System.out.println("*********************************\n");

        for (int i=0; i< questions.length; i++){
            System.out.println(questions[i]);
            for (String option : options[i]){
                System.out.println(option);
            }
            System.out.print("Youe guess: ");
            guess = scanner.nextInt();
            if(guess == answers[i]){
                System.out.println("*********");
                System.out.println("CORRECT");
                System.out.println("*********");
                count++;

            }else {
                System.out.println("*********");
                System.out.println("WRONG");
                System.out.println("*********");
            }

            System.out.println();
        }
        System.out.println("You have got "+ count +" out of "+questions.length);

    }
}