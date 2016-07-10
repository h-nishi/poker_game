package jp.co.biglobe.isp.hand;

import jp.co.biglobe.isp.Deck.Deck;
import jp.co.biglobe.isp.card.Card;
import jp.co.biglobe.isp.card.Joker;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 手札
 */
public class Hand {

    private final List<Card> cards;

    private Hand(List<Card> cards) {
        this.cards = cards;
    }

    public static Hand create(Deck deck) {
        return new Hand(deck.deal());
    }

    /**
     * イカサマして手札を作る
     */
    public static Hand cheating(List<Card> cards) {
        return new Hand(cards);
    }

    protected List<Card> getCards() {
        return cards;
    }

    public boolean isContainsJoker() {
        return cards.contains(Joker.JOKER);
    }

    public boolean hasGroupRank(int combCount, int groupCount) {
        return cards.stream()
                .map(Card::getRankValue)
                .collect(Collectors.groupingBy(v -> v))
                .entrySet()
                .stream()
                .filter(v -> v.getValue().size() == combCount)
                .count() == groupCount;
    }

    public boolean hasGroupSoot(int combCount, int groupCount) {
        return cards.stream()
                .map(Card::getSuit)
                .collect(Collectors.groupingBy(v -> v))
                .entrySet()
                .stream()
                .filter(v -> v.getValue().size() == combCount)
                .count() == groupCount;
    }

    public List<Integer> getRankList() {
        return cards.stream()
                .filter(Card::isPlainCard)
                .map(Card::getRankValue)
                .sorted(Comparator.naturalOrder())
                .collect(Collectors.toList());
    }


}
