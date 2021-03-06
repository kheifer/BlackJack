package game;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Guest on 8/3/17.
 */
public class Players {
    private List<Card> currentCards = new ArrayList<Card>();
    private int handTotal = 0;

    public Players (Card newCard) {
        this.currentCards.add(newCard);
    }

    //Setters
    public void setCurrentCards(Card currentCards) {
        this.currentCards.add(currentCards);
    }
    //Getters
    public int getHandTotal() {
        handTotal = 0;
        int aces = 0;
        for (int i = 0; i < currentCards.size(); i++) {
            int thisValue = currentCards.get(i).getValue();

            if(thisValue == 1){
                handTotal += 11;
                aces++;
            }else{
                handTotal += thisValue;
            }
        } while(handTotal > 21 && aces > 0){
            handTotal -=10;
            aces --;
        }
        return handTotal;
    }
    public String getCurrentCards() {
        return currentCards.toString();
    }
}
