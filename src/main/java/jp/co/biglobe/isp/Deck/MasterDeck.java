package jp.co.biglobe.isp.deck;

import jp.co.biglobe.isp.card.Card;
import jp.co.biglobe.isp.card.Joker;
import jp.co.biglobe.isp.card.PlainCard;
import jp.co.biglobe.isp.poker.Rank;
import jp.co.biglobe.isp.poker.Suit;

import java.util.HashMap;
import java.util.Map;

/**
 * デッキ
 */
public class MasterDeck {

    private final Map<Integer, Card> cards;

    public MasterDeck() {

        Map<Integer, Card> cards = new HashMap<>();

        int number = 0;
        for (Suit s : Suit.values()) {
            for (Rank r : Rank.values()) {
                cards.put(++number, new PlainCard(s, r));
            }
        }
        cards.put(++number, Joker.JOKER);

        this.cards = cards;
    }

    public Card getCard(Integer key) {
        return cards.get(key);
    }

}
