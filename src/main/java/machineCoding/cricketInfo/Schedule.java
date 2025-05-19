package machineCoding.cricketInfo;

import java.util.ArrayList;
import java.util.List;

class Schedule {
    private List<Match> matches;

    public Schedule() {
        matches = new ArrayList<>();
    }

    public void addMatch(Match match) {
        matches.add(match);
    }

    public List<Match> getUpcomingMatches() {
//        return matches.stream()
//                .filter(match -> match.getStatus() == MatchStatus.UPCOMING)
//                .toList();
        return new ArrayList<>();
    }

    public List<Match> getCompletedMatches() {
//        return matches.stream()
//                .filter(match -> match.getStatus() == MatchStatus.COMPLETED)
//                .toList();
        return new ArrayList<>();
    }
}
