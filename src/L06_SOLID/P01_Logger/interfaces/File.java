package L06_SOLID.P01_Logger.interfaces;

public interface File {

    int getSize();

    boolean write(String text);

    void append(String text);
}
