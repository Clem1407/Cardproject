public interface ManipulableDeck {
        public void AddTop(Card c);
        public void AddBottom(Card c);
        public void AddIndex(Card c, int index);
        public Card RemoveTop();
        public Card RemoveBottom();
        public Card RemoveIndex(int index);
}
