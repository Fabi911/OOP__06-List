import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        School mySchool = new School();
        mySchool.addStudent(new Student("John", "Doe", "5501"));
        mySchool.addStudent(new Student("Jane", "Smith", "5502"));
        mySchool.addStudent(new Student("Joe", "Miller", "5503"));
        mySchool.addStudent(new Student("Carl", "Meyer", "5504"));
        mySchool.printStudents();
        mySchool.removeStudent(new Student("Joe", "Miller", "5503"));
        mySchool.printStudents();
        Student searchStudent = mySchool.findStudentByID("5502");
        if (searchStudent != null) {
            System.out.println("Student founded: "+searchStudent);
        }


    }

}
