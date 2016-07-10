package jp.co.biglobe.isp.hand

import jp.co.biglobe.isp.card.Joker
import jp.co.biglobe.isp.card.Card
import spock.lang.Specification

import static jp.co.biglobe.isp.hand.HandFixture.*
import static jp.co.biglobe.isp.poker.Rank.*
import static jp.co.biglobe.isp.poker.Suit.クローバー
import static jp.co.biglobe.isp.poker.Suit.ハート

/**
 * ディラー
 */
class DealerTest extends Specification {

    /**
     * 
     * テストコードを追加してもらうための、サンプル
     * 　useCase : 評価観点(日本語でOK)
     * 　cards  : 評価データ(テストしたい条件を満たすデータの組み合わせ)
     * 　useCase : 期待値(期待するテストの結果)
     */
    def "JudgeHand2_#useCase"(String useCase, List<Card> cards, WinningHand expected) {

        setup:
        Hand hand = Hand.cheating(cards)

        expect:
        Dealer.judgeHand(hand) == expected

        where:
        useCase | cards                                                                                     | expected
        "ワンペア"  | deal(Joker.JOKER, card(ハート, A), card(クローバー, _2), card(クローバー, _3), card(クローバー, _4)) | WinningHand.ワンペア

    }


    def "JudgeHand_#useCase"(String useCase, List<Card> cards, WinningHand expected) {

        setup:
        Hand hand = Hand.cheating(cards)

        expect:
        Dealer.judgeHand(hand) == expected

        where:
        useCase          | cards           | expected
        "ワンペア　　　　　　　　　　" | ワンペア()           | WinningHand.ワンペア
        "ツーペア　　　　　　　　　　" | ツーペア()           | WinningHand.ツーペア
        "スリーカード　　　　　　　　" | スリーカード()         | WinningHand.スリーカード
        "フォーカード　　　　　　　　" | フォーカード()         | WinningHand.フォーカード
        "ファイブカード　　　　　　　" | ファイブカード()        | WinningHand.ファイブカード
        "フラッシュ　　　　　　　　　" | フラッシュ()          | WinningHand.フラッシュ
        "フルハウス　　　　　　　　　" | フルハウス()          | WinningHand.フルハウス
        "ストレート　　　　　　　　　" | ストレート()          | WinningHand.ストレート
        "ストレートフラッシ　　　　　" | ストレートフラッシュ()     | WinningHand.ストレートフラッシ
        "ロイヤルストレートフラッシュ" | ロイヤルストレートフラッシュ() | WinningHand.ロイヤルストレートフラッシュ
        "ノーペア　　　　　　　　　　" | ノーペア()           | WinningHand.ノーペア

    }
}
