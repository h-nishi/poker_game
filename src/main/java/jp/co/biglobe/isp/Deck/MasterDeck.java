package jp.co.biglobe.isp.Deck;

import jp.co.biglobe.isp.poker.Rank;
import jp.co.biglobe.isp.poker.Soot;
import jp.co.biglobe.isp.trump.Joker;
import jp.co.biglobe.isp.trump.PlainTrump;
import jp.co.biglobe.isp.trump.Trump;

import java.util.HashMap;
import java.util.Map;

/**
 * デッキ
 */
public class MasterDeck {

    private final Map<Integer, Trump> trumps;

    public MasterDeck() {

        Map<Integer, Trump> trumps = new HashMap<>();

        int number = 0;
        trumps.put(++number, new PlainTrump(Soot.スペード, Rank.A));
        trumps.put(++number, new PlainTrump(Soot.スペード, Rank._2));
        trumps.put(++number, new PlainTrump(Soot.スペード, Rank._3));
        trumps.put(++number, new PlainTrump(Soot.スペード, Rank._4));
        trumps.put(++number, new PlainTrump(Soot.スペード, Rank._5));
        trumps.put(++number, new PlainTrump(Soot.スペード, Rank._6));
        trumps.put(++number, new PlainTrump(Soot.スペード, Rank._7));
        trumps.put(++number, new PlainTrump(Soot.スペード, Rank._8));
        trumps.put(++number, new PlainTrump(Soot.スペード, Rank._9));
        trumps.put(++number, new PlainTrump(Soot.スペード, Rank._10));
        trumps.put(++number, new PlainTrump(Soot.スペード, Rank._11));
        trumps.put(++number, new PlainTrump(Soot.スペード, Rank._12));
        trumps.put(++number, new PlainTrump(Soot.スペード, Rank._13));

        trumps.put(++number, new PlainTrump(Soot.ハート, Rank.A));
        trumps.put(++number, new PlainTrump(Soot.ハート, Rank._2));
        trumps.put(++number, new PlainTrump(Soot.ハート, Rank._3));
        trumps.put(++number, new PlainTrump(Soot.ハート, Rank._4));
        trumps.put(++number, new PlainTrump(Soot.ハート, Rank._5));
        trumps.put(++number, new PlainTrump(Soot.ハート, Rank._6));
        trumps.put(++number, new PlainTrump(Soot.ハート, Rank._7));
        trumps.put(++number, new PlainTrump(Soot.ハート, Rank._8));
        trumps.put(++number, new PlainTrump(Soot.ハート, Rank._9));
        trumps.put(++number, new PlainTrump(Soot.ハート, Rank._10));
        trumps.put(++number, new PlainTrump(Soot.ハート, Rank._11));
        trumps.put(++number, new PlainTrump(Soot.ハート, Rank._12));
        trumps.put(++number, new PlainTrump(Soot.ハート, Rank._13));

        trumps.put(++number, new PlainTrump(Soot.クローバー, Rank.A));
        trumps.put(++number, new PlainTrump(Soot.クローバー, Rank._2));
        trumps.put(++number, new PlainTrump(Soot.クローバー, Rank._3));
        trumps.put(++number, new PlainTrump(Soot.クローバー, Rank._4));
        trumps.put(++number, new PlainTrump(Soot.クローバー, Rank._5));
        trumps.put(++number, new PlainTrump(Soot.クローバー, Rank._6));
        trumps.put(++number, new PlainTrump(Soot.クローバー, Rank._7));
        trumps.put(++number, new PlainTrump(Soot.クローバー, Rank._8));
        trumps.put(++number, new PlainTrump(Soot.クローバー, Rank._9));
        trumps.put(++number, new PlainTrump(Soot.クローバー, Rank._10));
        trumps.put(++number, new PlainTrump(Soot.クローバー, Rank._11));
        trumps.put(++number, new PlainTrump(Soot.クローバー, Rank._12));
        trumps.put(++number, new PlainTrump(Soot.クローバー, Rank._13));
        
        trumps.put(++number, new PlainTrump(Soot.ダイヤ, Rank.A));
        trumps.put(++number, new PlainTrump(Soot.ダイヤ, Rank._2));
        trumps.put(++number, new PlainTrump(Soot.ダイヤ, Rank._3));
        trumps.put(++number, new PlainTrump(Soot.ダイヤ, Rank._4));
        trumps.put(++number, new PlainTrump(Soot.ダイヤ, Rank._5));
        trumps.put(++number, new PlainTrump(Soot.ダイヤ, Rank._6));
        trumps.put(++number, new PlainTrump(Soot.ダイヤ, Rank._7));
        trumps.put(++number, new PlainTrump(Soot.ダイヤ, Rank._8));
        trumps.put(++number, new PlainTrump(Soot.ダイヤ, Rank._9));
        trumps.put(++number, new PlainTrump(Soot.ダイヤ, Rank._10));
        trumps.put(++number, new PlainTrump(Soot.ダイヤ, Rank._11));
        trumps.put(++number, new PlainTrump(Soot.ダイヤ, Rank._12));
        trumps.put(++number, new PlainTrump(Soot.ダイヤ, Rank._13));

        trumps.put(++number, Joker.JOKER);
        
        this.trumps = trumps;
    }

    public Trump getTrump(Integer key) {
        return trumps.get(key);
    }

}
