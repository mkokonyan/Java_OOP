package L09_DesignPatterns.a_lab.D02_Prototype;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Register register = new Register();

        Item book = register.getItem("Book");

        book.setName("The hobbit");

        System.out.println(book.getName());

    }
}
