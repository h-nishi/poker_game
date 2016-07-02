package jp.co.biglobe.isp.hand

import jp.co.biglobe.isp.trump.Trump
import spock.lang.Specification

import static jp.co.biglobe.isp.hand.HandFixture.*

/**
 * ディラー
 */
class DealerTest extends Specification {

    def "JudgeHand_#useCase"(String useCase, List<Trump> trumps, WinningHand expected) {

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