package machineCoding.cricketInfo;

public class CricInfoApp {
    public static void main(String[] args) {
        CricInfoService service = new CricInfoService(new Match("f", "g", new Team("h"), new Team("g")));

        Team teamA = new Team("India");
        Team teamB = new Team("Australia");

        teamA.addPlayer(new Player("Virat Kohli"));
        teamB.addPlayer(new Player("Steve Smith"));

        Match match = new Match("INDvsAUS", "Mumbai", teamA, teamB);
        service.addMatch(match);

        service.displayMatches();

        service.startMatch("INDvsAUS");
        service.displayMatches();
    }
}
