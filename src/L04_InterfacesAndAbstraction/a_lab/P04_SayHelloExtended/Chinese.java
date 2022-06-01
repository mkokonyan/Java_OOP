package L04_InterfacesAndAbstraction.a_lab.P04_SayHelloExtended;

public class Chinese extends BasePerson {


    public Chinese(String name) {
        super(name);
    }

    @Override
    public String sayHello() {
        return "Djydjybydjy";
    }
}
