package jp.co.biglobe.isp.card;

import jp.co.biglobe.isp.poker.Rank;
import jp.co.biglobe.isp.poker.Suit;

/**
 * トランプ
 */
public class PlainCard implements Card {

    private final Suit suit;

    private final Rank rank;

    public PlainCard(Suit suit, Rank rank) {
        this.suit = suit;
        this.rank = rank;
    }

    @Override
    public Suit getSuit() {
        return suit;
    }

    @Override
    public int getRankValue() {
        return rank.getRank();
    }

    @Override
    public boolean isPlainCard() {
        return true;
    }
}
