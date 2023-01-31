package edu.wctc;
import java.util.Scanner;
public class Main {
    public static void runMyCode(){
        Scanner myAnswer = new Scanner(System.in);
        String repeat;
        int num;
        int total = 0;

        String[] questions = {"Do you prefer spicy or mild?", "Do you prefer tea or coffee?", "Do you prefer breakfest or lunch?", "Do you prefer summer or winter?", "Do you prefer paper or plastic?"};

        System.out.println("Welcome the the Preference quiz!");

        for(int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
            System.out.println("Enter 0 for the first option");
            System.out.println("Enter 1 for the second option");
            num = myAnswer.nextInt();

            if(num == 1){
                total++;
            }
        }

        if(total > 3){
            System.out.println("You prefer life to be calm and organized");
        }

        else if(total == 3){
            System.out.println("You prefer life to be spontaneous and active");
        }
        else if(total > 3){
            System.out.println("You prefer a good balance in life");
        }

    }
    public static void main(String[] args) {
        boolean answer = true;
        Scanner myRepeat = new Scanner(System.in);
        String repeat;

        while(answer){
            runMyCode();

            System.out.println("Would you like to play again?(Y / N)");
            repeat = myRepeat.nextLine();
            if (repeat.equals('y')){
                answer = true;
                runMyCode();
            }
            else {
                answer = false;
            }
        }

    }

}
