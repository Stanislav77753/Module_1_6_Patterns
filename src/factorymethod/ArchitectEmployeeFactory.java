package factorymethod;

public class ArchitectEmployeeFactory implements EmployeeFactory {
    @Override
    public Employee createEmployee() {
        return new Architect();
    }
}
