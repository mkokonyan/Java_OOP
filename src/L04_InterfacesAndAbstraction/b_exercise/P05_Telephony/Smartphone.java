package L04_InterfacesAndAbstraction.b_exercise.P05_Telephony;

import java.util.List;

public class Smartphone implements Callable, Browsable {
    private List<String> numbers;
    private List<String> urls;

    public Smartphone(List<String> numbers, List<String> urls) {
        this.numbers = numbers;
        this.urls = urls;
    }


    @Override
    public String call() {
        StringBuilder output = new StringBuilder();
        numbers.forEach(n -> {
            if (n.matches("[0-9]+")) {
                output.append("Calling... ").append(n).append(System.lineSeparator());
            } else {
                output.append("Invalid number!").append(System.lineSeparator());
            }
        });
        return output.toString();
    }

    @Override
    public String browse() {
        StringBuilder output = new StringBuilder();
        urls.forEach(u -> {
            if (!u.matches(".*\\d.*")) {
                output.append("Browsing: ").append(u).append("!").append(System.lineSeparator());
            } else {
                output.append("Invalid URL!").append(System.lineSeparator());
            }
        });
        return output.toString();
    }
}
