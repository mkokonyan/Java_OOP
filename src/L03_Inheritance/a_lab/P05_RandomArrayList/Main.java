package L03_Inheritance.a_lab.P05_RandomArrayList;

public class Main {
    public static void main(String[] args) {
        RandomArrayList<Integer> randomArrayList = new RandomArrayList<>();
        for (int i = 0; i < 13; i++) {
            randomArrayList.add(i);

        }
        System.out.println(randomArrayList.getRandomElement());
    }
}
