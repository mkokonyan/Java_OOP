package L01_WorkingWithAbstraction.b_exercise.P03_CardsWithPower;

public class Card {
    RankPowers rankPowers;
    SuitPowers suitPowers;

    public Card(RankPowers rankPowers, SuitPowers suitPowers) {
        this.rankPowers = rankPowers;
        this.suitPowers = suitPowers;
    }

    public int getTotalPower() {
        return rankPowers.getPower() + suitPowers.getPower();
    }
}
