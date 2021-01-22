import java.util.Scanner;

public class GuessingGameApp {

    public static void main(String[] args) {
        int number;
        int count;

        number = 7;
        count = 1;

        System.out.println("Guess a number.");

        Scanner inputScanner = new Scanner(System.in);
        int guessedNumber = inputScanner.nextInt();
        do {
            if (guessedNumber==number) {
                System.out.println("You win!");
                count = 2;
            } else if(guessedNumber==0) {
                System.out.println("Guess a number 1-9");
                guessedNumber = inputScanner.nextInt();
            }else {
                count++;
                System.out.println("Sorry guess again");
                guessedNumber = inputScanner.nextInt();
                if (guessedNumber==number){
                    System.out.println("You win!");
                    count = 2;}
                else{
                    System.out.println("Sorry out of guesses.");
                }
        }} while(count<2);







    }

}
