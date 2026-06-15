public class StudentManagementApplication {

    public static  void main(String[] arg){


      StudentManagementSystem sms = new StudentManagementSystem();
      ComputerScienceStudent css = new ComputerScienceStudent("Jane", 30, "Css");



      sms.registerStudents("jane", 29);


      css.displayInfo();

    }

}
