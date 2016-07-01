package jp.co.biglobe.isp.Deck;

import jp.co.biglobe.isp.trump.Trump;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

/**
 * デッキ
 */
public class Deck {

    public static int TRUMP_TOTAL_NUMBER = 53;

    private final LinkedList<Trump> trumps;

    public Deck() {
        this.trumps = createDeck();
    }

    private LinkedList<Trump> createDeck() {

        LinkedList<Trump> trumps = new LinkedList<>();
        MasterDeck masterDeck = new MasterDeck();
        Random rand = new Random();

        boolean count[] = new boolean[TRUMP_TOTAL_NUMBER];
        for (int i = 0; i < TRUMP_TOTAL_NUMBER; i++) {
            count[i] = false;
        }

        for (int i = 0; i < TRUMP_TOTAL_NUMBER; ) {
            int index = rand.nextInt(TRUMP_TOTAL_NUMBER);
            if (!count[index]) {
                trumps.push(masterDeck.getTrump(index));
                i++;
            }
        }
        return trumps;
    }

    public List<Trump> drow(int number) {
        List<Trump> list = new ArrayList<>();
        for (int i = 0; i < number; i++) {
            if(trumps.isEmpty()){
                throw new RuntimeException("もう、カードがないよ");
            }
            list.add(trumps.pop());
        }
        return list;
    }

    public List<Trump> deal() {
        
        List<Trump> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            if(trumps.isEmpty()){
                throw new RuntimeException("もう、カードがないよ");
            }
            list.add(trumps.pop());
        }
        return list;
    }

}
