package jp.co.biglobe.isp.hand

import jp.co.biglobe.isp.trump.Joker
import jp.co.biglobe.isp.trump.Card
import spock.lang.Specification

import static jp.co.biglobe.isp.hand.HandFixture.*
import static jp.co.biglobe.isp.poker.Rank.*
import static jp.co.biglobe.isp.poker.Soot.クローバー
import static jp.co.biglobe.isp.poker.Soot.ハート

/**
 * ディラー
 */
class DealerTest extends Specification {

    def "JudgeHand2_#useCase"(String useCase, List<Card> trumps, WinningHand expected) {

        setup:
        Hand hand = Hand.cheating(trumps)

        expect:
        Dealer.judgeHand(hand) == expected

        where:
        useCase | trumps                                                                                     | expected
        "ワンペア"  | deal(Joker.JOKER, trump(ハート, A), trump(クローバー, _2), trump(クローバー, _3), trump(クローバー, _4)) | WinningHand.ワンペア

    }


    def "JudgeHand_#useCase"(String useCase, List<Card> trumps, WinningHand expected) {

        setup:
        Hand hand = Hand.cheating(trumps)

        expect:
        Dealer.judgeHand(hand) == expected

        where:
        useCase          | trumps           | expected
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
