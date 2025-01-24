package machineCoding.cricketInfo;

class CricInfoService {
    private final Match match;
    private Schedule schedule;
    private NotificationService notificationService;

    public CricInfoService(Match match) {
        this.match = match;
        schedule = new Schedule();
        notificationService = new NotificationService();
    }

    public void addMatch(Match match) {
        schedule.addMatch(match);
    }

    public void startMatch(String matchId) {
        for (Match match : schedule.getUpcomingMatches()) {
            if (matchId.equals(matchId)) {
                match.startMatch();
                notificationService.notifyUsers(matchId, "Match has started!");
                return;
            }
        }
    }

    public void displayMatches() {
        System.out.println("Upcoming Matches:");
        for (Match match : schedule.getUpcomingMatches()) {
            System.out.println(match.getMatchDetails());
        }

        System.out.println("\nCompleted Matches:");
        for (Match match : schedule.getCompletedMatches()) {
            System.out.println(match.getMatchDetails());
        }
    }
}
