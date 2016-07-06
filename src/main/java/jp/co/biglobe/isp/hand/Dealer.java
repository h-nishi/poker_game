package jp.co.biglobe.isp.hand;

import java.util.List;

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
        if (hand.isContainsJoker()) {
            return hand.hasGroupRank(1, 5);
        }
        return hand.hasGroupRank(2, 1);
    }

    private static boolean isTwoPare(Hand hand) {
        if (hand.isContainsJoker()) {
            return hand.hasGroupRank(2, 1);
        }
        return hand.hasGroupRank(2, 2);
    }

    private static boolean isThreeCard(Hand hand) {
        if (hand.isContainsJoker()) {
            return hand.hasGroupRank(2, 1);
        }
        return hand.hasGroupRank(3, 1);
    }

    private static boolean isFourCard(Hand hand) {
        if (hand.isContainsJoker()) {
            return hand.hasGroupRank(3, 1);
        }
        return hand.hasGroupRank(4, 1);
    }

    private static boolean isFiveCard(Hand hand) {
        if (hand.isContainsJoker()) {
            return hand.hasGroupRank(4, 1);
        }
        return false;
    }

    private static boolean isFlush(Hand hand) {
        if (hand.isContainsJoker()) {
            return hand.hasGroupSoot(4, 1);
        }
        return hand.hasGroupSoot(5, 1);
    }

    private static boolean isFullHouse(Hand hand) {
        if (hand.isContainsJoker()) {
            return hand.hasGroupRank(3, 1) || hand.hasGroupRank(2, 2);
        }
        return isThreeCard(hand) && isOnePare(hand);
    }

    // todo : ジョーカーの場合の判定が入っていない
    private static boolean isStraight(Hand hand) {
        List<Integer> list = hand.getRankList();
        return isStraightList(list) || isRoyalList(list);
    }

    private static boolean isRoyal(Hand hand) {
        return isRoyalList(hand.getRankList());
    }

    private static boolean isStraightFlush(Hand hand) {
        return isStraight(hand) && isFlush(hand);
    }

    private static boolean isRoyalStraightFlush(Hand hand) {
        return isRoyal(hand) && isFlush(hand);
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
