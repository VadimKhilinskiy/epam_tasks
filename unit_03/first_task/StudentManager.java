package first_task;

import java.util.ArrayList;

public class StudentManager {
    private ArrayList<Student> students;

    public  StudentManager()
    {
        students = new ArrayList<>();
    }

    public void addStudent(Student student)
    {
        this.students.add(student);
    }

    public void printAll()
    {
        System.out.println("All pupils: ");
        for(Student student:students)
        {
            System.out.println(student.toString());
        }
        System.out.println();
    }

    public void printExcellent()
    {
        System.out.println("Excellent pupils: ");
        for(Student student:students)
        {
            if(student.isExcellent())
            {
                System.out.println(student.toString());
            }
        }
        System.out.println();
    }

    public void generateTenStudents()
    {
        addStudent(new Student("Ivanov I.A.",1,new int[]{8,6,4,5,3}));
        addStudent(new Student("Ivanova D.A.",2,new int[]{9,9,10,9,9}));
        addStudent(new Student("Petrov S.P.",3,new int[]{4,6,4,5,3}));
        addStudent(new Student("Suvorov D.J.",4,new int[]{10,10,10,10,10}));
        addStudent(new Student("Uvon S.Q.",1,new int[]{9,9,9,9,8}));
        addStudent(new Student("Nikitin A.A.",4,new int[]{9,9,9,9,10}));
        addStudent(new Student("Ryabiy D.A.",2,new int[]{2,3,4,2,1}));
        addStudent(new Student("Maliy N.A.",3,new int[]{5,6,10,3,4}));
        addStudent(new Student("Kirov A.A.",4,new int[]{7,8,6,9,10}));
        addStudent(new Student("Eliseev F.G.",2,new int[]{9,9,9,9,9}));
    }


}
