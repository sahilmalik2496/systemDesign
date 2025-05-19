package machineCoding.cricketInfo;

import lombok.Builder;

class Match {
    private String matchId;
    private String venue;
    private MatchStatus status;
    private Team teamA;
    private Team teamB;
    private Score score;

    public Match(String matchId, String venue, Team teamA, Team teamB) {
        this.matchId = matchId;
        this.venue = venue;
        this.status = MatchStatus.UPCOMING;
        this.teamA = teamA;
        this.teamB = teamB;
        this.score = new Score(teamA, teamB);
    }

    public void startMatch() {
        this.status = MatchStatus.LIVE;
    }

    public void endMatch() {
        this.status = MatchStatus.COMPLETED;
    }

    public String getMatchDetails() {
        return String.format("Match: %s vs %s\nVenue: %s\nStatus: %s\nScore: %s",
                teamA.getName(), teamB.getName(), venue, status, score.getScoreDetails());
    }

    public MatchStatus getStatus() {
        return status;
    }
}