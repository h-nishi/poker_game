package jp.co.biglobe.isp.practice

import jp.co.biglobe.isp.card.Card
import jp.co.biglobe.isp.card.Joker
import jp.co.biglobe.isp.hand.Dealer
import jp.co.biglobe.isp.hand.Hand
import jp.co.biglobe.isp.hand.WinningHand

import static jp.co.biglobe.isp.hand.HandFixture.card
import static jp.co.biglobe.isp.hand.HandFixture.deal
import static jp.co.biglobe.isp.poker.Rank.*
import static jp.co.biglobe.isp.poker.Suit.クローバー
import static jp.co.biglobe.isp.poker.Suit.ハート

/**
 * ポーカーのテスト
 */
class PokerTest {

    /**
     *
     * テストコードを追加してもらうための、サンプル
     * 　useCase : 評価観点(日本語でOK)
     * 　cards  : 評価データ(テストしたい条件を満たすデータの組み合わせ)
     * 　useCase : 期待値(期待するテストの結果)
     */
    def "Poker_#useCase"(String useCase, List<Card> cards, WinningHand expected) {

        setup:
        Hand hand = Hand.cheating(cards)

        expect:
        Dealer.judgeHand(hand) == expected

        where:
        useCase | cards                                                                              | expected
        "ワンペア"  | deal(Joker.JOKER, card(ハート, A), card(クローバー, _2), card(クローバー, _3), card(クローバー, _4)) | WinningHand.ワンペア

    }

}
