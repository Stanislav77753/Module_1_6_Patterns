package factorymethod;

public class Architect implements Employee {
    @Override
    public void doSmth() {
        System.out.println("Architect designs buildings");
    }
}
