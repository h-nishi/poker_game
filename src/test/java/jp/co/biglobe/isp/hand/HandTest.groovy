package jp.co.biglobe.isp.hand

import jp.co.biglobe.isp.trump.Trump
import spock.lang.Specification
import spock.lang.Unroll

import static jp.co.biglobe.isp.hand.HandFixture.*

/**
 * 手札クラスのテスト
 */
@Unroll
class HandTest extends Specification {

    def "IsOnePare_#useCase"(String useCase, List<Trump> trumps, boolean expected) {

        setup:
        Hand hand = Hand.cheating(trumps);

        expect:
        Dealer.isOnePare(hand) == expected

        where:
        useCase          | trumps           | expected
        "ワンペア　　　　　　　　　　" | ワンペア()           | true
        "ツーペア　　　　　　　　　　" | ツーペア()           | false
        "スリーカード　　　　　　　　" | スリーカード()         | false
        "フォーカード　　　　　　　　" | フォーカード()         | false
        "ファイブカード　　　　　　　" | ファイブカード()        | false
        "フラッシュ　　　　　　　　　" | フラッシュ()          | false
        "フルハウス　　　　　　　　　" | フルハウス()          | true
        "ストレート　　　　　　　　　" | ストレート()          | false
        "ロイヤル　　　　　　　　　　" | ロイヤル()           | false
        "ストレートフラッシ　　　　　" | ストレートフラッシュ()     | false
        "ロイヤルストレートフラッシュ" | ロイヤルストレートフラッシュ() | false
        "ノーペア　　　　　　　　　　" | ノーペア()           | false

    }

    def "IsTwoPare_#useCase"(String useCase, List<Trump> trumps, boolean expected) {

        setup:
        Hand hand = Hand.cheating(trumps);

        expect:
        Dealer.isTwoPare(hand) == expected

        where:
        useCase          | trumps           | expected
        "ワンペア　　　　　　　　　　" | ワンペア()           | false
        "ツーペア　　　　　　　　　　" | ツーペア()           | true
        "スリーカード　　　　　　　　" | スリーカード()         | false
        "フォーカード　　　　　　　　" | フォーカード()         | false
        "ファイブカード　　　　　　　" | ファイブカード()        | false
        "フラッシュ　　　　　　　　　" | フラッシュ()          | false
        "フルハウス　　　　　　　　　" | フルハウス()          | false
        "ストレート　　　　　　　　　" | ストレート()          | false
        "ロイヤル　　　　　　　　　　" | ロイヤル()           | false
        "ストレートフラッシ　　　　　" | ストレートフラッシュ()     | false
        "ロイヤルストレートフラッシュ" | ロイヤルストレートフラッシュ() | false
        "ノーペア　　　　　　　　　　" | ノーペア()           | false

    }

    def "IsThreeCard_#useCase"(String useCase, List<Trump> trumps, boolean expected) {

        setup:
        Hand hand = Hand.cheating(trumps);

        expect:
        Dealer.isThreeCard(hand) == expected

        where:
        useCase          | trumps           | expected
        "ワンペア　　　　　　　　　　" | ワンペア()           | false
        "ツーペア　　　　　　　　　　" | ツーペア()           | false
        "スリーカード　　　　　　　　" | スリーカード()         | true
        "フォーカード　　　　　　　　" | フォーカード()         | false
        "ファイブカード　　　　　　　" | ファイブカード()        | false
        "フラッシュ　　　　　　　　　" | フラッシュ()          | false
        "フルハウス　　　　　　　　　" | フルハウス()          | true
        "ストレート　　　　　　　　　" | ストレート()          | false
        "ロイヤル　　　　　　　　　　" | ロイヤル()           | false
        "ストレートフラッシ　　　　　" | ストレートフラッシュ()     | false
        "ロイヤルストレートフラッシュ" | ロイヤルストレートフラッシュ() | false
        "ノーペア　　　　　　　　　　" | ノーペア()           | false

    }

    def "IsFourCard_#useCase"(String useCase, List<Trump> trumps, boolean expected) {

        setup:
        Hand hand = Hand.cheating(trumps);

        expect:
        Dealer.isFourCard(hand) == expected

        where:
        useCase          | trumps           | expected
        "ワンペア　　　　　　　　　　" | ワンペア()           | false
        "ツーペア　　　　　　　　　　" | ツーペア()           | false
        "スリーカード　　　　　　　　" | スリーカード()         | false
        "フォーカード　　　　　　　　" | フォーカード()         | true
        "ファイブカード　　　　　　　" | ファイブカード()        | false
        "フラッシュ　　　　　　　　　" | フラッシュ()          | false
        "フルハウス　　　　　　　　　" | フルハウス()          | false
        "ストレート　　　　　　　　　" | ストレート()          | false
        "ロイヤル　　　　　　　　　　" | ロイヤル()           | false
        "ストレートフラッシ　　　　　" | ストレートフラッシュ()     | false
        "ロイヤルストレートフラッシュ" | ロイヤルストレートフラッシュ() | false
        "ノーペア　　　　　　　　　　" | ノーペア()           | false

    }

    def "IsFiveCard_#useCase"(String useCase, List<Trump> trumps, boolean expected) {

        setup:
        Hand hand = Hand.cheating(trumps);

        expect:
        Dealer.isFiveCard(hand) == expected

        where:
        useCase          | trumps           | expected
        "ワンペア　　　　　　　　　　" | ワンペア()           | false
        "ツーペア　　　　　　　　　　" | ツーペア()           | false
        "スリーカード　　　　　　　　" | スリーカード()         | false
        "フォーカード　　　　　　　　" | フォーカード()         | false
        "ファイブカード　　　　　　　" | ファイブカード()        | true
        "フラッシュ　　　　　　　　　" | フラッシュ()          | false
        "フルハウス　　　　　　　　　" | フルハウス()          | false
        "ストレート　　　　　　　　　" | ストレート()          | false
        "ロイヤル　　　　　　　　　　" | ロイヤル()           | false
        "ストレートフラッシ　　　　　" | ストレートフラッシュ()     | false
        "ロイヤルストレートフラッシュ" | ロイヤルストレートフラッシュ() | false
        "ノーペア　　　　　　　　　　" | ノーペア()           | false

    }

    def "IsFlush_#useCase"(String useCase, List<Trump> trumps, boolean expected) {

        setup:
        Hand hand = Hand.cheating(trumps);

        expect:
        Dealer.isFlush(hand) == expected

        where:
        useCase          | trumps           | expected
        "ワンペア　　　　　　　　　　" | ワンペア()           | false
        "ツーペア　　　　　　　　　　" | ツーペア()           | false
        "スリーカード　　　　　　　　" | スリーカード()         | false
        "フォーカード　　　　　　　　" | フォーカード()         | false
        "ファイブカード　　　　　　　" | ファイブカード()        | false
        "フラッシュ　　　　　　　　　" | フラッシュ()          | true
        "フルハウス　　　　　　　　　" | フルハウス()          | false
        "ストレート　　　　　　　　　" | ストレート()          | false
        "ロイヤル　　　　　　　　　　" | ロイヤル()           | false
        "ストレートフラッシ　　　　　" | ストレートフラッシュ()     | true
        "ロイヤルストレートフラッシュ" | ロイヤルストレートフラッシュ() | true
        "ノーペア　　　　　　　　　　" | ノーペア()           | false

    }

    def "IsFullHouse_#useCase"(String useCase, List<Trump> trumps, boolean expected) {

        setup:
        Hand hand = Hand.cheating(trumps);

        expect:
        Dealer.isFullHouse(hand) == expected

        where:
        useCase          | trumps           | expected
        "ワンペア　　　　　　　　　　" | ワンペア()           | false
        "ツーペア　　　　　　　　　　" | ツーペア()           | false
        "スリーカード　　　　　　　　" | スリーカード()         | false
        "フォーカード　　　　　　　　" | フォーカード()         | false
        "ファイブカード　　　　　　　" | ファイブカード()        | false
        "フラッシュ　　　　　　　　　" | フラッシュ()          | false
        "フルハウス　　　　　　　　　" | フルハウス()          | true
        "ストレート　　　　　　　　　" | ストレート()          | false
        "ロイヤル　　　　　　　　　　" | ロイヤル()           | false
        "ストレートフラッシ　　　　　" | ストレートフラッシュ()     | false
        "ロイヤルストレートフラッシュ" | ロイヤルストレートフラッシュ() | false
        "ノーペア　　　　　　　　　　" | ノーペア()           | false

    }

    def "IsStraight_#useCase"(String useCase, List<Trump> trumps, boolean expected) {

        setup:
        Hand hand = Hand.cheating(trumps);

        expect:
        Dealer.isStraight(hand) == expected

        where:
        useCase          | trumps           | expected
        "ワンペア　　　　　　　　　　" | ワンペア()           | false
        "ツーペア　　　　　　　　　　" | ツーペア()           | false
        "スリーカード　　　　　　　　" | スリーカード()         | false
        "フォーカード　　　　　　　　" | フォーカード()         | false
        "ファイブカード　　　　　　　" | ファイブカード()        | false
        "フラッシュ　　　　　　　　　" | フラッシュ()          | false
        "フルハウス　　　　　　　　　" | フルハウス()          | false
        "ストレート　　　　　　　　　" | ストレート()          | true
        "ロイヤル　　　　　　　　　　" | ロイヤル()           | true
        "ストレートフラッシ　　　　　" | ストレートフラッシュ()     | true
        "ロイヤルストレートフラッシュ" | ロイヤルストレートフラッシュ() | true
        "ノーペア　　　　　　　　　　" | ノーペア()           | false
    }

    def "IsRoyal_#useCase"(String useCase, List<Trump> trumps, boolean expected) {

        setup:
        Hand hand = Hand.cheating(trumps);

        expect:
        Dealer.isRoyal(hand) == expected

        where:
        useCase          | trumps           | expected
        "ワンペア　　　　　　　　　　" | ワンペア()           | false
        "ツーペア　　　　　　　　　　" | ツーペア()           | false
        "スリーカード　　　　　　　　" | スリーカード()         | false
        "フォーカード　　　　　　　　" | フォーカード()         | false
        "ファイブカード　　　　　　　" | ファイブカード()        | false
        "フラッシュ　　　　　　　　　" | フラッシュ()          | false
        "フルハウス　　　　　　　　　" | フルハウス()          | false
        "ストレート　　　　　　　　　" | ストレート()          | false
        "ロイヤル　　　　　　　　　　" | ロイヤル()           | true
        "ストレートフラッシ　　　　　" | ストレートフラッシュ()     | false
        "ロイヤルストレートフラッシュ" | ロイヤルストレートフラッシュ() | true
        "ノーペア　　　　　　　　　　" | ノーペア()           | false

    }

    def "IsStraightFlush_#useCase"(String useCase, List<Trump> trumps, boolean expected) {

        setup:
        Hand hand = Hand.cheating(trumps);

        expect:
        Dealer.isStraightFlush(hand) == expected

        where:
        useCase          | trumps           | expected
        "ワンペア　　　　　　　　　　" | ワンペア()           | false
        "ツーペア　　　　　　　　　　" | ツーペア()           | false
        "スリーカード　　　　　　　　" | スリーカード()         | false
        "フォーカード　　　　　　　　" | フォーカード()         | false
        "ファイブカード　　　　　　　" | ファイブカード()        | false
        "フラッシュ　　　　　　　　　" | フラッシュ()          | false
        "フルハウス　　　　　　　　　" | フルハウス()          | false
        "ストレート　　　　　　　　　" | ストレート()          | false
        "ロイヤル　　　　　　　　　　" | ロイヤル()           | false
        "ストレートフラッシ　　　　　" | ストレートフラッシュ()     | true
        "ロイヤルストレートフラッシュ" | ロイヤルストレートフラッシュ() | true
        "ノーペア　　　　　　　　　　" | ノーペア()           | false

    }

    def "IsRoyalStraightFlush_#useCase"(String useCase, List<Trump> trumps, boolean expected) {

        setup:
        Hand hand = Hand.cheating(trumps);

        expect:
        Dealer.isRoyalStraightFlush(hand) == expected

        where:
        useCase          | trumps           | expected
        "ワンペア　　　　　　　　　　" | ワンペア()           | false
        "ツーペア　　　　　　　　　　" | ツーペア()           | false
        "スリーカード　　　　　　　　" | スリーカード()         | false
        "フォーカード　　　　　　　　" | フォーカード()         | false
        "ファイブカード　　　　　　　" | ファイブカード()        | false
        "フラッシュ　　　　　　　　　" | フラッシュ()          | false
        "フルハウス　　　　　　　　　" | フルハウス()          | false
        "ストレート　　　　　　　　　" | ストレート()          | false
        "ロイヤル　　　　　　　　　　" | ロイヤル()           | false
        "ストレートフラッシ　　　　　" | ストレートフラッシュ()     | false
        "ロイヤルストレートフラッシュ" | ロイヤルストレートフラッシュ() | true
        "ノーペア　　　　　　　　　　" | ノーペア()           | false

    }

}
