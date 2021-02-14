package org.lilian.katas;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class GenerationSimulatorTest {

//	private GenerationSimulator generationSimulator = new GenerationSimulator(new FlateningArrayDisplayer());
	private GenerationSimulator generationSimulator = new GenerationSimulator(new GridDisplayer());

	@Test
	public void aDeadCellWith3NeighbouringCellsAliveShouldCreateANewCell() {
		int[][] originalLife = new int[][] { { 0, 0, 0, 0, 0 }, { 0, 0, 1, 0, 0 }, { 0, 0, 1, 0, 0 }, { 0, 0, 1, 0, 0 },
				{ 0, 0, 0, 0, 0 } };
		int expected = 1;
		int rowUnderTest = 2;
		int columnUnderTest = 1;
		int generationCount = 1;

		int actual = generationSimulator.simulate(originalLife, generationCount)[rowUnderTest][columnUnderTest];

		assertEquals(expected, actual);
	}

	@Test
	public void aDeadCellWith2NeighbouringCellsAliveShouldStillBeDead() {
		int[][] originalLife = new int[][] { { 0, 0, 0, 0, 0 }, { 0, 0, 1, 0, 0 }, { 0, 0, 1, 0, 0 }, { 0, 0, 1, 0, 0 },
				{ 0, 0, 0, 0, 0 } };
		int expected = 0;
		int rowUnderTest = 1;
		int columnUnderTest = 1;
		int generationCount = 1;

		int actual = generationSimulator.simulate(originalLife, generationCount)[rowUnderTest][columnUnderTest];

		assertEquals(expected, actual);
	}

	@Test
	public void aDeadCellWith4NeighbouringCellsAliveShouldStillBeDead() {
		int[][] originalLife = new int[][] { { 0, 0, 0, 0, 0 }, { 0, 0, 1, 0, 0 }, { 1, 1, 1, 0, 0 }, { 0, 0, 1, 0, 0 },
				{ 0, 0, 0, 0, 0 } };
		int expected = 0;
		int rowUnderTest = 1;
		int columnUnderTest = 1;
		int generationCount = 1;

		int actual = generationSimulator.simulate(originalLife, generationCount)[rowUnderTest][columnUnderTest];

		assertEquals(expected, actual);
	}

	@Test
	public void aLivingCellWith2NeighbouringCellsAliveShouldStayAlive() {
		int[][] originalLife = new int[][] { { 0, 0, 0, 0, 0 }, { 0, 0, 1, 0, 0 }, { 0, 0, 1, 0, 0 }, { 0, 0, 1, 0, 0 },
				{ 0, 0, 0, 0, 0 } };
		int expected = 1;
		int rowUnderTest = 2;
		int columnUnderTest = 2;
		int generationCount = 1;

		int actual = generationSimulator.simulate(originalLife, generationCount)[rowUnderTest][columnUnderTest];

		assertEquals(expected, actual);
	}

	@Test
	public void aLivingCellWith3NeighbouringCellsAliveShouldStayAlive() {
		int[][] originalLife = new int[][] { { 0, 0, 0, 0, 0 }, { 0, 0, 1, 0, 0 }, { 0, 1, 1, 0, 0 }, { 0, 0, 1, 0, 0 },
				{ 0, 0, 0, 0, 0 } };
		int expected = 1;
		int rowUnderTest = 2;
		int columnUnderTest = 2;
		int generationCount = 1;

		int actual = generationSimulator.simulate(originalLife, generationCount)[rowUnderTest][columnUnderTest];

		assertEquals(expected, actual);
	}

	@Test
	public void aLivingCellWith1NeighbouringCellAliveShouldDie() {
		int[][] originalLife = new int[][] { { 0, 0, 0, 0, 0 }, { 0, 0, 1, 0, 0 }, { 0, 0, 1, 0, 0 }, { 0, 0, 1, 0, 0 },
				{ 0, 0, 0, 0, 0 } };
		int expected = 0;
		int rowUnderTest = 1;
		int columnUnderTest = 2;
		int generationCount = 1;

		int actual = generationSimulator.simulate(originalLife, generationCount)[rowUnderTest][columnUnderTest];

		assertEquals(expected, actual);
	}

	@Test
	public void aLivingCellWith4NeighbouringCellsAliveShouldDie() {
		int[][] originalLife = new int[][] { { 0, 0, 0, 0, 0 }, { 1, 1, 1, 0, 0 }, { 1, 1, 1, 0, 0 }, { 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0 } };
		int expected = 0;
		int rowUnderTest = 1;
		int columnUnderTest = 1;
		int generationCount = 1;

		int actual = generationSimulator.simulate(originalLife, generationCount)[rowUnderTest][columnUnderTest];

		assertEquals(expected, actual);
	}

	@Test
	public void afterTwoGenerationsForAnIShapedLifeExpectResultToBeTheSameAsTheOrginalShape() {
		int[][] originalLife = new int[][] { { 0, 0, 0, 0, 0 }, { 0, 0, 1, 0, 0 }, { 0, 0, 1, 0, 0 }, { 0, 0, 1, 0, 0 },
				{ 0, 0, 0, 0, 0 } };
		int[][] expected = new int[][] { { 0, 0, 0, 0, 0 }, { 0, 0, 1, 0, 0 }, { 0, 0, 1, 0, 0 }, { 0, 0, 1, 0, 0 },
				{ 0, 0, 0, 0, 0 } };
		int generationCount = 2;

		int[][] actual = generationSimulator.simulate(originalLife, generationCount);

		assertEquals(Arrays.deepToString(expected), Arrays.deepToString(actual));
	}

	@Test
	public void after0GenerationForAnIShapedLifeExpectResultToBeTheSameAsTheOrginalShape() {
		int[][] originalLife = new int[][] { { 0, 0, 0, 0, 0 }, { 0, 0, 1, 0, 0 }, { 0, 0, 1, 0, 0 }, { 0, 0, 1, 0, 0 },
				{ 0, 0, 0, 0, 0 } };
		int[][] expected = new int[][] { { 0, 0, 0, 0, 0 }, { 0, 0, 1, 0, 0 }, { 0, 0, 1, 0, 0 }, { 0, 0, 1, 0, 0 },
				{ 0, 0, 0, 0, 0 } };
		int generationCount = 0;

		int[][] actual = generationSimulator.simulate(originalLife, generationCount);

		assertEquals(Arrays.deepToString(expected), Arrays.deepToString(actual));
	}

	@Test
	public void after3GenerationsForAnIShapedLifeExpectLifeToHaveShiftedAt180Degree() {
		int[][] originalLife = new int[][] { { 0, 0, 0, 0, 0 }, { 0, 0, 1, 0, 0 }, { 0, 0, 1, 0, 0 }, { 0, 0, 1, 0, 0 },
				{ 0, 0, 0, 0, 0 } };
		int[][] expected = new int[][] { { 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0 }, { 0, 1, 1, 1, 0 }, { 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0 } };
		int generationCount = 3;

		int[][] actual = generationSimulator.simulate(originalLife, generationCount);

		assertEquals(Arrays.deepToString(expected), Arrays.deepToString(actual));
	}

	// Random cases

	@ParameterizedTest
	@ValueSource(ints = { 1, 2, 3, 4, 5 })
	public void afterAnyNumberOfGenerationForA4x4BlochShapedLifeExpectResultToBeTheSameAsTheOriginalShape(
			int generationCount) {
		int[][] originalLife = new int[][] { { 1, 1, 0, 0, 0 }, { 1, 1, 0, 0, 0 }, { 0, 0, 0, 0, 0 }, { 0, 0, 0, 1, 1 },
				{ 0, 0, 0, 1, 1 } };
		int[][] expected = new int[][] { { 1, 1, 0, 0, 0 }, { 1, 1, 0, 0, 0 }, { 0, 0, 0, 0, 0 }, { 0, 0, 0, 1, 1 },
				{ 0, 0, 0, 1, 1 } };

		int[][] actual = generationSimulator.simulate(originalLife, generationCount);

		assertEquals(Arrays.deepToString(expected), Arrays.deepToString(actual));
	}
}
