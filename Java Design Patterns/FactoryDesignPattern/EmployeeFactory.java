public class EmployeeFactory {

    public Employee getEmployee(String type){

        if(type.equalsIgnoreCase("Manager")){
            return new Manager();
        } else if(type.equalsIgnoreCase("Android Developer")){
            return new AndroidDeveloper();
        } else if(type.equalsIgnoreCase("Web Developer")){
            return new WebDeveloper();
        }

     
        return null;
    }

}
