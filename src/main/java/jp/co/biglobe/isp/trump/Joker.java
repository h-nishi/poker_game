package jp.co.biglobe.isp.trump;

import jp.co.biglobe.isp.poker.Rank;
import jp.co.biglobe.isp.poker.Soot;

/**
 * ジョーカー
 */
public enum Joker implements Trump {
    JOKER;

    @Override
    public Soot getSoot() {
        return Soot.ジョーカー;
    }

    @Override
    public Rank getRank() {
        return Rank.ジョーカー;
    }

}
