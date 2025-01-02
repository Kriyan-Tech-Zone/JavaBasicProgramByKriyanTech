public class Student {
    // member field
    String name;
    // member field
    int rollNumber;

    //constructor
    public Student(){
        name = "Shreya";
        rollNumber = 1;
    }
    public static void main(String args[]) {        
        Student student = new Student(); // object creation using class name Student
        System.out.println(student.name); // member field access
        System.out.println(student.rollNumber); // member field access
    }
}

/*
Output
Shreya
1
*/