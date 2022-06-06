package L09_DesignPatterns.b_exercise.D05_Observer;

public class CarEnthusiast implements Observer {
    @Override
    public void update(String magazineName) {
        System.out.println("YEES, my magazine is out " + magazineName);
    }
}
