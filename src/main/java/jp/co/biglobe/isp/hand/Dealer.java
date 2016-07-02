package jp.co.biglobe.isp.hand;

import jp.co.biglobe.isp.trump.Trump;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * ディーラー
 */
public class Dealer {

    public static WinningHand judgeHand(Hand hand) {

        if (isRoyalStraightFlush(hand)) {
            return WinningHand.ロイヤルストレートフラッシュ;
        }

        if (isFiveCard(hand)) {
            return WinningHand.ファイブカード;
        }

        if (isStraightFlush(hand)) {
            return WinningHand.ストレートフラッシ;
        }

        if (isFourCard(hand)) {
            return WinningHand.フォーカード;
        }

        if (isFullHouse(hand)) {
            return WinningHand.フルハウス;
        }

        if (isFlush(hand)) {
            return WinningHand.フラッシュ;
        }

        if (isStraight(hand)) {
            return WinningHand.ストレート;
        }

        if (isThreeCard(hand)) {
            return WinningHand.スリーカード;
        }

        if (isTwoPare(hand)) {
            return WinningHand.ツーペア;
        }

        if (isOnePare(hand)) {
            return WinningHand.ワンペア;
        }

        return WinningHand.ノーペア;
    }

    private static boolean isOnePare(Hand hand) {
        return hand.getTrumps().stream()
                .map(Trump::getRank)
                .collect(Collectors.groupingBy(v -> v))
                .entrySet()
                .stream()
                .filter(v -> v.getValue().size() == 2)
                .count() == 1;
    }

    private static boolean isTwoPare(Hand hand) {
        return hand.getTrumps().stream()
                .map(Trump::getRank)
                .collect(Collectors.groupingBy(v -> v))
                .entrySet()
                .stream()
                .filter(v -> v.getValue().size() == 2)
                .count() == 2;
    }

    private static boolean isThreeCard(Hand hand) {
        return hand.getTrumps().stream()
                .map(Trump::getRank)
                .collect(Collectors.groupingBy(v -> v))
                .entrySet()
                .stream()
                .filter(v -> v.getValue().size() == 3)
                .count() == 1;
    }

    private static boolean isFourCard(Hand hand) {
        return hand.getTrumps().stream()
                .map(Trump::getRank)
                .collect(Collectors.groupingBy(v -> v))
                .entrySet()
                .stream()
                .filter(v -> v.getValue().size() == 4)
                .count() == 1;
    }

    private static boolean isFiveCard(Hand hand) {
        return hand.getTrumps().stream()
                .map(Trump::getRank)
                .collect(Collectors.groupingBy(v -> v))
                .entrySet()
                .stream()
                .filter(v -> v.getValue().size() == 5)
                .count() == 1;
    }

    private static boolean isFlush(Hand hand) {
        return hand.getTrumps().stream()
                .map(Trump::getSoot)
                .collect(Collectors.groupingBy(v -> v))
                .entrySet()
                .stream()
                .filter(v -> v.getValue().size() == 5)
                .count() == 1;
    }

    private static boolean isFullHouse(Hand hand) {
        return isThreeCard(hand) && isOnePare(hand);
    }

    private static boolean isStraight(Hand hand) {
        List<Integer> list = hand.getTrumps().stream()
                .map(v -> v.getRank().getRank())
                .sorted(Comparator.naturalOrder())
                .collect(Collectors.toList());
        return isStraightList(list) || isRoyal(hand);
    }

    private static boolean isRoyal(Hand hand) {
        List<Integer> list = hand.getTrumps().stream()
                .map(v -> v.getRank().getRank())
                .sorted(Comparator.naturalOrder())
                .collect(Collectors.toList());
        return isRoyalList(list);
    }

    private static boolean isStraightFlush(Hand hand) {
        return isStraight(hand) && isFlush(hand);
    }

    private static boolean isRoyalStraightFlush(Hand hand) {
        return isRoyal(hand) && isStraight(hand) && isFlush(hand);
    }

    private static boolean isStraightList(List<Integer> list) {

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

    private static boolean isRoyalList(List<Integer> list) {

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
