package L06_SOLID.P01_Logger.interfaces;

public interface Factory<T> {
    T produce(String input);

}
