import java.util.stream.Stream;

public enum SUITS {
    SPADES("A"),
    HEARTS("B"),
    DIAMONDS("C"),
    CLUBS("D");

    public static final int size;
    static {
        size = values().length;}
    private final String unicode;

    SUITS(String unicode){
        this.unicode = unicode;
    }

    public String getUnicode() {
        return unicode;
    }

}
