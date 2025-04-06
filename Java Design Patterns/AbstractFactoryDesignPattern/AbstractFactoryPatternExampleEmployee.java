public class AbstractFactoryPatternExampleEmployee {
    public static void main(String[] args) {
        
        Employee androidDeveloper = EmployeeFactory.getEmployee(new AndroidDevFactory());
        System.out.println(androidDeveloper.getEmployeeId() + " >> " +androidDeveloper.getName() + " >> "+androidDeveloper.getSalary());

        Employee webDeveloper = EmployeeFactory.getEmployee(new WebDevFactory());
        System.out.println(webDeveloper.getEmployeeId() + " >> " +webDeveloper.getName() + " >> "+webDeveloper.getSalary());
        

    }
}
