package jp.co.biglobe.isp.trump;

import jp.co.biglobe.isp.poker.RankGeneral;
import jp.co.biglobe.isp.poker.SootGeneral;

/**
 * ジョーカー
 */
public enum Joker implements Trump, RankGeneral, SootGeneral {
    JOKER;

    @Override
    public SootGeneral getSoot() {
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


}
