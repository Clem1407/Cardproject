import java.util.stream.Stream;

public enum RANKS {
        ACE("1", 1),
        TWO("2", 2),
        THREE("3", 3),
        FOUR("4", 4),
        FIVE("5", 5),
        SIX("6", 6),
        SEVEN("7", 7),
        EIGHT("8", 8),
        NINE("9", 9),
        TEN("A", 10),
        JACK("B", 10),
        QUEEN("D", 10),
        KING("E", 10);

        public static final int size;
        static {
                size = values().length; }

        private final String unicode;
        private final int value;

        RANKS(String unicode, int value){
            this.unicode = unicode;
            this.value = value;
        }

        public String getUnicode() {
            return unicode;
        }
        public int getValue() {
                return value;
        }
}
