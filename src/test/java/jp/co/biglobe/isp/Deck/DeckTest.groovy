package jp.co.biglobe.isp.Deck

import jp.co.biglobe.isp.hand.Hand
import spock.lang.Specification

class DeckTest extends Specification {

    private Deck deck;

    def setup() {
        deck = new Deck();
    }

    def 正常() {

        setup:
        Hand sut = Hand.create(deck);

        expect:
        true
//        sut.getTrump(4) == new PlainTrump(Soot.スペード, Rank.A)

    }

}
