import java.util.Scanner;
public class GuessingGame {
    private final int number;
    private int attempts;

    public GuessingGame() {
        number = (int) (Math.random() * 100) + 1;

        attempts = 0;
    }
    public void play() {
        Scanner input = new Scanner(System.in);

        while (attempts < 10) {
            System.out.print("Enter your guess: ");
            int guess = input.nextInt();

            if (guess == number) {
                System.out.println("You guessed the number! Congratulations!");
                return;
            } else {

                if (guess < number) {
                    System.out.println("Your guess is too low. Try again.");
                } else {
                    System.out.println("Your guess is too high. Try again.");
                }
                attempts++;
            }
        }
        System.out.println("You ran out of attempts. The number was " + number + ". Better luck next time!");
    }

    public static void main(String[] args) {
        GuessingGame game = new GuessingGame();
        game.play();
    }
}