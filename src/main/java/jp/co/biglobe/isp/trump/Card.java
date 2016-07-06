package jp.co.biglobe.isp.trump;

import jp.co.biglobe.isp.poker.SootGeneral;

/**
 * トランプ
 */
public interface Card {
    SootGeneral getSoot();

    int getRankValue();
    
    boolean isPlainTrump();
}
