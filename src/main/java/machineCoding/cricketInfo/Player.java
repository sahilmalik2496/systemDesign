package machineCoding.cricketInfo;

import java.util.HashMap;
import java.util.Map;

class Player {
    private String name;
    private Map<String, Integer> performanceStats; // Key: Stat type (e.g., "Runs"), Value: Stat value

    public Player(String name) {
        this.name = name;
        this.performanceStats = new HashMap<>();
    }

    public void updateStat(String statType, int value) {
        performanceStats.put(statType, performanceStats.getOrDefault(statType, 0) + value);
    }

    public String getPlayerStats() {
        return name + " Stats: " + performanceStats.toString();
    }
}
