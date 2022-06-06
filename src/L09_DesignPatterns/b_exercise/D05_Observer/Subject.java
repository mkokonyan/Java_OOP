package L09_DesignPatterns.b_exercise.D05_Observer;

public interface Subject {
    void subscribe(Observer observer);

    void unSubscribe(Observer observer);

    void notify(String text);
}
