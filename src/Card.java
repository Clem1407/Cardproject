
public class Card {
    private RANKS rank;
    private SUITS suit;

    public Card(String unicode) throws IllegalArgumentException {
        String[] cara = unicode.split("");
        for (SUITS s: SUITS.values()){
            if (s.getUnicode().equals(cara[5])){
                this.suit = s;
            }
        }
        for (RANKS r: RANKS.values()) {
            if (r.getUnicode().equals(cara[6])){
                this.rank = r;
            }
        }
    }
    Card(RANKS rank, SUITS suit) {
        this.rank = rank;
        this.suit = suit;
    }
    public RANKS getRank() {
        return rank;
    }
    //public SUITS getSuit(){
        //return suit;
    //}
    public String tostring() {
        return rank + " of " + suit;
        }
    }

