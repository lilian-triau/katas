package triau.lilian.training.katas.football.season;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class CountSeasonPointsTest {

	CountSeasonPoints countSeasonPoints = new CountSeasonPoints();

	@Test
	void countPointsWithOnlyWinsShouldReturn30() {
		int expected = 30;
		String[] seasonResults = { "1:0", "2:0", "3:0", "4:0", "5:0", "6:0", "7:0", "8:0", "9:0", "1:0" };

		int actual = countSeasonPoints.countPoints(seasonResults);

		assertEquals(expected, actual);
	}

	@Test
	void countPointsWithOnlyLossesShouldReturn0() {
		int expected = 0;
		String[] seasonResults = { "0:1", "0:2", "0:3", "0:4", "0:5", "0:6", "0:7", "0:8", "0:9", "0:1" };

		int actual = countSeasonPoints.countPoints(seasonResults);

		assertEquals(expected, actual);
	}

	@Test
	void countPointsWithOnlyTiesShouldReturn10() {
		int expected = 10;
		String[] seasonResults = { "0:0", "0:0", "0:0", "0:0", "0:0", "0:0", "0:0", "0:0", "0:0", "0:0" };

		int actual = countSeasonPoints.countPoints(seasonResults);

		assertEquals(expected, actual);
	}

	@Test
	void countPointsWithFiveWinsTwoLossesAndThreeTiesShouldReturnShouldReturn18() {
		int expected = 18;
		String[] seasonResults = { "1:0", "1:0", "3:3", "2:1", "0:0", "3:2", "1:2", "3:4", "2:2", "4:2" };

		int actual = countSeasonPoints.countPoints(seasonResults);

		assertEquals(expected, actual);
	}

	@Test
	void countPointsWithScoresGreaterThan9ShouldNotThrowException() {
		int expected = 3;
		String[] seasonResults = { "10:8", "100:160", };

		int actual = countSeasonPoints.countPoints(seasonResults);

		assertEquals(expected, actual);
	}
}
