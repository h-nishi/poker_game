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

        Hand sut = Hand.cheating(trumps);

        expect:
        sut.isOnePare() == expected

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
        "何もない　　　　　　　　　　" | 何もない()           | false

    }

    def "IsTwoPare_#useCase"(String useCase, List<Trump> trumps, boolean expected) {

        Hand sut = Hand.cheating(trumps);

        expect:
        sut.isTwoPare() == expected

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
        "何もない　　　　　　　　　　" | 何もない()           | false

    }

    def "IsThreeCard_#useCase"(String useCase, List<Trump> trumps, boolean expected) {

        Hand sut = Hand.cheating(trumps);

        expect:
        sut.isThreeCard() == expected

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
        "何もない　　　　　　　　　　" | 何もない()           | false

    }

    def "IsFourCard_#useCase"(String useCase, List<Trump> trumps, boolean expected) {

        Hand sut = Hand.cheating(trumps);

        expect:
        sut.isFourCard() == expected

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
        "何もない　　　　　　　　　　" | 何もない()           | false

    }

    def "IsFiveCard_#useCase"(String useCase, List<Trump> trumps, boolean expected) {

        Hand sut = Hand.cheating(trumps);

        expect:
        sut.isFiveCard() == expected

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
        "何もない　　　　　　　　　　" | 何もない()           | false

    }

    def "IsFlash_#useCase"(String useCase, List<Trump> trumps, boolean expected) {

        Hand sut = Hand.cheating(trumps);

        expect:
        sut.isFlash() == expected

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
        "何もない　　　　　　　　　　" | 何もない()           | false

    }

    def "IsFullHouse_#useCase"(String useCase, List<Trump> trumps, boolean expected) {

        Hand sut = Hand.cheating(trumps);

        expect:
        sut.isFullHouse() == expected

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
        "何もない　　　　　　　　　　" | 何もない()           | false

    }

    def "IsStraight_#useCase"(String useCase, List<Trump> trumps, boolean expected) {

        Hand sut = Hand.cheating(trumps);

        expect:
        sut.isStraight() == expected

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
        "何もない　　　　　　　　　　" | 何もない()           | false
    }

    def "IsRoyal_#useCase"(String useCase, List<Trump> trumps, boolean expected) {

        Hand sut = Hand.cheating(trumps);

        expect:
        sut.isRoyal() == expected

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
        "何もない　　　　　　　　　　" | 何もない()           | false

    }

    def "IsStraightFlash#useCase"(String useCase, List<Trump> trumps, boolean expected) {

        Hand sut = Hand.cheating(trumps);

        expect:
        sut.isStraightFlash() == expected

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
        "何もない　　　　　　　　　　" | 何もない()           | false

    }

    def "IsRoyalStraightFlash#useCase"(String useCase, List<Trump> trumps, boolean expected) {

        Hand sut = Hand.cheating(trumps);

        expect:
        sut.isRoyalStraightFlash() == expected

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
        "何もない　　　　　　　　　　" | 何もない()           | false

    }
    
}
