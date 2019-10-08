package first_task;

import java.util.ArrayList;

public class StudentManager {
    private ArrayList<Student> students;

    public ArrayList<Student> getStudents() {
        return students;
    }

    public  StudentManager()
    {
        students = new ArrayList<>();
    }

    public void addStudent(Student student)
    {
        this.students.add(student);
    }


}
