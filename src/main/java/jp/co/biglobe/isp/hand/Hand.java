package jp.co.biglobe.isp.hand;

import jp.co.biglobe.isp.Deck.Deck;
import jp.co.biglobe.isp.trump.Trump;

import java.util.List;

/**
 * 手札
 */
public class Hand {

    private final List<Trump> trumps;

    private Hand(List<Trump> trumps) {
        this.trumps = trumps;
    }

    public static Hand create(Deck deck) {
        return new Hand(deck.deal());
    }

    /**
     * イカサマして手札を作る
     */
    public static Hand cheating(List<Trump> trumps) {
        return new Hand(trumps);
    }

    protected List<Trump> getTrumps() {
        return trumps;
    }

}
