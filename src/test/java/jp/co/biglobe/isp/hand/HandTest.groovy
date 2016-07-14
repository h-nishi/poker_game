package jp.co.biglobe.isp.hand

import jp.co.biglobe.isp.card.Card
import spock.lang.Specification
import spock.lang.Unroll

import static jp.co.biglobe.isp.hand.HandFixture.*

/**
 * 手札クラスのテスト
 */
@Unroll
class HandTest extends Specification {

    def "IsContainsJoker_#useCase"(String useCase, List<Card> cards, boolean expected) {
        setup:
        Hand hand = Hand.cheating(cards);

        expect:
        hand.isContainsJoker() == expected

        where:
        useCase   | cards        | expected
        "JOKERあり" | ワンペア_JOKER() | true
        "JOKERなし" | ワンペア()       | false

    }

    def "IsOnePare_#useCase"(String useCase, List<Card> cards, boolean expected) {

        setup:
        Hand hand = Hand.cheating(cards);

        expect:
        Dealer.isOnePare(hand) == expected

        where:
        useCase          | cards            | expected
        "ワンペア　　　　　　　　　　" | ワンペア()           | true
        "ワンペア＿ジョーカーあり　　" | ワンペア_JOKER()     | true
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

    def "IsTwoPare_#useCase"(String useCase, List<Card> cards, boolean expected) {

        setup:
        Hand hand = Hand.cheating(cards);

        expect:
        Dealer.isTwoPare(hand) == expected

        where:
        useCase          | cards            | expected
        "ワンペア　　　　　　　　　　" | ワンペア()           | false
        "ツーペア　　　　　　　　　　" | ツーペア()           | true
        "ツーペア　　　　　　　　　　" | ツーペア_JOKER()     | true
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

    def "IsThreeCard_#useCase"(String useCase, List<Card> cards, boolean expected) {

        setup:
        Hand hand = Hand.cheating(cards);

        expect:
        Dealer.isThreeCard(hand) == expected

        where:
        useCase          | cards            | expected
        "ワンペア　　　　　　　　　　" | ワンペア()           | false
        "ツーペア　　　　　　　　　　" | ツーペア()           | false
        "スリーカード　　　　　　　　" | スリーカード()         | true
        "スリーカード　　　　　　　　" | スリーカード_JOKER()   | true
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

    def "IsFourCard_#useCase"(String useCase, List<Card> cards, boolean expected) {

        setup:
        Hand hand = Hand.cheating(cards);

        expect:
        Dealer.isFourCard(hand) == expected

        where:
        useCase          | cards            | expected
        "ワンペア　　　　　　　　　　" | ワンペア()           | false
        "ツーペア　　　　　　　　　　" | ツーペア()           | false
        "スリーカード　　　　　　　　" | スリーカード()         | false
        "フォーカード　　　　　　　　" | フォーカード()         | true
        "フォーカード　　　　　　　　" | フォーカード_JOKER()   | true
        "ファイブカード　　　　　　　" | ファイブカード()        | false
        "フラッシュ　　　　　　　　　" | フラッシュ()          | false
        "フルハウス　　　　　　　　　" | フルハウス()          | false
        "ストレート　　　　　　　　　" | ストレート()          | false
        "ロイヤル　　　　　　　　　　" | ロイヤル()           | false
        "ストレートフラッシ　　　　　" | ストレートフラッシュ()     | false
        "ロイヤルストレートフラッシュ" | ロイヤルストレートフラッシュ() | false
        "ノーペア　　　　　　　　　　" | ノーペア()           | false

    }

    def "IsFiveCard_#useCase"(String useCase, List<Card> cards, boolean expected) {

        setup:
        Hand hand = Hand.cheating(cards);

        expect:
        Dealer.isFiveCard(hand) == expected

        where:
        useCase          | cards            | expected
        "ワンペア　　　　　　　　　　" | ワンペア()           | false
        "ツーペア　　　　　　　　　　" | ツーペア()           | false
        "スリーカード　　　　　　　　" | スリーカード()         | false
        "フォーカード　　　　　　　　" | フォーカード()         | false
        "ファイブカード　　　　　　　" | ファイブカード_JOKER()  | true
        "フラッシュ　　　　　　　　　" | フラッシュ()          | false
        "フルハウス　　　　　　　　　" | フルハウス()          | false
        "ストレート　　　　　　　　　" | ストレート()          | false
        "ロイヤル　　　　　　　　　　" | ロイヤル()           | false
        "ストレートフラッシ　　　　　" | ストレートフラッシュ()     | false
        "ロイヤルストレートフラッシュ" | ロイヤルストレートフラッシュ() | false
        "ノーペア　　　　　　　　　　" | ノーペア()           | false

    }

    def "IsFlush_#useCase"(String useCase, List<Card> cards, boolean expected) {

        setup:
        Hand hand = Hand.cheating(cards);

        expect:
        Dealer.isFlush(hand) == expected

        where:
        useCase            | cards            | expected
        "ワンペア　　　　　　　　　　"   | ワンペア()           | false
        "ツーペア　　　　　　　　　　"   | ツーペア()           | false
        "スリーカード　　　　　　　　"   | スリーカード()         | false
        "フォーカード　　　　　　　　"   | フォーカード()         | false
        "ファイブカード　　　　　　　"   | ファイブカード()        | false
        "フラッシュ　　　　　　　　　"   | フラッシュ()          | true
        "フラッシュ_JOKER　　　　　" | フラッシュ_JOKER()    | true
        "フルハウス　　　　　　　　　"   | フルハウス()          | false
        "ストレート　　　　　　　　　"   | ストレート()          | false
        "ロイヤル　　　　　　　　　　"   | ロイヤル()           | false
        "ストレートフラッシ　　　　　"   | ストレートフラッシュ()     | true
        "ロイヤルストレートフラッシュ"   | ロイヤルストレートフラッシュ() | true
        "ノーペア　　　　　　　　　　"   | ノーペア()           | false

    }

    def "IsFullHouse_#useCase"(String useCase, List<Card> cards, boolean expected) {

        setup:
        Hand hand = Hand.cheating(cards);

        expect:
        Dealer.isFullHouse(hand) == expected

        where:
        useCase            | cards             | expected
        "ワンペア　　　　　　　　　　"   | ワンペア()            | false
        "ツーペア　　　　　　　　　　"   | ツーペア()            | false
        "スリーカード　　　　　　　　"   | スリーカード()          | false
        "フォーカード　　　　　　　　"   | フォーカード()          | false
        "ファイブカード　　　　　　　"   | ファイブカード()         | false
        "フラッシュ　　　　　　　　　"   | フラッシュ()           | false
        "フルハウス　　　　　　　　　"   | フルハウス()           | true
        "フルハウス_3_1　　　　　　　" | フルハウス_3_1_JOKER() | true
        "フルハウス_2_2　　　　　　　" | フルハウス_2_2_JOKER() | true
        "ストレート　　　　　　　　　"   | ストレート()           | false
        "ロイヤル　　　　　　　　　　"   | ロイヤル()            | false
        "ストレートフラッシ　　　　　"   | ストレートフラッシュ()      | false
        "ロイヤルストレートフラッシュ"   | ロイヤルストレートフラッシュ()  | false
        "ノーペア　　　　　　　　　　"   | ノーペア()            | false

    }

    def "IsStraight_#useCase"(String useCase, List<Card> cards, boolean expected) {

        setup:
        Hand hand = Hand.cheating(cards);

        expect:
        Dealer.isStraight(hand) == expected

        where:
        useCase             | cards            | expected
        "ワンペア　　　　　　　　　　"    | ワンペア()           | false
        "ツーペア　　　　　　　　　　"    | ツーペア()           | false
        "スリーカード　　　　　　　　"    | スリーカード()         | false
        "フォーカード　　　　　　　　"    | フォーカード()         | false
        "ファイブカード　　　　　　　"    | ファイブカード()        | false
        "フラッシュ　　　　　　　　　"    | フラッシュ()          | false
        "フルハウス　　　　　　　　　"    | フルハウス()          | false
        "ストレート　　　　　　　　　"    | ストレート()          | true
        "ストレート_1_JOKER　　　　" | ストレート_1_JOKER()  | true
        "ストレート_2_JOKER　　　　" | ストレート_2_JOKER()  | true
        "ストレート_3_JOKER　　　　" | ストレート_3_JOKER()  | true
        "ストレート_4_JOKER　　　　" | ストレート_4_JOKER()  | true
        "ストレート_5_JOKER　　　　" | ストレート_5_JOKER()  | true
        "ロイヤル　　　　　　　　　　"    | ロイヤル()           | true
        "ストレートフラッシ　　　　　"    | ストレートフラッシュ()     | true
        "ロイヤルストレートフラッシュ"    | ロイヤルストレートフラッシュ() | true
        "ノーペア　　　　　　　　　　"    | ノーペア()           | false
    }

    def "IsRoyal_#useCase"(String useCase, List<Card> cards, boolean expected) {

        setup:
        Hand hand = Hand.cheating(cards);

        expect:
        Dealer.isRoyal(hand) == expected

        where:
        useCase          | cards            | expected
        "ワンペア　　　　　　　　　　" | ワンペア()           | false
        "ツーペア　　　　　　　　　　" | ツーペア()           | false
        "スリーカード　　　　　　　　" | スリーカード()         | false
        "フォーカード　　　　　　　　" | フォーカード()         | false
        "ファイブカード　　　　　　　" | ファイブカード()        | false
        "フラッシュ　　　　　　　　　" | フラッシュ()          | false
        "フルハウス　　　　　　　　　" | フルハウス()          | false
        "ストレート　　　　　　　　　" | ストレート()          | false
        "ロイヤル　　　　　　　　　　" | ロイヤル()           | true
        "ロイヤル_1　　　　　　　　" | ロイヤル_JOKER_1()   | false
        "ロイヤル_2　　　　　　　　" | ロイヤル_JOKER_2()   | true
        "ロイヤル_3　　　　　　　　" | ロイヤル_JOKER_3()   | true
        "ロイヤル_4　　　　　　　　" | ロイヤル_JOKER_4()   | true
        "ロイヤル_5　　　　　　　　" | ロイヤル_JOKER_5()   | true
        "ストレートフラッシ　　　　　" | ストレートフラッシュ()     | false
        "ロイヤルストレートフラッシュ" | ロイヤルストレートフラッシュ() | true
        "ノーペア　　　　　　　　　　" | ノーペア()           | false

    }

    def "IsStraightFlush_#useCase"(String useCase, List<Card> cards, boolean expected) {

        setup:
        Hand hand = Hand.cheating(cards);

        expect:
        Dealer.isStraightFlush(hand) == expected

        where:
        useCase           | cards                | expected
        "ワンペア　　　　　　　　　　"  | ワンペア()               | false
        "ツーペア　　　　　　　　　　"  | ツーペア()               | false
        "スリーカード　　　　　　　　"  | スリーカード()             | false
        "フォーカード　　　　　　　　"  | フォーカード()             | false
        "ファイブカード　　　　　　　"  | ファイブカード()            | false
        "フラッシュ　　　　　　　　　"  | フラッシュ()              | false
        "フルハウス　　　　　　　　　"  | フルハウス()              | false
        "ストレート　　　　　　　　　"  | ストレート()              | false
        "ロイヤル　　　　　　　　　　"  | ロイヤル()               | false
        "ストレートフラッシ　　　　　"  | ストレートフラッシュ()         | true
        "ストレートフラッシ_1　　　　" | ストレートフラッシュ_JOKER_1() | true
        "ストレートフラッシ_2　　　　" | ストレートフラッシュ_JOKER_2() | true
        "ストレートフラッシ_3　　　　" | ストレートフラッシュ_JOKER_3() | true
        "ストレートフラッシ_4　　　　" | ストレートフラッシュ_JOKER_4() | true
        "ストレートフラッシ_5　　　　" | ストレートフラッシュ_JOKER_5() | true
        "ロイヤルストレートフラッシュ"  | ロイヤルストレートフラッシュ()     | true
        "ノーペア　　　　　　　　　　"  | ノーペア()               | false

    }

    def "IsRoyalStraightFlush_#useCase"(String useCase, List<Card> cards, boolean expected) {

        setup:
        Hand hand = Hand.cheating(cards);

        expect:
        Dealer.isRoyalStraightFlush(hand) == expected

        where:
        useCase            | cards                    | expected
        "ワンペア　　　　　　　　　　"   | ワンペア()                   | false
        "ツーペア　　　　　　　　　　"   | ツーペア()                   | false
        "スリーカード　　　　　　　　"   | スリーカード()                 | false
        "フォーカード　　　　　　　　"   | フォーカード()                 | false
        "ファイブカード　　　　　　　"   | ファイブカード()                | false
        "フラッシュ　　　　　　　　　"   | フラッシュ()                  | false
        "フルハウス　　　　　　　　　"   | フルハウス()                  | false
        "ストレート　　　　　　　　　"   | ストレート()                  | false
        "ロイヤル　　　　　　　　　　"   | ロイヤル()                   | false
        "ストレートフラッシ　　　　　"   | ストレートフラッシュ()             | false
        "ロイヤルストレートフラッシュ"   | ロイヤルストレートフラッシュ()         | true
        "ロイヤルストレートフラッシュ_1" | ロイヤルストレートフラッシュ_JOKER_1() | false
        "ロイヤルストレートフラッシュ_2" | ロイヤルストレートフラッシュ_JOKER_2() | true
        "ロイヤルストレートフラッシュ_3" | ロイヤルストレートフラッシュ_JOKER_3() | true
        "ロイヤルストレートフラッシュ_4" | ロイヤルストレートフラッシュ_JOKER_4() | true
        "ロイヤルストレートフラッシュ_5" | ロイヤルストレートフラッシュ_JOKER_5() | true
        "ノーペア　　　　　　　　　　"   | ノーペア()                   | false

    }

}
