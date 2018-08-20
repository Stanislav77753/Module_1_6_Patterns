package factorymethod;

public class MainFactoryMethod {
    public static void main(String[] args) {
        EmployeeFactory employeeFactory = createEmployeeBySpeciality("builder");
        Employee employee = employeeFactory.createEmployee();
        employee.doSmth();

    }

    static EmployeeFactory createEmployeeBySpeciality(String speciality){
        if(speciality.equals("architect")){
            return new ArchitectEmployeeFactory();
        }else if(speciality.equals("builder")){
            return new BuilderEmployeeFactory();
        }else{
            throw new RuntimeException("you entered unknown speciality");
        }
    }
}
