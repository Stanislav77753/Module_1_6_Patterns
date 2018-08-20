package factorymethod;

public class Builder implements Employee {
    @Override
    public void doSmth() {
        System.out.println("builder builds buildings");
    }
}
