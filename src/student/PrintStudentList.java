package student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PrintStudentList {
    public static void display(){
        List<Student> students = new ArrayList<>(List.of(
                new Student(1, "Harsh", 70.4, 25),
                new Student(1, "Surendra Seth", 92.5, 54),
                new Student(1, "Ram", 100, 10000),
                new Student(1, "Krishna", 99, 5000),
                new Student(1, "Radha", 100, 3000)
        ));
        Collections.sort(students);
        students.sort(new StudentComparator());
        System.out.println(students);
    }
}
