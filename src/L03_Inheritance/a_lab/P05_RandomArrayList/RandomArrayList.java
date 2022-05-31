package L03_Inheritance.a_lab.P05_RandomArrayList;

import java.util.ArrayList;
import java.util.Random;

public class RandomArrayList<E> extends ArrayList<E> {

    public E getRandomElement() {
        int start = 0;
        int end = super.size();

        Random rand = new Random();
        int randIndex = rand.nextInt(end);
        return remove(randIndex);
    }
}
