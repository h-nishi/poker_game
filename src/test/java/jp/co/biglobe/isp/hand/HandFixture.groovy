package jp.co.biglobe.isp.hand

import jp.co.biglobe.isp.poker.Rank
import jp.co.biglobe.isp.poker.Soot
import jp.co.biglobe.isp.trump.Joker
import jp.co.biglobe.isp.trump.PlainTrump
import jp.co.biglobe.isp.trump.Trump

import static jp.co.biglobe.isp.poker.Rank.*
import static jp.co.biglobe.isp.poker.Soot.*

/**
 * 手札のテストデータ
 */
class HandFixture {

    public static List<Trump> ワンペア() {
        return deal(trump(クローバー, A), trump(ハート, A), trump(クローバー, _2), trump(クローバー, _3), trump(クローバー, _4))
    }

    public static List<Trump> ワンペア_JOKER() {
        return deal(trump(クローバー, A), Joker.JOKER, trump(クローバー, _2), trump(クローバー, _3), trump(クローバー, _4))
    }

    public static List<Trump> ツーペア() {
        return deal(trump(クローバー, A), trump(ハート, A), trump(クローバー, _2), trump(クローバー, _2), trump(クローバー, _4))
    }

    public static List<Trump> ツーペア_JOKER() {
        return deal(trump(クローバー, A), trump(ハート, A), Joker.JOKER, trump(クローバー, _2), trump(クローバー, _4))
    }

    public static List<Trump> スリーカード() {
        return deal(trump(クローバー, A), trump(ハート, A), trump(ダイヤ, A), trump(クローバー, _2), trump(クローバー, _4))
    }

    public static List<Trump> スリーカード_JOKER() {
        return deal(trump(クローバー, A), trump(ハート, A), Joker.JOKER, trump(クローバー, _2), trump(クローバー, _4))
    }

    public static List<Trump> フォーカード() {
        return deal(trump(クローバー, A), trump(ハート, A), trump(ダイヤ, A), trump(クローバー, A), trump(クローバー, _4))
    }

    public static List<Trump> フォーカード_JOKER() {
        return deal(trump(クローバー, A), trump(ハート, A), trump(ダイヤ, A), Joker.JOKER, trump(クローバー, _4))
    }

    public static List<Trump> ファイブカード() {
        return deal(trump(クローバー, A), trump(ハート, A), trump(ダイヤ, A), trump(クローバー, A), trump(クローバー, A))
    }

    public static List<Trump> ファイブカード_JOKER() {
        return deal(trump(クローバー, A), trump(ハート, A), trump(ダイヤ, A), Joker.JOKER, trump(スペード, A))
    }

    public static List<Trump> フラッシュ() {
        return deal(trump(クローバー, A), trump(クローバー, _2), trump(クローバー, _4), trump(クローバー, _5), trump(クローバー, _6))
    }

    public static List<Trump> フラッシュ_JOKER() {
        return deal(trump(クローバー, A), trump(クローバー, _2), trump(クローバー, _4), trump(クローバー, _5), Joker.JOKER)
    }

    public static List<Trump> フルハウス() {
        return deal(trump(クローバー, A), trump(ハート, A), trump(クローバー, A), trump(ハート, _5), trump(クローバー, _5))
    }

    public static List<Trump> フルハウス_3_1_JOKER() {
        return deal(trump(クローバー, A), trump(ハート, A), trump(クローバー, A), trump(ハート, _5), Joker.JOKER)
    }

    public static List<Trump> フルハウス_2_2_JOKER() {
        return deal(trump(クローバー, A), trump(ハート, A), Joker.JOKER, trump(ハート, _5), trump(クローバー, _5))
    }


    public static List<Trump> ストレート() {
        return deal(trump(クローバー, A), trump(ハート, _2), trump(クローバー, _3), trump(ハート, _4), trump(クローバー, _5))
    }

    public static List<Trump> ロイヤル() {
        return deal(trump(クローバー, A), trump(ハート, _10), trump(クローバー, _13), trump(ハート, _11), trump(クローバー, _12))
    }

    public static List<Trump> ストレートフラッシュ() {
        return deal(trump(クローバー, A), trump(クローバー, _2), trump(クローバー, _3), trump(クローバー, _5), trump(クローバー, _4))
    }

    public static List<Trump> ロイヤルストレートフラッシュ() {
        return deal(trump(クローバー, A), trump(クローバー, _10), trump(クローバー, _13), trump(クローバー, _11), trump(クローバー, _12))
    }

    public static List<Trump> ノーペア() {
        return deal(trump(クローバー, A), trump(ハート, _6), trump(クローバー, _2), trump(クローバー, _3), trump(クローバー, _4))
    }

    /************************************************************************************
     *  以降の記述は補助用のメソッドを用意しているだけなので、気にしないで下さい。
     ************************************************************************************/
    public static PlainTrump trump(
            Soot soot,
            Rank rank
    ) {
        return new PlainTrump(soot, rank);
    }

    public static List<Trump> deal(
            Trump trump1,
            Trump trump2,
            Trump trump3,
            Trump trump4,
            Trump trump5
    ) {
        List<Trump> trumps = new ArrayList<>()
        trumps.add(trump1)
        trumps.add(trump2)
        trumps.add(trump3)
        trumps.add(trump4)
        trumps.add(trump5)

        return trumps
    }


}
