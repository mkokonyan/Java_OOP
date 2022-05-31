package L02_Encapsulation.b_exercise.P05_FootballTeamGenerator;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Team> teams = new ArrayList<>();

        String data = scanner.nextLine();
        while (!data.equals("END")) {
            String[] dataArr = data.split(";");
            String command = dataArr[0];
            String teamName = dataArr[1];
            String playerName;

            switch (command) {
                case "Team":
                    try {
                        Team team = new Team(teamName);
                        teams.add(team);
                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case "Add":
                    playerName = dataArr[2];
                    int endurance = Integer.parseInt(dataArr[3]);
                    int sprint = Integer.parseInt(dataArr[4]);
                    int dribble = Integer.parseInt(dataArr[5]);
                    int passing = Integer.parseInt(dataArr[6]);
                    int shooting = Integer.parseInt(dataArr[7]);

                    Player player = null;

                    try {
                        player = new Player(playerName, endurance, sprint, dribble, passing, shooting);

                        Validators.teamExistence(teams, teamName);
                        Team teamToAddPlayer = Team.getTeamFromString(teams, teamName);
                        teamToAddPlayer.addPlayer(player);

                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case "Remove":
                    playerName = dataArr[2];

                    try {
                        Validators.teamExistence(teams, teamName);
                        Team teamToRemovePlayer = Team.getTeamFromString(teams, teamName);

                        teamToRemovePlayer.removePlayer(playerName);

                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case "Rating":
                    try {
                        Validators.teamExistence(teams, teamName);
                        Team teamToShowStats = Team.getTeamFromString(teams, teamName);


                        System.out.printf("%s - %.0f%n", teamToShowStats.getName(), teamToShowStats.getRating());

                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
            }
            data = scanner.nextLine();
        }
    }
}
