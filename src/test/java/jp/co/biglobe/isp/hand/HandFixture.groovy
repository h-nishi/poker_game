package jp.co.biglobe.isp.hand

import jp.co.biglobe.isp.poker.Rank
import jp.co.biglobe.isp.poker.Soot
import jp.co.biglobe.isp.trump.Joker
import jp.co.biglobe.isp.trump.PlainCard
import jp.co.biglobe.isp.trump.Card

import static jp.co.biglobe.isp.poker.Rank.*
import static jp.co.biglobe.isp.poker.Soot.*

/**
 * 手札のテストデータ
 */
class HandFixture {

    public static List<Card> ワンペア() {
        return deal(trump(クローバー, A), trump(ハート, A), trump(クローバー, _2), trump(クローバー, _3), trump(クローバー, _4))
    }

    public static List<Card> ワンペア_JOKER() {
        return deal(trump(クローバー, A), Joker.JOKER, trump(クローバー, _2), trump(クローバー, _3), trump(クローバー, _4))
    }

    public static List<Card> ツーペア() {
        return deal(trump(クローバー, A), trump(ハート, A), trump(クローバー, _2), trump(クローバー, _2), trump(クローバー, _4))
    }

    public static List<Card> ツーペア_JOKER() {
        return deal(trump(クローバー, A), trump(ハート, A), Joker.JOKER, trump(クローバー, _2), trump(クローバー, _4))
    }

    public static List<Card> スリーカード() {
        return deal(trump(クローバー, A), trump(ハート, A), trump(ダイヤ, A), trump(クローバー, _2), trump(クローバー, _4))
    }

    public static List<Card> スリーカード_JOKER() {
        return deal(trump(クローバー, A), trump(ハート, A), Joker.JOKER, trump(クローバー, _2), trump(クローバー, _4))
    }

    public static List<Card> フォーカード() {
        return deal(trump(クローバー, A), trump(ハート, A), trump(ダイヤ, A), trump(クローバー, A), trump(クローバー, _4))
    }

    public static List<Card> フォーカード_JOKER() {
        return deal(trump(クローバー, A), trump(ハート, A), trump(ダイヤ, A), Joker.JOKER, trump(クローバー, _4))
    }

    public static List<Card> ファイブカード() {
        return deal(trump(クローバー, A), trump(ハート, A), trump(ダイヤ, A), trump(クローバー, A), trump(クローバー, A))
    }

    public static List<Card> ファイブカード_JOKER() {
        return deal(trump(クローバー, A), trump(ハート, A), trump(ダイヤ, A), Joker.JOKER, trump(スペード, A))
    }

    public static List<Card> フラッシュ() {
        return deal(trump(クローバー, A), trump(クローバー, _2), trump(クローバー, _4), trump(クローバー, _5), trump(クローバー, _6))
    }

    public static List<Card> フラッシュ_JOKER() {
        return deal(trump(クローバー, A), trump(クローバー, _2), trump(クローバー, _4), trump(クローバー, _5), Joker.JOKER)
    }

    public static List<Card> フルハウス() {
        return deal(trump(クローバー, A), trump(ハート, A), trump(クローバー, A), trump(ハート, _5), trump(クローバー, _5))
    }

    public static List<Card> フルハウス_3_1_JOKER() {
        return deal(trump(クローバー, A), trump(ハート, A), trump(クローバー, A), trump(ハート, _5), Joker.JOKER)
    }

    public static List<Card> フルハウス_2_2_JOKER() {
        return deal(trump(クローバー, A), trump(ハート, A), Joker.JOKER, trump(ハート, _5), trump(クローバー, _5))
    }


    public static List<Card> ストレート() {
        return deal(trump(クローバー, A), trump(ハート, _2), trump(クローバー, _3), trump(ハート, _4), trump(クローバー, _5))
    }

    public static List<Card> ロイヤル() {
        return deal(trump(クローバー, A), trump(ハート, _10), trump(クローバー, _13), trump(ハート, _11), trump(クローバー, _12))
    }

    public static List<Card> ストレートフラッシュ() {
        return deal(trump(クローバー, A), trump(クローバー, _2), trump(クローバー, _3), trump(クローバー, _5), trump(クローバー, _4))
    }

    public static List<Card> ロイヤルストレートフラッシュ() {
        return deal(trump(クローバー, A), trump(クローバー, _10), trump(クローバー, _13), trump(クローバー, _11), trump(クローバー, _12))
    }

    public static List<Card> ノーペア() {
        return deal(trump(クローバー, A), trump(ハート, _6), trump(クローバー, _2), trump(クローバー, _3), trump(クローバー, _4))
    }

    /************************************************************************************
     *  以降の記述は補助用のメソッドを用意しているだけなので、気にしないで下さい。
     ************************************************************************************/
    public static PlainCard trump(
            Soot soot,
            Rank rank
    ) {
        return new PlainCard(soot, rank);
    }

    public static List<Card> deal(
            Card trump1,
            Card trump2,
            Card trump3,
            Card trump4,
            Card trump5
    ) {
        List<Card> trumps = new ArrayList<>()
        trumps.add(trump1)
        trumps.add(trump2)
        trumps.add(trump3)
        trumps.add(trump4)
        trumps.add(trump5)

        return trumps
    }


}
