import java.util.ArrayList;
import java.util.List;

public class Deck {

    private List<BlackJackCard> deck = new ArrayList<>(0);
    private String[] suits = {"clubs, diamonds, hearts, spades"};
    private String[] faces = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13"};

    public Deck() {

        for (int suit = 0; suit < 4; suit++) {
            for (int face = 0; face < 13; face++) {
                deck.add(new BlackJackCard(suit, face));
            }
        }
    }
}
