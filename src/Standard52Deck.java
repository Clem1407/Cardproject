import java.util.ArrayList;
import java.util.NoSuchElementException;

public class Standard52Deck extends DeckOfCards {

    private ArrayList<Card> deck = new ArrayList<>();

    public Standard52Deck(ArrayList<Card> deck){
        this.deck = deck;
    }
    public Standard52Deck()
    {
        for(RANKS rank: RANKS.values())
        {
            for(SUITS suit: SUITS.values())
            {

                deck.add(new Card(rank, suit));
                // BlueJ Error: actual and formal argument lists differ in length**
            }
        }
    }
}
