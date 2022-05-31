package L02_Encapsulation.b_exercise.P05_FootballTeamGenerator;

import java.util.List;
import java.util.stream.Collectors;

public class Validators {
    public static void nameValidator(String name) {
        if (name.trim().isEmpty()) {
            throw new IllegalArgumentException("A name should not be empty.");
        }
    }

    public static void statValidator(String statType, int statValue) {
        if (statValue < 0 || statValue > 100) {
            throw new IllegalArgumentException(String.format("%s should be between 0 and 100.", statType));
        }
    }

    public static void playerExistence(Team team, String playerName) {
        if (team.getPlayers().stream().filter(p -> p.getName().equals(playerName)).collect(Collectors.toList()).size() == 0) {
            throw new IllegalArgumentException(String.format("Player %s is not in %s team.", playerName, team.getName()));
        }
    }

    public static void teamExistence(List<Team> team, String teamName) {
        if (team.stream().filter(t -> t.getName().equals(teamName)).collect(Collectors.toList()).size() == 0) {
            throw new IllegalArgumentException(String.format("Team %s does not exist.", teamName));
        }
    }
}
