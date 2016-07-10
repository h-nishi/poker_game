package jp.co.biglobe.isp.card;

import jp.co.biglobe.isp.poker.RankGeneral;
import jp.co.biglobe.isp.poker.SootGeneral;

/**
 * ジョーカー
 */
public enum Joker implements Card, RankGeneral, SootGeneral {
    JOKER;

    @Override
    public SootGeneral getSuit() {
        return this;
    }

    @Override
    public int getRankValue() {
        return getRank();
    }

    @Override
    public int getRank() {
        return 0;
    }

    @Override
    public boolean isPlainCard() {
        return false;
    }


}
