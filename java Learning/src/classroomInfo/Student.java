package classroomInfo;

import java.util.ArrayList;
import java.util.List;

public class Student {
    String studentName;

    Boolean isPresent;

    public Student(String studentName) {
        this.studentName = studentName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentName='" + studentName + '\'' +
                '}';
    }

    void markAttendance(Boolean isPresent) {
this.isPresent = isPresent;
    }
}
