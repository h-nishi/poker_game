package jp.co.biglobe.isp.card;

import jp.co.biglobe.isp.poker.SootGeneral;

/**
 * トランプ
 */
public interface Card {
    SootGeneral getSuit();

    int getRankValue();
    
    boolean isPlainCard();
}
