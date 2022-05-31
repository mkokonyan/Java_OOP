package L02_Encapsulation.b_exercise.P05_FootballTeamGenerator;

public class Player {
    private String name;
    private int endurance;
    private int sprint;
    private int dribble;
    private int passing;
    private int shooting;

    public Player(String name, int endurance, int sprint, int dribble, int passing, int shooting) {
        this.setName(name);
        this.setEndurance(endurance);
        this.setSprint(sprint);
        this.setDribble(dribble);
        this.setPassing(passing);
        this.setShooting(shooting);
    }

    private void setName(String name) {
        Validators.nameValidator(name);

        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    private void setEndurance(int endurance) {
        Validators.statValidator("Endurance", endurance);

        this.endurance = endurance;
    }

    private void setSprint(int sprint) {
        Validators.statValidator("Sprint", sprint);

        this.sprint = sprint;
    }

    private void setDribble(int dribble) {
        Validators.statValidator("Dribble", dribble);

        this.dribble = dribble;
    }

    private void setPassing(int passing) {
        Validators.statValidator("Passing", passing);

        this.passing = passing;
    }

    private void setShooting(int shooting) {
        Validators.statValidator("Shooting", shooting);

        this.shooting = shooting;
    }

    public double overallSkillLevel() {
        return (this.endurance + this.sprint + this.dribble + this.passing + this.shooting) / 5.0;
    }
}

