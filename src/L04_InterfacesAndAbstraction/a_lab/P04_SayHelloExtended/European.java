package L04_InterfacesAndAbstraction.a_lab.P04_SayHelloExtended;

public class European extends BasePerson {


    public European(String name) {
        super(name);
    }


    @Override
    public String sayHello() {
        return "Hello";
    }
}
