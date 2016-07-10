package jp.co.biglobe.isp.Deck;

import jp.co.biglobe.isp.poker.Rank;
import jp.co.biglobe.isp.poker.Suit;
import jp.co.biglobe.isp.card.Joker;
import jp.co.biglobe.isp.card.PlainCard;
import jp.co.biglobe.isp.card.Card;

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
        cards.put(++number, new PlainCard(Suit.スペード, Rank.A));
        cards.put(++number, new PlainCard(Suit.スペード, Rank._2));
        cards.put(++number, new PlainCard(Suit.スペード, Rank._3));
        cards.put(++number, new PlainCard(Suit.スペード, Rank._4));
        cards.put(++number, new PlainCard(Suit.スペード, Rank._5));
        cards.put(++number, new PlainCard(Suit.スペード, Rank._6));
        cards.put(++number, new PlainCard(Suit.スペード, Rank._7));
        cards.put(++number, new PlainCard(Suit.スペード, Rank._8));
        cards.put(++number, new PlainCard(Suit.スペード, Rank._9));
        cards.put(++number, new PlainCard(Suit.スペード, Rank._10));
        cards.put(++number, new PlainCard(Suit.スペード, Rank._11));
        cards.put(++number, new PlainCard(Suit.スペード, Rank._12));
        cards.put(++number, new PlainCard(Suit.スペード, Rank._13));

        cards.put(++number, new PlainCard(Suit.ハート, Rank.A));
        cards.put(++number, new PlainCard(Suit.ハート, Rank._2));
        cards.put(++number, new PlainCard(Suit.ハート, Rank._3));
        cards.put(++number, new PlainCard(Suit.ハート, Rank._4));
        cards.put(++number, new PlainCard(Suit.ハート, Rank._5));
        cards.put(++number, new PlainCard(Suit.ハート, Rank._6));
        cards.put(++number, new PlainCard(Suit.ハート, Rank._7));
        cards.put(++number, new PlainCard(Suit.ハート, Rank._8));
        cards.put(++number, new PlainCard(Suit.ハート, Rank._9));
        cards.put(++number, new PlainCard(Suit.ハート, Rank._10));
        cards.put(++number, new PlainCard(Suit.ハート, Rank._11));
        cards.put(++number, new PlainCard(Suit.ハート, Rank._12));
        cards.put(++number, new PlainCard(Suit.ハート, Rank._13));

        cards.put(++number, new PlainCard(Suit.クローバー, Rank.A));
        cards.put(++number, new PlainCard(Suit.クローバー, Rank._2));
        cards.put(++number, new PlainCard(Suit.クローバー, Rank._3));
        cards.put(++number, new PlainCard(Suit.クローバー, Rank._4));
        cards.put(++number, new PlainCard(Suit.クローバー, Rank._5));
        cards.put(++number, new PlainCard(Suit.クローバー, Rank._6));
        cards.put(++number, new PlainCard(Suit.クローバー, Rank._7));
        cards.put(++number, new PlainCard(Suit.クローバー, Rank._8));
        cards.put(++number, new PlainCard(Suit.クローバー, Rank._9));
        cards.put(++number, new PlainCard(Suit.クローバー, Rank._10));
        cards.put(++number, new PlainCard(Suit.クローバー, Rank._11));
        cards.put(++number, new PlainCard(Suit.クローバー, Rank._12));
        cards.put(++number, new PlainCard(Suit.クローバー, Rank._13));
        
        cards.put(++number, new PlainCard(Suit.ダイヤ, Rank.A));
        cards.put(++number, new PlainCard(Suit.ダイヤ, Rank._2));
        cards.put(++number, new PlainCard(Suit.ダイヤ, Rank._3));
        cards.put(++number, new PlainCard(Suit.ダイヤ, Rank._4));
        cards.put(++number, new PlainCard(Suit.ダイヤ, Rank._5));
        cards.put(++number, new PlainCard(Suit.ダイヤ, Rank._6));
        cards.put(++number, new PlainCard(Suit.ダイヤ, Rank._7));
        cards.put(++number, new PlainCard(Suit.ダイヤ, Rank._8));
        cards.put(++number, new PlainCard(Suit.ダイヤ, Rank._9));
        cards.put(++number, new PlainCard(Suit.ダイヤ, Rank._10));
        cards.put(++number, new PlainCard(Suit.ダイヤ, Rank._11));
        cards.put(++number, new PlainCard(Suit.ダイヤ, Rank._12));
        cards.put(++number, new PlainCard(Suit.ダイヤ, Rank._13));

        cards.put(++number, Joker.JOKER);
        
        this.cards = cards;
    }

    public Card getCard(Integer key) {
        return cards.get(key);
    }

}
