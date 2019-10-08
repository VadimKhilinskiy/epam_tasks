package first_task;

public class Main {
    public static void main(String...args){
        StudentManager studentManager = new StudentManager();
        studentManager.addStudent(new Student("Ivanov I.A.",1,new int[]{8,6,4,5,3}));
        studentManager.addStudent(new Student("Ivanova D.A.",2,new int[]{9,9,10,9,9}));
        studentManager.addStudent(new Student("Petrov S.P.",3,new int[]{4,6,4,5,3}));
        studentManager.addStudent(new Student("Suvorov D.J.",4,new int[]{10,10,10,10,10}));
        studentManager.addStudent(new Student("Uvon S.Q.",1,new int[]{9,9,9,9,8}));
        studentManager.addStudent(new Student("Nikitin A.A.",4,new int[]{9,9,9,9,10}));
        studentManager.addStudent(new Student("Ryabiy D.A.",2,new int[]{2,3,4,2,1}));
        studentManager.addStudent(new Student("Maliy N.A.",3,new int[]{5,6,10,3,4}));
        studentManager.addStudent(new Student("Kirov A.A.",4,new int[]{7,8,6,9,10}));
        studentManager.addStudent(new Student("Eliseev F.G.",2,new int[]{9,9,9,9,9}));
        System.out.println("Excellent pupils: ");
        for(Student student:studentManager.getStudents())
        {
            if(student.isExcellent())
            {
                StringBuffer str = new StringBuffer();
                str.append(student.getSurnameNL() +
                        ": \n group:"+
                        student.getGroup() +
                        "\n balls:");
                for(int i = 0; i<student.getPerformance().length-1; i++)
                {
                    str.append(student.getPerformance()[i]+", ");
                }
                str.append(student.getPerformance()[student.getPerformance().length-1]);
                System.out.println(str.toString());
            }
        }
        System.out.println();
    }

}
