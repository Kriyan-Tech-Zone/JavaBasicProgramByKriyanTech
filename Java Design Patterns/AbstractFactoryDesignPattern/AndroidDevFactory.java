public class AndroidDevFactory extends AbstractEmployeeFactory{

    @Override
    Employee createEmployee() {
        return new AndroidDeveloper();
    }
  
}