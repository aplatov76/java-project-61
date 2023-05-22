package hexlet.code;

import java.util.Scanner;

public class Main {

    private static boolean firstGame(Scanner sc, String answerNotCorrectSuffix) {
        int a;
        boolean result = true;
        for(int i = 0; i < 3; i++) {
            a = (int) ( Math.random() * 33 );
            System.out.println("Question: " + a);
            String answer = sc.nextLine();

            if(answer.equals("yes")) {
                if(a % 2 == 0) {
                    System.out.println("Correct!");
                } else {
                    System.out.println(answerNotCorrectSuffix);
                    result = false;
                }
            }
            else if(answer.equals("no")) {
                if(a % 2 != 0){
                    System.out.println("Correct!");
                } else {
                    System.out.println(answerNotCorrectSuffix);
                    result = false;
                }
            } else {
                result = false;
            }
        }

        return result;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String userName;
        String answerNotCorrectSuffix = "It is not correct answer";

        System.out.println("Welcome to the Brain Games!\nMay I have your name?");
        userName = Cli.getUserName(sc);
        System.out.println("Hello, " + userName + "!");

        System.out.println("Please enter the game number and press Enter.\n" +
                "1 - Greet\n" +
                "0 - Exit");
        int taskNumber;

        taskNumber = sc.nextInt();
        sc.nextLine();

        switch (taskNumber){
            case 1 : {
                System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
                boolean res = firstGame(sc, answerNotCorrectSuffix);
                System.out.println(res ? "Congratulations" : "Let's try again");
                break;
            }
            case 0 : {

                break;
            }

            default: {

            }
        }
        sc.close();
    }
}
