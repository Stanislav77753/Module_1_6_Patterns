package factorymethod;

public class BuilderEmployeeFactory implements EmployeeFactory {
    @Override
    public Employee createEmployee() {
        return new Builder();
    }
}
