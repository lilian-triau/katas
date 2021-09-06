package triau.lilian.training.katas;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static triau.lilian.training.katas.Die.FIVE;
import static triau.lilian.training.katas.Die.FOUR;
import static triau.lilian.training.katas.Die.ONE;
import static triau.lilian.training.katas.Die.SIX;
import static triau.lilian.training.katas.Die.THREE;
import static triau.lilian.training.katas.Die.TWO;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

public class ScoreCalculatorTest {

    private ScoreCalculator scoreCalculator = new ScoreCalculator();

    @Test
    public void calculateWhenThereIsASixShouldReturn0() {
        List<Die> diceRoll = Arrays.asList(ONE, TWO, THREE, FOUR, FIVE, SIX);

        Integer actual = scoreCalculator.calculate(diceRoll);

        Integer expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void calculateWhenTheRollIs1ShouldReturn100() {
        List<Die> diceRoll = Arrays.asList(ONE);

        Integer actual = scoreCalculator.calculate(diceRoll);

        Integer expected = 100;
        assertEquals(expected, actual);
    }

    @Test
    public void calculateWhenTheRollIsASingle5ShouldReturn50() {
        List<Die> diceRoll = Arrays.asList(FIVE);

        Integer actual = scoreCalculator.calculate(diceRoll);

        Integer expected = 50;
        assertEquals(expected, actual);
    }

    @Test
    public void calculateWhenTheRollIsADouble2ShouldReturn0() {
        List<Die> diceRoll = Arrays.asList(TWO, TWO);

        Integer actual = scoreCalculator.calculate(diceRoll);

        Integer expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void calculateWhenTheRollIsADouble3ShouldReturn0() {
        List<Die> diceRoll = Arrays.asList(THREE, THREE);

        Integer actual = scoreCalculator.calculate(diceRoll);

        Integer expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void calculateWhenTheRollIsADouble4ShouldReturn0() {
        List<Die> diceRoll = Arrays.asList(FOUR, FOUR);

        Integer actual = scoreCalculator.calculate(diceRoll);

        Integer expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void calculateWhenTheRollIsADouble2Double3AndDouble4ShouldReturn0() {
        List<Die> diceRoll = Arrays.asList(FOUR, TWO, THREE, FOUR, THREE, TWO);

        Integer actual = scoreCalculator.calculate(diceRoll);

        Integer expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void calculateWhenTheRollIsADouble5ShouldReturn100() {
        List<Die> diceRoll = Arrays.asList(FIVE, FIVE);

        Integer actual = scoreCalculator.calculate(diceRoll);

        Integer expected = 100;
        assertEquals(expected, actual);
    }

    @Test
    public void calculateWhenTheRollIsATriple1ShouldReturn1000() {
        List<Die> diceRoll = Arrays.asList(ONE, ONE, ONE);

        Integer actual = scoreCalculator.calculate(diceRoll);

        Integer expected = 1000;
        assertEquals(expected, actual);
    }

    @Test
    public void calculateWhenTheRollIsATriple2ShouldReturn200() {
        List<Die> diceRoll = Arrays.asList(TWO, TWO, TWO);

        Integer actual = scoreCalculator.calculate(diceRoll);

        Integer expected = 200;
        assertEquals(expected, actual);
    }

    @Test
    public void calculateWhenTheRollIsATriple3ShouldReturn300() {
        List<Die> diceRoll = Arrays.asList(THREE, THREE, THREE);

        Integer actual = scoreCalculator.calculate(diceRoll);

        Integer expected = 300;
        assertEquals(expected, actual);
    }

    @Test
    public void calculateWhenTheRollIsATriple4ShouldReturn400() {
        List<Die> diceRoll = Arrays.asList(FOUR, FOUR, FOUR);

        Integer actual = scoreCalculator.calculate(diceRoll);

        Integer expected = 400;
        assertEquals(expected, actual);
    }

    @Test
    public void calculateWhenTheRollIsATriple5ShouldReturn500() {
        List<Die> diceRoll = Arrays.asList(FIVE, FIVE, FIVE);

        Integer actual = scoreCalculator.calculate(diceRoll);

        Integer expected = 500;
        assertEquals(expected, actual);
    }

    @Test
    public void calculateWhenTheRollIsAQuadruple1ShouldReturn1100() {
        List<Die> diceRoll = Arrays.asList(ONE, ONE, ONE, ONE);

        Integer actual = scoreCalculator.calculate(diceRoll);

        Integer expected = 1100;
        assertEquals(expected, actual);
    }

    @Test
    public void calculateWhenTheRollIsASeptuple4ShouldReturn800() {
        List<Die> diceRoll = Arrays.asList(FOUR, FOUR, FOUR, FOUR, FOUR, FOUR, FOUR);

        Integer actual = scoreCalculator.calculate(diceRoll);

        Integer expected = 800;
        assertEquals(expected, actual);
    }

    @Test
    public void calculateWhithRandomRollOf112534252ShouldReturn500() {
        List<Die> diceRoll = Arrays.asList(ONE, ONE, TWO, FIVE, THREE, FOUR, TWO, FIVE, TWO);

        Integer actual = scoreCalculator.calculate(diceRoll);

        Integer expected = 500;
        assertEquals(expected, actual);
    }

    @Test
    public void calculateWhithRandomRollOf543625114ShouldReturn0() {
        List<Die> diceRoll = Arrays.asList(FIVE, FOUR, THREE, SIX, TWO, FIVE, ONE, ONE, FOUR);

        Integer actual = scoreCalculator.calculate(diceRoll);

        Integer expected = 0;
        assertEquals(expected, actual);
    }
}
