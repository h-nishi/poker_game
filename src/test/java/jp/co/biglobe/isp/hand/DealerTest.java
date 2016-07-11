package jp.co.biglobe.isp.hand;

import org.junit.Test;

import static jp.co.biglobe.isp.hand.HandFixture.card;
import static jp.co.biglobe.isp.hand.HandFixture.deal;
import static jp.co.biglobe.isp.poker.Rank.*;
import static jp.co.biglobe.isp.poker.Suit.クローバー;
import static jp.co.biglobe.isp.poker.Suit.ハート;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class DealerTest {

    @Test
    public void test_ワンペア() throws Exception {

        // 条件の作成
        Hand hand = Hand.cheating(deal(
                        card(クローバー, A),
                        card(ハート, A),
                        card(クローバー, _2),
                        card(クローバー, _3),
                        card(クローバー, _4))
        );

        // 処理
        WinningHand actual = Dealer.judgeHand(hand);

        // 結果の判定
        assertThat(actual, is(WinningHand.ワンペア));

    }
}