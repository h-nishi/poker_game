package jp.co.biglobe.isp.Deck;

import jp.co.biglobe.isp.card.Card;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

/**
 * デッキ
 */
public class Deck {

    public static int CARD_TOTAL_NUMBER = 53;

    private final LinkedList<Card> cards;

    public Deck() {
        this.cards = createDeck();
    }

    private LinkedList<Card> createDeck() {

        LinkedList<Card> cards = new LinkedList<>();
        MasterDeck masterDeck = new MasterDeck();
        Random rand = new Random();

        boolean count[] = new boolean[CARD_TOTAL_NUMBER];
        for (int i = 0; i < CARD_TOTAL_NUMBER; i++) {
            count[i] = false;
        }

        for (int i = 0; i < CARD_TOTAL_NUMBER; ) {
            int index = rand.nextInt(CARD_TOTAL_NUMBER);
            if (!count[index]) {
                cards.push(masterDeck.getCard(index));
                i++;
            }
        }
        return cards;
    }

    public List<Card> draw(int number) {
        List<Card> list = new ArrayList<>();
        for (int i = 0; i < number; i++) {
            if(cards.isEmpty()){
                throw new RuntimeException("もう、カードがないよ");
            }
            list.add(cards.pop());
        }
        return list;
    }

    public List<Card> deal() {
        
        List<Card> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            if(cards.isEmpty()){
                throw new RuntimeException("もう、カードがないよ");
            }
            list.add(cards.pop());
        }
        return list;
    }

}
