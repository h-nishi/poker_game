package jp.co.biglobe.isp.hand

import jp.co.biglobe.isp.card.Card
import jp.co.biglobe.isp.card.Joker
import jp.co.biglobe.isp.card.PlainCard
import jp.co.biglobe.isp.poker.Rank
import jp.co.biglobe.isp.poker.Suit

import static jp.co.biglobe.isp.poker.Rank.*
import static jp.co.biglobe.isp.poker.Suit.*

/**
 * 手札のテストデータ
 */
class HandFixture {

    public static List<Card> ワンペア() {
        return deal(card(クローバー, A), card(ハート, A), card(クローバー, _2), card(クローバー, _3), card(クローバー, _4))
    }

    public static List<Card> ワンペア_JOKER() {
        return deal(card(クローバー, A), Joker.JOKER, card(クローバー, _2), card(クローバー, _3), card(クローバー, _4))
    }

    public static List<Card> ツーペア() {
        return deal(card(クローバー, A), card(ハート, A), card(クローバー, _2), card(クローバー, _2), card(クローバー, _4))
    }

    public static List<Card> ツーペア_JOKER() {
        return deal(card(クローバー, A), card(ハート, A), Joker.JOKER, card(クローバー, _2), card(クローバー, _4))
    }

    public static List<Card> スリーカード() {
        return deal(card(クローバー, A), card(ハート, A), card(ダイヤ, A), card(クローバー, _2), card(クローバー, _4))
    }

    public static List<Card> スリーカード_JOKER() {
        return deal(card(クローバー, A), card(ハート, A), Joker.JOKER, card(クローバー, _2), card(クローバー, _4))
    }

    public static List<Card> フォーカード() {
        return deal(card(クローバー, A), card(ハート, A), card(ダイヤ, A), card(クローバー, A), card(クローバー, _4))
    }

    public static List<Card> フォーカード_JOKER() {
        return deal(card(クローバー, A), card(ハート, A), card(ダイヤ, A), Joker.JOKER, card(クローバー, _4))
    }

    public static List<Card> ファイブカード() {
        return deal(card(クローバー, A), card(ハート, A), card(ダイヤ, A), card(クローバー, A), Joker.JOKER)
    }

    public static List<Card> ファイブカード_JOKER() {
        return deal(card(クローバー, A), card(ハート, A), card(ダイヤ, A), Joker.JOKER, card(スペード, A))
    }

    public static List<Card> フラッシュ() {
        return deal(card(クローバー, A), card(クローバー, _2), card(クローバー, _4), card(クローバー, _5), card(クローバー, _6))
    }

    public static List<Card> フラッシュ_JOKER() {
        return deal(card(クローバー, A), card(クローバー, _2), card(クローバー, _4), card(クローバー, _5), Joker.JOKER)
    }

    public static List<Card> フルハウス() {
        return deal(card(クローバー, A), card(ハート, A), card(クローバー, A), card(ハート, _5), card(クローバー, _5))
    }

    public static List<Card> フルハウス_3_1_JOKER() {
        return deal(card(クローバー, A), card(ハート, A), card(クローバー, A), card(ハート, _5), Joker.JOKER)
    }

    public static List<Card> フルハウス_2_2_JOKER() {
        return deal(card(クローバー, A), card(ハート, A), Joker.JOKER, card(ハート, _5), card(クローバー, _5))
    }


    public static List<Card> ストレート() {
        return deal(card(クローバー, A), card(ハート, _2), card(クローバー, _3), card(ハート, _4), card(クローバー, _5))
    }

    public static List<Card> ストレート_1_JOKER() {
        return deal(Joker.JOKER, card(ハート, _2), card(クローバー, _3), card(ハート, _4), card(クローバー, _5))
    }

    public static List<Card> ストレート_2_JOKER() {
        return deal(card(クローバー, A), Joker.JOKER, card(クローバー, _3), card(ハート, _4), card(クローバー, _5))
    }

    public static List<Card> ストレート_3_JOKER() {
        return deal(card(クローバー, A), card(ハート, _2), Joker.JOKER, card(ハート, _4), card(クローバー, _5))
    }

    public static List<Card> ストレート_4_JOKER() {
        return deal(card(クローバー, A), card(ハート, _2), card(クローバー, _3), Joker.JOKER, card(クローバー, _5))
    }

    public static List<Card> ストレート_5_JOKER() {
        return deal(card(クローバー, A), card(ハート, _2), card(クローバー, _4), card(ハート, _3), Joker.JOKER)
    }

    public static List<Card> ロイヤル() {
        return deal(card(クローバー, A), card(ハート, _10), card(クローバー, _13), card(ハート, _11), card(クローバー, _12))
    }

    public static List<Card> ストレートフラッシュ() {
        return deal(card(クローバー, A), card(クローバー, _2), card(クローバー, _3), card(クローバー, _5), card(クローバー, _4))
    }

    public static List<Card> ストレートフラッシュ_JOKER_1() {
        return deal(Joker.JOKER, card(クローバー, _2), card(クローバー, _3), card(クローバー, _5), card(クローバー, _4))
    }

    public static List<Card> ストレートフラッシュ_JOKER_2() {
        return deal(card(クローバー, A), Joker.JOKER, card(クローバー, _3), card(クローバー, _5), card(クローバー, _4))
    }

    public static List<Card> ストレートフラッシュ_JOKER_3() {
        return deal(card(クローバー, A), card(クローバー, _2), Joker.JOKER, card(クローバー, _5), card(クローバー, _4))
    }

    public static List<Card> ストレートフラッシュ_JOKER_4() {
        return deal(card(クローバー, A), card(クローバー, _2), card(クローバー, _3), Joker.JOKER, card(クローバー, _4))
    }

    public static List<Card> ストレートフラッシュ_JOKER_5() {
        return deal(card(クローバー, A), card(クローバー, _2), card(クローバー, _3), card(クローバー, _5), Joker.JOKER)
    }

    public static List<Card> ロイヤルストレートフラッシュ() {
        return deal(card(クローバー, A), card(クローバー, _10), card(クローバー, _13), card(クローバー, _11), card(クローバー, _12))
    }

    public static List<Card> ノーペア() {
        return deal(card(クローバー, A), card(ハート, _6), card(クローバー, _2), card(クローバー, _3), card(クローバー, _4))
    }

    /************************************************************************************
     *  以降の記述は補助用のメソッドを用意しているだけなので、気にしないで下さい。
     ************************************************************************************/
    public static PlainCard card(
            Suit soot,
            Rank rank
    ) {
        return new PlainCard(soot, rank);
    }

    public static List<Card> deal(
            Card card1,
            Card card2,
            Card card3,
            Card card4,
            Card card5
    ) {
        List<Card> cards = new ArrayList<>()
        cards.add(card1)
        cards.add(card2)
        cards.add(card3)
        cards.add(card4)
        cards.add(card5)

        return cards
    }


}
