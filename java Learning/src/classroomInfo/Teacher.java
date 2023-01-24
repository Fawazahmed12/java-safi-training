package classroomInfo;

public class Teacher {
    String TeacherName;

    public Teacher(String teacherName) {
        TeacherName = teacherName;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "TeacherName='" + TeacherName + '\'' +
                '}';
    }
}
