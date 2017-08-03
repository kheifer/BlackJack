package game;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Guest on 8/3/17.
 */
public class BlackJack {
    private String[] suits = {"Spades","Clubs","Hearts","Diamonds"};
    private String[] values = {"Ace", "2","3","4","5","6","7","8","9","10","Jack","Queen","King"};

    public List<String> getDeck() {
        return Deck;
    }

    private List<String> Deck = new ArrayList<String>();

    public BlackJack() {
        for (String suit: suits) {
            for (String value: values) {
                Deck.add(value + " of " + suit);
            }
        }

    }
}
