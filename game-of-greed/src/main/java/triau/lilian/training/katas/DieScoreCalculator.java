package triau.lilian.training.katas;

import java.util.Collections;
import java.util.List;

public class DieScoreCalculator {

    public Integer calculate(Die die, List<Die> dice) {
        Integer diceCount = Collections.frequency(dice, die);

        Integer tripleCount = (diceCount / 3);
        Integer leftover = (diceCount % 3);

        Integer score = tripleCount * die.getTripleValue();
        score += leftover * die.getBaseValue();

        return score;
    }

}
