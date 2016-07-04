package jp.co.biglobe.isp.trump;

import jp.co.biglobe.isp.poker.Rank;
import jp.co.biglobe.isp.poker.Soot;

/**
 * トランプ
 */
public class PlainTrump implements Trump {

    private final Soot soot;

    private final Rank rank;

    public PlainTrump(Soot soot, Rank rank) {
        this.soot = soot;
        this.rank = rank;
    }

    @Override
    public Soot getSoot() {
        return soot;
    }

    @Override
    public int getRankValue() {
        return rank.getRank();
    }

    @Override
    public boolean isJoker() {
        return false;
    }
}
