package jp.co.biglobe.isp.hand;

import jp.co.biglobe.isp.Deck.Deck;
import jp.co.biglobe.isp.trump.Trump;

import java.util.Comparator;
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

    public Trump getTrump(int index) {
        return trumps.get(index);
    }

    public boolean isOnePare() {
        return trumps.stream()
                .map(Trump::getRank)
                .collect(Collectors.groupingBy(v -> v))
                .entrySet()
                .stream()
                .filter(v -> v.getValue().size() == 2)
                .count() == 1;
    }

    public boolean isTwoPare() {
        return trumps.stream()
                .map(Trump::getRank)
                .collect(Collectors.groupingBy(v -> v))
                .entrySet()
                .stream()
                .filter(v -> v.getValue().size() == 2)
                .count() == 2;
    }

    public boolean isThreeCard() {
        return trumps.stream()
                .map(Trump::getRank)
                .collect(Collectors.groupingBy(v -> v))
                .entrySet()
                .stream()
                .filter(v -> v.getValue().size() == 3)
                .count() == 1;
    }

    public boolean isFourCard() {
        return trumps.stream()
                .map(Trump::getRank)
                .collect(Collectors.groupingBy(v -> v))
                .entrySet()
                .stream()
                .filter(v -> v.getValue().size() == 4)
                .count() == 1;
    }

    public boolean isFiveCard() {
        return trumps.stream()
                .map(Trump::getRank)
                .collect(Collectors.groupingBy(v -> v))
                .entrySet()
                .stream()
                .filter(v -> v.getValue().size() == 5)
                .count() == 1;
    }

    public boolean isFlash() {
        return trumps.stream()
                .map(Trump::getSoot)
                .collect(Collectors.groupingBy(v -> v))
                .entrySet()
                .stream()
                .filter(v -> v.getValue().size() == 5)
                .count() == 1;
    }

    public boolean isFullHouse() {
        return isThreeCard() && isOnePare();
    }

    public boolean isStraight() {
        List<Integer> list = trumps.stream()
                .map(v -> v.getRank().getRank())
                .sorted(Comparator.naturalOrder())
                .collect(Collectors.toList());
        return isStraightList(list) || isRoyal();
    }

    public boolean isRoyal() {
        List<Integer> list = trumps.stream()
                .map(v -> v.getRank().getRank())
                .sorted(Comparator.naturalOrder())
                .collect(Collectors.toList());
        return isRoyalList(list);
    }

    public boolean isStraightFlash() {
        return isStraight() && isFlash();
    }

    public boolean isRoyalStraightFlash() {
        return isRoyal() && isStraight() && isFlash();
    }

    private boolean isStraightList(List<Integer> list) {

        int e = -1;
        for (Integer i : list) {
            if (e == -1) {
                e = i;
            }

            if (e == i) {
                e++;
                continue;
            }
            return false;

        }
        return true;
    }

    private boolean isRoyalList(List<Integer> list) {

        int royal[] = {1, 10, 11, 12, 13};
        for (int cnt = 0; cnt < 5; cnt++) {
            if (royal[cnt] == list.get(cnt)) {
                continue;
            }
            return false;
        }
        return true;
    }


}
