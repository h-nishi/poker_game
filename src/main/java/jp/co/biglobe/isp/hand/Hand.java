package jp.co.biglobe.isp.hand;

import jp.co.biglobe.isp.Deck.Deck;
import jp.co.biglobe.isp.trump.Joker;
import jp.co.biglobe.isp.trump.Trump;

import java.util.List;
import java.util.stream.Collectors;

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

    public boolean isContainsJoker() {
        return trumps.contains(Joker.JOKER);
    }

    public boolean hasGroupRank(int combCount, int groupCount) {
        return trumps.stream()
                .map(Trump::getRankValue)
                .collect(Collectors.groupingBy(v -> v))
                .entrySet()
                .stream()
                .filter(v -> v.getValue().size() == combCount)
                .count() == groupCount;
    }

    public boolean hasGroupSoot(int combCount, int groupCount) {
        return trumps.stream()
                .map(Trump::getSoot)
                .collect(Collectors.groupingBy(v -> v))
                .entrySet()
                .stream()
                .filter(v -> v.getValue().size() == combCount)
                .count() == groupCount;
    }


}
