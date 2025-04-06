public class FactoryPatternExampleEmployee {
    public static void main(String[] args) {
        
        EmployeeFactory empolyeeFactory = new EmployeeFactory();
        
        Employee manager = empolyeeFactory.getEmployee("Manager");
        System.out.println(manager.getEmployeeId() + " >> " +manager.getName() + " >> "+manager.getSalary());

        Employee androidDeveloper = empolyeeFactory.getEmployee("Android Developer");
        System.out.println(androidDeveloper.getEmployeeId() + " >> " +androidDeveloper.getName() + " >> "+androidDeveloper.getSalary());

        Employee webDeveloper = empolyeeFactory.getEmployee("Web Developer");
        System.out.println(webDeveloper.getEmployeeId() + " >> " +webDeveloper.getName() + " >> "+webDeveloper.getSalary());



    }
}
