import java.util.ArrayList;
import java.util.Random;
import java.util.Collections;

public class DeckOfCards implements CleverDeck, ManipulableDeck {

    private ArrayList<Card> deck = new ArrayList<>();
    private Visible visible;
    private boolean ACE = false;

    public DeckOfCards(ArrayList<Card> deck){
        this.deck = deck;
        visible = Visible.Underside;
    }

    public String tostring() {
        StringBuilder deckouil = new StringBuilder();
        for (Card card : deck) {
            deckouil.append(card.tostring());
            deckouil.append("\n");
        }
        return deckouil.toString();
    }

    DeckOfCards()
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
    public DeckOfCards (ArrayList<Card> cards, Visible... visible){
        if (cards.size() > 0){
            deck = cards;
        }
        this.visible = visible.length > 0 ? visible[0] : Visible.Unfolded;
    }
    public void CardPrint()
    {
        for(Card c : deck)
        {
            System.out.println(c.tostring());
        }
    }
    public Card pickRandom() {
        Random rand = new Random();
        int random = rand.nextInt(deck.size());
        return deck.remove(random);
    }
    public ArrayList<Card> pickRandom(int times) {
        Random rand = new Random();
        ArrayList<Card> cards = new ArrayList<>();
        for (int i = 0; i < times; i++) {
            int random = rand.nextInt(deck.size());
            cards.add(deck.remove(random));
        }
        return cards;
    }
    public void shuffle()
    {
        // for each Card, pick another random card (0-51) and swap them
        for (int first = 0; first < deck.size(); first++)
        {
            // select a random number between 0 and 51
            Random random = new Random();
            int second = random.nextInt(deck.size());

            // swap current Card with randomly selected Card
            Card temp = deck.get(first);
            deck.set(first, deck.get(second));
            deck.set(second, temp);
        }
    }

    public void cut() {
            Random rand = new Random();
            int cut = rand.nextInt(deck.size()-1);
            ArrayList<Card> deckcut = new ArrayList<Card>();
            for(int i=0; i<deck.size(); i++) {
                deckcut.add(deck.get((cut+i)%deck.size()));
            }
            deck = deckcut;
    }
    public void reverse() {
        Collections.reverse(deck);
    }

    public void ChangeVisible (Visible visible){
        this.visible = visible;
    }
    public boolean isEmpty() {
        if (deck.size() < 1) {
            return true;
        }
        return false; }

    public void AddCard(Card card){
        deck.add(card);
    }
    public void AddCards(ArrayList<Card> cards){
        deck.addAll(cards);
    }

    public ArrayList<Card> getDeck() {
        return deck;
    }

    public void AddTop(Card c) {
        deck.add(c);
    }

    public void AddBottom(Card c) {
        deck.add(0, c);
    }

    public void AddIndex(Card c, int index) {
        deck.add(index, c);
    }

    public Card RemoveTop() {
        return deck.remove(deck.size()-1);
    }

    public Card RemoveBottom() {
        return deck.remove(0);
    }

    public Card RemoveIndex(int index) {
        return deck.remove(index);
    }

    public int countBlack() {
        int result = 0;
        for (Card card : deck) {
            int i = card.getRank().getValue();
            if (card.getRank().name().equals("ACE")) {
                this.ACE = true;
            }
            result += i;
        }
        if (this.ACE) {
            if (result <= 11) {
                result += 10;
            }
        }
        return result;
    }
}
