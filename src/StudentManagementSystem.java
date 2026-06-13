import java.util.ArrayList;


class Student {

    private String name;
    private int age;
    private final String studentId;


    public Student(String name, int age, String studentId){
        this.name = name;
        this.age = age;
        this.studentId = studentId;
    }



    public String getName(){
        return  name;
    }

    public int getAge(){
        return age;
    }

    public String getStudentId(){
       return studentId;
    }


    public void displayInfo(){
        System.out.println("Id: " + studentId + " name: " + name + " age: " + age);
    }


    public void setName(String newName){
        this.name = newName;
    }


    public void setAge(int newAge){
        this.age = newAge;
    }




        }



class ComputerScienceStudent extends Student{

          private String programmingLanguage;
          private static int counter = 1;

          public ComputerScienceStudent(String name, int age, String programmingLanguage){
               super(name, age, "CSC" +counter);
               this.programmingLanguage = programmingLanguage;
          }


      @Override
    public void displayInfo(){
        super.displayInfo();
          System.out.println("Programming language : " + programmingLanguage);
    }



    @Override
    public String getStudentId(){
        return "CSC" + super.getStudentId();
    }




}







class StudentManagementSystem{

    private final ArrayList<Student> students = new ArrayList<>();



    public void registerStudents(String name, int age){
        String newId;

        if(students.isEmpty()){
            newId = "St001";
        }else{
            Student getLast = students.get(students.size() -1);
            String lastId = getLast.getStudentId();

            int num = Integer.parseInt(lastId.substring(3));

            num++;

            newId = String.format("St%03d", num);

        }


        Student s = new Student(name, age, newId);
        students.add(s);

        System.out.println("Student registered successfully " + s.getName() + " with ID: " + newId);

    }




    public void updateStudent(String studentId, String newName, int newAge){
        for(Student s : students){
            if(s.getStudentId().equals(studentId)){
             s.setName(newName);
             s.setAge(newAge);
                System.out.println("updated successfully : " +  studentId);
                return;
            }
        }
        System.out.println("Student not found!");



    }

     public void viewStudents(){
        for(Student s : students){
            s.displayInfo();
        }

     }


     public void deleteStudent(String studentId){
         for(Student s : students){
             if(s.getStudentId().equals(studentId)){
                 students.remove(s);
                 System.out.println("Students deleted successfully");
                 return;
             }
         }

         System.out.println("Students not found");
     }


}


