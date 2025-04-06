public class WebDevFactory extends AbstractEmployeeFactory{

    @Override
    Employee createEmployee() {
        return new WebDeveloper();
    }
  
}