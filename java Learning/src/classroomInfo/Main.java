package classroomInfo;

import java.util.ArrayList;
import java.util.List;

public class Main {
    List<Student> studentList = new ArrayList<>();

    public static void main(String[] args) {
        Main main = new Main();
        main.addStudent();
        main.addClassTeacher();

        Classroom classroom = new Classroom("A");
//        classroom.markAttendance();
    }

    void addStudent() {
        Student student1 = new Student("reyaaz");
        Student student2 = new Student("Anson");
        Student student3 = new Student("Salmaan");
        Student student4 = new Student("Alameen");
        Student student5 = new Student("Mishak");
        Student student6 = new Student("Kevin");
        Student student7 = new Student("Staffin");
        Student student8 = new Student("Nabeel");
        Student student9 = new Student("Siddiq");
        Student student10 = new Student("Santhosh");

        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        studentList.add(student4);
        studentList.add(student5);
        studentList.add(student6);
        studentList.add(student7);
        studentList.add(student8);
        studentList.add(student9);
        studentList.add(student10);

        System.out.println(studentList);
    }

    void addClassTeacher() {
        Teacher teacher = new Teacher("Sumathi");
        System.out.println(teacher);
    }
}
