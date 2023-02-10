import java.util.Scanner;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;

public class Program {

    public static void main(String[] args) {
        //Card card1 = new Card("U+1F0A1");
        //Card card2 = new Card("U+1F0C4");
        System.out.println("Blackjack is a popular American casino game, now found throughout the world.\nIt is a banking game in which the aim of the player is to achieve a hand whose points total nearer to 21 than the banker's hand,\nbut without exceeding 21");
        //DeckOfCards deck = new DeckOfCards(list);
        //System.out.println(deck.tostring());
        //System.out.println(deck.pickRandom().tostring());     This line is to pick out a random cart out of the packet
        //System.out.println(deck.countBlack());
        //DeckOfCards tot = new DeckOfCards();
        //System.out.println(tot.tostring());
        //tot.shuffle();
        //tot.CardPrint();
        //System.out.println(tot.pickRandom().tostring());
        //System.out.println(tot.pickRandom().tostring());

        User user = new User("User");
        User bank = new User("Bank", true);
        System.out.println("You have " + user.getCoins() + " enjoy!");
        Scanner scan = new Scanner(System.in);
        int choice = -1;
        do{
            Hand hand = new Hand(user, bank);
            if (hand.isPlayerWins()){
                user.updateCoins(user.getCurrentBet()*2);
            }else if (hand.isTie()){
                user.updateCoins(user.getCurrentBet());
            }
            System.out.println("Current amount : " + user.getCoins());
            if (user.getCoins() != 0){

                System.out.println("Do you want to replay ? \n" + "1 = Yes \n" + "0 = No");
                choice = scan.nextInt();
            }
            bank.resetHand();
            user.resetHand();
        }while (choice != 0 && user.getCoins() != 0);
        if (user.getCoins() == 0){
            System.out.println("Game over, you lost");
        }
        System.out.println("Game finished.");
    }
}
