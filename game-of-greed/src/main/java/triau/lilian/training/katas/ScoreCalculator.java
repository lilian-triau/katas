package triau.lilian.training.katas;

import static triau.lilian.training.katas.Die.SIX;

import java.util.List;

public class ScoreCalculator {

    private DieScoreCalculator dieScoreCalculator = new DieScoreCalculator();

    public Integer calculate(List<Die> dice) {

        if (isRoundFailed(dice)) {
            return 0;
        }

        Integer score = 0;
        for (Die die : Die.values()) {
            score += dieScoreCalculator.calculate(die, dice);
        }

        return score;
    }

    private boolean isRoundFailed(List<Die> dice) {
        return dice.contains(SIX);
    }

}
