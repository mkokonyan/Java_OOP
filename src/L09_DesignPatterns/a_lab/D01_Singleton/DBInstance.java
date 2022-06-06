package L09_DesignPatterns.a_lab.D01_Singleton;

public class DBInstance {

    private static DBInstance instance = null;


    public DBInstance() {
        if (instance != null) {
            throw new RuntimeException("To use DBInstance call getInstance()");
        }

    }

    public static DBInstance getInstance() {
        if (instance == null) {
            instance = new DBInstance();
        }
        return instance;
    }

    public int createTable() {
        System.out.println("Table users created");
        return 1;
    }

}
