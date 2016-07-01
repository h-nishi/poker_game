package jp.co.biglobe.isp.hand

import jp.co.biglobe.isp.poker.Rank
import jp.co.biglobe.isp.poker.Soot
import jp.co.biglobe.isp.trump.PlainTrump
import jp.co.biglobe.isp.trump.Trump
import spock.lang.Specification
import spock.lang.Unroll

import static jp.co.biglobe.isp.poker.Rank.*
import static jp.co.biglobe.isp.poker.Soot.*

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
        useCase   | trumps                                                                                      | expected
        "ワンペア"    | deal(trump(クローバー, A), trump(ハート, A), trump(クローバー, _2), trump(クローバー, _3), trump(クローバー, _4))  | true
        "ツーペア"    | deal(trump(クローバー, A), trump(ハート, A), trump(クローバー, _2), trump(クローバー, _2), trump(クローバー, _4))  | false
        "スリーカード"  | deal(trump(クローバー, A), trump(ハート, A), trump(ダイヤ, A), trump(クローバー, _2), trump(クローバー, _4))     | false
        "フォーカード"  | deal(trump(クローバー, A), trump(ハート, A), trump(ダイヤ, A), trump(クローバー, A), trump(クローバー, _4))      | false
        "ファイブカード" | deal(trump(クローバー, A), trump(ハート, A), trump(ダイヤ, A), trump(クローバー, A), trump(クローバー, A))       | false
        "何もない"    | deal(trump(クローバー, A), trump(ハート, _6), trump(クローバー, _2), trump(クローバー, _3), trump(クローバー, _4)) | false

    }

    def "IsTwoPare_#useCase"(String useCase, List<Trump> trumps, boolean expected) {

        Hand sut = Hand.cheating(trumps);

        expect:
        sut.isTwoPare() == expected

        where:
        useCase   | trumps                                                                                      | expected
        "ワンペア"    | deal(trump(クローバー, A), trump(ハート, A), trump(クローバー, _2), trump(クローバー, _3), trump(クローバー, _4))  | false
        "ツーペア"    | deal(trump(クローバー, A), trump(ハート, A), trump(クローバー, _2), trump(クローバー, _2), trump(クローバー, _4))  | true
        "スリーカード"  | deal(trump(クローバー, A), trump(ハート, A), trump(ダイヤ, A), trump(クローバー, _2), trump(クローバー, _4))     | false
        "フォーカード"  | deal(trump(クローバー, A), trump(ハート, A), trump(ダイヤ, A), trump(クローバー, A), trump(クローバー, _4))      | false
        "ファイブカード" | deal(trump(クローバー, A), trump(ハート, A), trump(ダイヤ, A), trump(クローバー, A), trump(クローバー, A))       | false
        "何もない"    | deal(trump(クローバー, A), trump(ハート, _6), trump(クローバー, _2), trump(クローバー, _3), trump(クローバー, _4)) | false

    }

    def "IsThreeCard_#useCase"(String useCase, List<Trump> trumps, boolean expected) {

        Hand sut = Hand.cheating(trumps);

        expect:
        sut.isThreeCard() == expected

        where:
        useCase   | trumps                                                                                      | expected
        "ワンペア"    | deal(trump(クローバー, A), trump(ハート, A), trump(クローバー, _2), trump(クローバー, _3), trump(クローバー, _4))  | false
        "ツーペア"    | deal(trump(クローバー, A), trump(ハート, A), trump(クローバー, _2), trump(クローバー, _2), trump(クローバー, _4))  | false
        "スリーカード"  | deal(trump(クローバー, A), trump(ハート, A), trump(ダイヤ, A), trump(クローバー, _2), trump(クローバー, _4))     | true
        "フォーカード"  | deal(trump(クローバー, A), trump(ハート, A), trump(ダイヤ, A), trump(クローバー, A), trump(クローバー, _4))      | false
        "ファイブカード" | deal(trump(クローバー, A), trump(ハート, A), trump(ダイヤ, A), trump(クローバー, A), trump(クローバー, A))       | false
        "何もない"    | deal(trump(クローバー, A), trump(ハート, _6), trump(クローバー, _2), trump(クローバー, _3), trump(クローバー, _4)) | false

    }

    def "IsFourCard_#useCase"(String useCase, List<Trump> trumps, boolean expected) {

        Hand sut = Hand.cheating(trumps);

        expect:
        sut.isFourCard() == expected

        where:
        useCase   | trumps                                                                                      | expected
        "ワンペア"    | deal(trump(クローバー, A), trump(ハート, A), trump(クローバー, _2), trump(クローバー, _3), trump(クローバー, _4))  | false
        "ツーペア"    | deal(trump(クローバー, A), trump(ハート, A), trump(クローバー, _2), trump(クローバー, _2), trump(クローバー, _4))  | false
        "スリーカード"  | deal(trump(クローバー, A), trump(ハート, A), trump(ダイヤ, A), trump(クローバー, _2), trump(クローバー, _4))     | false
        "フォーカード"  | deal(trump(クローバー, A), trump(ハート, A), trump(ダイヤ, A), trump(クローバー, A), trump(クローバー, _4))      | true
        "ファイブカード" | deal(trump(クローバー, A), trump(ハート, A), trump(ダイヤ, A), trump(クローバー, A), trump(クローバー, A))       | false
        "何もない"    | deal(trump(クローバー, A), trump(ハート, _6), trump(クローバー, _2), trump(クローバー, _3), trump(クローバー, _4)) | false

    }

    def "IsFiveCard_#useCase"(String useCase, List<Trump> trumps, boolean expected) {

        Hand sut = Hand.cheating(trumps);

        expect:
        sut.isFiveCard() == expected

        where:
        useCase   | trumps                                                                                      | expected
        "ワンペア"    | deal(trump(クローバー, A), trump(ハート, A), trump(クローバー, _2), trump(クローバー, _3), trump(クローバー, _4))  | false
        "ツーペア"    | deal(trump(クローバー, A), trump(ハート, A), trump(クローバー, _2), trump(クローバー, _2), trump(クローバー, _4))  | false
        "スリーカード"  | deal(trump(クローバー, A), trump(ハート, A), trump(ダイヤ, A), trump(クローバー, _2), trump(クローバー, _4))     | false
        "フォーカード"  | deal(trump(クローバー, A), trump(ハート, A), trump(ダイヤ, A), trump(クローバー, A), trump(クローバー, _4))      | false
        "ファイブカード" | deal(trump(クローバー, A), trump(ハート, A), trump(ダイヤ, A), trump(クローバー, A), trump(クローバー, A))       | true
        "何もない"    | deal(trump(クローバー, A), trump(ハート, _5), trump(クローバー, _2), trump(クローバー, _3), trump(クローバー, _4)) | false

    }

    def "IsFlash_#useCase"(String useCase, List<Trump> trumps, boolean expected) {

        Hand sut = Hand.cheating(trumps);

        expect:
        sut.isFlash() == expected

        where:
        useCase   | trumps                                                                                        | expected
        "ワンペア"    | deal(trump(クローバー, A), trump(ハート, A), trump(クローバー, _2), trump(クローバー, _3), trump(クローバー, _4))    | false
        "ツーペア"    | deal(trump(クローバー, A), trump(ハート, A), trump(クローバー, _2), trump(クローバー, _2), trump(クローバー, _4))    | false
        "スリーカード"  | deal(trump(クローバー, A), trump(ハート, A), trump(ダイヤ, A), trump(クローバー, _2), trump(クローバー, _4))       | false
        "フォーカード"  | deal(trump(クローバー, A), trump(ハート, A), trump(ダイヤ, A), trump(クローバー, A), trump(クローバー, _4))        | false
        "ファイブカード" | deal(trump(クローバー, A), trump(ハート, A), trump(ダイヤ, A), trump(クローバー, A), trump(クローバー, A))         | false
        "フラッシュ"   | deal(trump(クローバー, A), trump(クローバー, _2), trump(クローバー, _4), trump(クローバー, _5), trump(クローバー, _6)) | true
        "何もない"    | deal(trump(クローバー, A), trump(ハート, _6), trump(クローバー, _2), trump(クローバー, _3), trump(クローバー, _4))   | false

    }

    def "IsFullHouse_#useCase"(String useCase, List<Trump> trumps, boolean expected) {

        Hand sut = Hand.cheating(trumps);

        expect:
        sut.isFullHouse() == expected

        where:
        useCase   | trumps                                                                                        | expected
        "ワンペア"    | deal(trump(クローバー, A), trump(ハート, A), trump(クローバー, _2), trump(クローバー, _3), trump(クローバー, _4))    | false
        "ツーペア"    | deal(trump(クローバー, A), trump(ハート, A), trump(クローバー, _2), trump(クローバー, _2), trump(クローバー, _4))    | false
        "スリーカード"  | deal(trump(クローバー, A), trump(ハート, A), trump(ダイヤ, A), trump(クローバー, _2), trump(クローバー, _4))       | false
        "フォーカード"  | deal(trump(クローバー, A), trump(ハート, A), trump(ダイヤ, A), trump(クローバー, A), trump(クローバー, _4))        | false
        "ファイブカード" | deal(trump(クローバー, A), trump(ハート, A), trump(ダイヤ, A), trump(クローバー, A), trump(クローバー, A))         | false
        "フラッシュ"   | deal(trump(クローバー, A), trump(クローバー, _2), trump(クローバー, _4), trump(クローバー, _5), trump(クローバー, _6)) | false
        "フルハウス"   | deal(trump(クローバー, A), trump(ハート, A), trump(クローバー, A), trump(ハート, _5), trump(クローバー, _5))       | true
        "何もない"    | deal(trump(クローバー, A), trump(ハート, _6), trump(クローバー, _2), trump(クローバー, _3), trump(クローバー, _4))   | false

    }

    def "IsStraight_#useCase"(String useCase, List<Trump> trumps, boolean expected) {

        Hand sut = Hand.cheating(trumps);

        expect:
        sut.isStraight() == expected

        where:
        useCase      | trumps                                                                                        | expected
        "ワンペア"       | deal(trump(クローバー, A), trump(ハート, A), trump(クローバー, _2), trump(クローバー, _3), trump(クローバー, _4))    | false
        "ツーペア"       | deal(trump(クローバー, A), trump(ハート, A), trump(クローバー, _2), trump(クローバー, _2), trump(クローバー, _4))    | false
        "スリーカード"     | deal(trump(クローバー, A), trump(ハート, A), trump(ダイヤ, A), trump(クローバー, _2), trump(クローバー, _4))       | false
        "フォーカード"     | deal(trump(クローバー, A), trump(ハート, A), trump(ダイヤ, A), trump(クローバー, A), trump(クローバー, _4))        | false
        "ファイブカード"    | deal(trump(クローバー, A), trump(ハート, A), trump(ダイヤ, A), trump(クローバー, A), trump(クローバー, A))         | false
        "フラッシュ"      | deal(trump(クローバー, A), trump(クローバー, _2), trump(クローバー, _4), trump(クローバー, _5), trump(クローバー, _6)) | false
        "フルハウス"      | deal(trump(クローバー, A), trump(ハート, A), trump(クローバー, A), trump(ハート, _5), trump(クローバー, _5))       | false
        "ストレート"      | deal(trump(クローバー, A), trump(ハート, _2), trump(クローバー, _3), trump(ハート, _4), trump(クローバー, _5))     | true
        "ロイヤル"       | deal(trump(クローバー, A), trump(ハート, _10), trump(クローバー, _13), trump(ハート, _11), trump(クローバー, _12)) | true
        "ストレートフラッシュ" | deal(trump(クローバー, A), trump(クローバー, _2), trump(クローバー, _3), trump(クローバー, _5), trump(クローバー, _4)) | true
        "何もない"       | deal(trump(クローバー, A), trump(ハート, _6), trump(クローバー, _2), trump(クローバー, _3), trump(クローバー, _4))   | false
    }

    def "IsRoyal_#useCase"(String useCase, List<Trump> trumps, boolean expected) {

        Hand sut = Hand.cheating(trumps);

        expect:
        sut.isRoyal() == expected

        where:
        useCase      | trumps                                                                                        | expected
        "ワンペア"       | deal(trump(クローバー, A), trump(ハート, A), trump(クローバー, _2), trump(クローバー, _3), trump(クローバー, _4))    | false
        "ツーペア"       | deal(trump(クローバー, A), trump(ハート, A), trump(クローバー, _2), trump(クローバー, _2), trump(クローバー, _4))    | false
        "スリーカード"     | deal(trump(クローバー, A), trump(ハート, A), trump(ダイヤ, A), trump(クローバー, _2), trump(クローバー, _4))       | false
        "フォーカード"     | deal(trump(クローバー, A), trump(ハート, A), trump(ダイヤ, A), trump(クローバー, A), trump(クローバー, _4))        | false
        "ファイブカード"    | deal(trump(クローバー, A), trump(ハート, A), trump(ダイヤ, A), trump(クローバー, A), trump(クローバー, A))         | false
        "フラッシュ"      | deal(trump(クローバー, A), trump(クローバー, _2), trump(クローバー, _4), trump(クローバー, _5), trump(クローバー, _6)) | false
        "フルハウス"      | deal(trump(クローバー, A), trump(ハート, A), trump(クローバー, A), trump(ハート, _5), trump(クローバー, _5))       | false
        "ストレート"      | deal(trump(クローバー, A), trump(ハート, _2), trump(クローバー, _3), trump(ハート, _4), trump(クローバー, _5))     | false
        "ロイヤル"       | deal(trump(クローバー, A), trump(ハート, _10), trump(クローバー, _13), trump(ハート, _11), trump(クローバー, _12)) | true
        "ストレートフラッシュ" | deal(trump(クローバー, A), trump(クローバー, _2), trump(クローバー, _3), trump(クローバー, _5), trump(クローバー, _4)) | false
        "何もない"       | deal(trump(クローバー, A), trump(ハート, _6), trump(クローバー, _2), trump(クローバー, _3), trump(クローバー, _4))   | false

    }

    def "IsStraightFlash#useCase"(String useCase, List<Trump> trumps, boolean expected) {

        Hand sut = Hand.cheating(trumps);

        expect:
        sut.isStraightFlash() == expected

        where:
        useCase      | trumps                                                                                        | expected
        "ワンペア"       | deal(trump(クローバー, A), trump(ハート, A), trump(クローバー, _2), trump(クローバー, _3), trump(クローバー, _4))    | false
        "ツーペア"       | deal(trump(クローバー, A), trump(ハート, A), trump(クローバー, _2), trump(クローバー, _2), trump(クローバー, _4))    | false
        "スリーカード"     | deal(trump(クローバー, A), trump(ハート, A), trump(ダイヤ, A), trump(クローバー, _2), trump(クローバー, _4))       | false
        "フォーカード"     | deal(trump(クローバー, A), trump(ハート, A), trump(ダイヤ, A), trump(クローバー, A), trump(クローバー, _4))        | false
        "ファイブカード"    | deal(trump(クローバー, A), trump(ハート, A), trump(ダイヤ, A), trump(クローバー, A), trump(クローバー, A))         | false
        "フラッシュ"      | deal(trump(クローバー, A), trump(クローバー, _2), trump(クローバー, _4), trump(クローバー, _5), trump(クローバー, _6)) | false
        "フルハウス"      | deal(trump(クローバー, A), trump(ハート, A), trump(クローバー, A), trump(ハート, _5), trump(クローバー, _5))       | false
        "ストレート"      | deal(trump(クローバー, A), trump(ハート, _2), trump(クローバー, _3), trump(ハート, _4), trump(クローバー, _5))     | false
        "ロイヤル"       | deal(trump(クローバー, A), trump(ハート, _10), trump(クローバー, _13), trump(ハート, _11), trump(クローバー, _12)) | false
        "ストレートフラッシュ" | deal(trump(クローバー, A), trump(クローバー, _2), trump(クローバー, _3), trump(クローバー, _5), trump(クローバー, _4)) | true
        "ストレートフラッシュ" | deal(trump(クローバー, A), trump(クローバー, _2), trump(クローバー, _3), trump(クローバー, _5), trump(クローバー, _4)) | true
        "何もない"       | deal(trump(クローバー, A), trump(ハート, _6), trump(クローバー, _2), trump(クローバー, _3), trump(クローバー, _4))   | false

    }

    def "IsRoyalStraightFlash#useCase"(String useCase, List<Trump> trumps, boolean expected) {

        Hand sut = Hand.cheating(trumps);

        expect:
        sut.isRoyalStraightFlash() == expected

        where:
        useCase          | trumps                                                                                            | expected
        "ワンペア"           | deal(trump(クローバー, A), trump(ハート, A), trump(クローバー, _2), trump(クローバー, _3), trump(クローバー, _4))        | false
        "ツーペア"           | deal(trump(クローバー, A), trump(ハート, A), trump(クローバー, _2), trump(クローバー, _2), trump(クローバー, _4))        | false
        "スリーカード"         | deal(trump(クローバー, A), trump(ハート, A), trump(ダイヤ, A), trump(クローバー, _2), trump(クローバー, _4))           | false
        "フォーカード"         | deal(trump(クローバー, A), trump(ハート, A), trump(ダイヤ, A), trump(クローバー, A), trump(クローバー, _4))            | false
        "ファイブカード"        | deal(trump(クローバー, A), trump(ハート, A), trump(ダイヤ, A), trump(クローバー, A), trump(クローバー, A))             | false
        "フラッシュ"          | deal(trump(クローバー, A), trump(クローバー, _2), trump(クローバー, _4), trump(クローバー, _5), trump(クローバー, _6))     | false
        "フルハウス"          | deal(trump(クローバー, A), trump(ハート, A), trump(クローバー, A), trump(ハート, _5), trump(クローバー, _5))           | false
        "ストレート"          | deal(trump(クローバー, A), trump(ハート, _2), trump(クローバー, _3), trump(ハート, _4), trump(クローバー, _5))         | false
        "ロイヤル"           | deal(trump(クローバー, A), trump(ハート, _10), trump(クローバー, _13), trump(ハート, _11), trump(クローバー, _12))     | false
        "ストレートフラッシュ"     | deal(trump(クローバー, A), trump(クローバー, _2), trump(クローバー, _3), trump(クローバー, _5), trump(クローバー, _4))     | false
        "ロイヤルストレートフラッシュ" | deal(trump(クローバー, A), trump(クローバー, _10), trump(クローバー, _13), trump(クローバー, _11), trump(クローバー, _12)) | true
        "何もない"           | deal(trump(クローバー, A), trump(ハート, _6), trump(クローバー, _2), trump(クローバー, _3), trump(クローバー, _4))       | false

    }

    /************************************************************************************
     *  以降の記述は補助用のメソッドを用意しているだけなので、気にしないで下さい。
     ************************************************************************************/
    private static PlainTrump trump(
            Soot soot,
            Rank rank
    ) {
        return new PlainTrump(soot, rank);
    }

    private static List<Trump> deal(
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
