package machineCoding.cricketInfo;

import java.util.HashMap;
import java.util.Map;

class Score {
    private Map<Team, Integer> teamScores;

    public Score(Team teamA, Team teamB) {
        teamScores = new HashMap<>();
        teamScores.put(teamA, 0);
        teamScores.put(teamB, 0);
    }

    public void updateScore(Team team, int runs) {
        teamScores.put(team, teamScores.get(team) + runs);
    }

    public String getScoreDetails() {
        StringBuilder scoreDetails = new StringBuilder();
        for (Map.Entry<Team, Integer> entry : teamScores.entrySet()) {
            scoreDetails.append(entry.getKey().getName()).append(": ").append(entry.getValue()).append(" ");
        }
        return scoreDetails.toString();
    }
}
