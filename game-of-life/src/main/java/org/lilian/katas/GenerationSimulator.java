package org.lilian.katas;

import java.util.Arrays;
import java.util.stream.IntStream;

public class GenerationSimulator {

	private LifeDisplayer lifeDisplayer;

	public GenerationSimulator(LifeDisplayer lifeDisplayer) {
		this.lifeDisplayer = lifeDisplayer;
	}

	public int[][] simulate(final int[][] originalLife, int generationCount) {
		lifeDisplayer.display(originalLife, 0);

		int[][] evolvedLife = Arrays.copyOf(originalLife, originalLife.length);

		for (int currentGeneration = 1; currentGeneration <= generationCount; currentGeneration++) {
			evolvedLife = evolve(evolvedLife);
			lifeDisplayer.display(evolvedLife, currentGeneration);
		}

		return evolvedLife;
	}

	int[][] evolve(final int[][] originalLife) {
		int[][] currentLife = Arrays.copyOf(originalLife, 5);
		int[][] evolvedLife = new int[][] { { 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0 } };

		IntStream.range(0, currentLife.length).forEach(row -> IntStream.range(0, currentLife[row].length)
				.forEach(column -> evolveCell(currentLife, evolvedLife, row, column)));

		return evolvedLife;
	}

	private void evolveCell(int[][] currentLife, int[][] evolvedLife, int row, int column) {
		int livingCellsCount = 0;

		int adjacentRow = row - 1;
		int adjacentColumn = column - 1;
		livingCellsCount += getAliveCount(currentLife, adjacentRow, adjacentColumn);
		adjacentRow = row - 1;
		adjacentColumn = column;
		livingCellsCount += getAliveCount(currentLife, adjacentRow, adjacentColumn);
		adjacentRow = row - 1;
		adjacentColumn = column + 1;
		livingCellsCount += getAliveCount(currentLife, adjacentRow, adjacentColumn);

		adjacentRow = row;
		adjacentColumn = column - 1;
		livingCellsCount += getAliveCount(currentLife, adjacentRow, adjacentColumn);
		adjacentRow = row;
		adjacentColumn = column + 1;
		livingCellsCount += getAliveCount(currentLife, adjacentRow, adjacentColumn);

		adjacentRow = row + 1;
		adjacentColumn = column - 1;
		livingCellsCount += getAliveCount(currentLife, adjacentRow, adjacentColumn);
		adjacentRow = row + 1;
		adjacentColumn = column;
		livingCellsCount += getAliveCount(currentLife, adjacentRow, adjacentColumn);
		adjacentRow = row + 1;
		adjacentColumn = column + 1;
		livingCellsCount += getAliveCount(currentLife, adjacentRow, adjacentColumn);

		if (shouldCreateANewCell(currentLife, row, column, livingCellsCount)) {
			evolvedLife[row][column] = 1;
		} else if (isCellStillAlive(currentLife, row, column, livingCellsCount)) {
			evolvedLife[row][column] = 1;
		} else {
			evolvedLife[row][column] = 0;
		}
	}

	private boolean isCellStillAlive(final int[][] originalLife, int row, int column, int livingCellsCount) {
		return originalLife[row][column] == 1 && (livingCellsCount == 2 || livingCellsCount == 3);
	}

	private boolean shouldCreateANewCell(int[][] life, int row, int column, int livingCellsCount) {
		return life[row][column] == 0 && livingCellsCount == 3;
	}

	private int getAliveCount(final int[][] life, final int row, final int column) {
		return isNotOutOfBounds(row, column) ? life[row][column] : 0;
	}

	private boolean isNotOutOfBounds(int adjacentRow, int adjacentColumn) {
		return adjacentRow >= 0 && adjacentColumn >= 0 && adjacentRow <= 4 && adjacentColumn <= 4;
	}
}
