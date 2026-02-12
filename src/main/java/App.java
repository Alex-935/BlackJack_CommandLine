import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        BlackJackDeck deck = new BlackJackDeck();
        Scanner scanner = new Scanner(System.in);
        BlackJack blackJack = new BlackJack(deck, scanner);
    }
}
