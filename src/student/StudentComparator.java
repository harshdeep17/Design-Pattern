package student;

import student.Student;

import java.util.Comparator;

public class StudentComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        if(s1.psp==s2.psp){
            return s1.name.compareTo(s2.name);
        }
        else if(s1.psp-s2.psp>0)return -1;
        return 1;
    }
}
