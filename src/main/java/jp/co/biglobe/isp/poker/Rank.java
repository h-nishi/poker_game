package jp.co.biglobe.isp.poker;

/**
 * 絵札と数札
 */
public enum Rank implements RankGeneral {
    A(1),
    _2(2),
    _3(3),
    _4(4),
    _5(5),
    _6(6),
    _7(7),
    _8(8),
    _9(9),
    _10(10),
    _11(11),
    _12(12),
    _13(13);

    private final int rank;

    Rank(int rank) {
        this.rank = rank;
    }

    public int getRank() {
        return rank;
    }

    public String getValue() {
        return this.toString();
    }
}
