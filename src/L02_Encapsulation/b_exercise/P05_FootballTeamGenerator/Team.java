package L02_Encapsulation.b_exercise.P05_FootballTeamGenerator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Team {
    private String name;
    private List<Player> players;

    public Team(String name) {
        this.setName(name);
        this.players = new ArrayList<>();
    }

    private void setName(String name) {
        Validators.nameValidator(name);

        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void addPlayer(Player player) {
        this.players.add(player);
    }

    public void removePlayer(String player) {
        Validators.playerExistence(this, player);

        Player playerToRemove = getPlayerFromString(player);
        this.players.remove(playerToRemove);

    }

    public double getRating() {
        return players.stream()
                .mapToDouble(Player::overallSkillLevel)
                .average()
                .orElse(0.0);
    }

    public List<Player> getPlayers() {
        return Collections.unmodifiableList(players);
    }

    private Player getPlayerFromString(String playerName) {
        return this.players.stream()
                .filter(p -> p.getName()
                        .equals(playerName))
                .collect(Collectors.toList())
                .get(0);
    }

    public static Team getTeamFromString (List<Team> teams, String teamName) {
        return teams.stream().filter(t -> t.getName().equals(teamName)).collect(Collectors.toList()).get(0);
    }


}
