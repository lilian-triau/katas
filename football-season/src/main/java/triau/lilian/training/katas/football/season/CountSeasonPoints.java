package triau.lilian.training.katas.football.season;

public class CountSeasonPoints {

	public int countPoints(String[] seasonResults) {
		int points = 0;
		for (String score : seasonResults) {
			String[] splitedScore = score.split(":");
			int homeScore = Integer.valueOf(splitedScore[0]);
			int visitorScore = Integer.valueOf(splitedScore[1]);

			points += (homeScore > visitorScore) ? 3 : (homeScore == visitorScore) ? 1 : 0;
		}
		return points;
	}
}
