package student;

public class Student implements Comparable<Student>{
    final int id;
    String name;
    double psp;

    int age;
    public Student(int id, String name, double psp, int age){
        this.id = id;
        this.name = name;
        this.psp = psp;
        this.age = age;
    }
    @Override
    public String toString() {
        return id + " " + name + " " + psp + " " + age;
    }

    @Override
    public int compareTo(Student s) {
        return this.name.compareTo(s.name);
    }
}