import java.util.Arrays;
import java.util.Random;

public class Blackjack {
    public static void main(String[] args) {
        Deck deck = new Deck();
        deck.shuffle();
        Card oneCard = deck.getNextCard();
        System.out.println(oneCard.toString());
        System.out.println(oneCard.number);
        System.out.println(oneCard.value);
    }
}
class Deck {
    static String[] rank = {"2","3","4","5","6","7","8","9","10","J","Q","K","A"};
    static String[] suit = {"\u2660", "\u2661", "\u2662", "\u2663"};
    static int used = 0;
    Card[] deck = new Card[104];
    Deck(){
        //create previous 52 cards
        for (int i = 0; i < 13; i++) {
            for (int j = 0; j < 4; j++) {
                int value;
                if (i <= 8) {
                    value = Integer.parseInt(rank[i]);
                } else if (i == 12){
                    value = 1;
                } else
                    value = 10;
                deck[4 * i + j] = new Card(value, 4 * i + j, rank[i] + suit[j]);
            }
        }
        //create next 52 cards
        for (int i = 0; i < 13; i++) {
            for (int j = 0; j < 4; j++) {
                int value;
                if (i <= 8) {
                    value = Integer.parseInt(rank[i]);
                } else if (i == 12){
                    value = 1;
                } else
                    value = 10;
                deck[52 + (4 * i + j)] = new Card(value, 4 * i + j, rank[i] + suit[j]);
            }
        }
    }
    //shuffle the deck by random
    public void shuffle(){
        Card temp;
        for (int i = 0; i < deck.length; i++) {
            int index = (int)(104 * Math.random());
            temp = deck[i];
            deck[i] = deck[index];
            deck[index] = temp;
        }
    }

    public Card getNextCard(){
        used ++;
        return deck[used - 1];
    }
    public int getRemainingCards(){
        return 104 - used;
    }
}

class Card{
    int value;
    String shape;
    int number;
    Card(int value, int number, String shape){
        this.value = value;
        this.number = number;
        this.shape = shape;
    }
    public String toString(){
        return this.shape;
    }
}
