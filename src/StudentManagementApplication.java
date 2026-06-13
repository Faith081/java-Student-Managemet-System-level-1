public class StudentManagementApplication {

    public static  void main(String[] arg){


      StudentManagementSystem sms = new StudentManagementSystem();
      ComputerScienceStudent css = new ComputerScienceStudent("Jane", 30, "Css");


//      sms.registerStudents("Jane", 20);
//      sms.registerStudents("ken", 25);
//      sms.registerStudents("Caleb", 30);
//
//
//      sms.viewStudents();
//      sms.updateStudent("St002", "llll", 80);
//      sms.viewStudents();
//
//      sms.deleteStudent("St002");
//      sms.viewStudents();


      css.displayInfo();

    }

}
