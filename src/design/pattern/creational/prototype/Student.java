package design.pattern.creational.prototype;

public class Student implements Prototype<Student>{
    private String name;
    private int age;
    private String batch;
    private double avgBatchPsp;
    private double studentPsp;
    Student(){

    }
     Student(Student student) {
        this.name=student.name;
        this.age=student.age;
        this.batch=student.batch;
        this.avgBatchPsp=student.avgBatchPsp;
        this.studentPsp=student.studentPsp;
    }

//    public String getName() {
//        return name;
//    }

    public void setName(String name) {
        this.name = name;
    }

//    public int getAge() {
//        return age;
//    }

    public void setAge(int age) {
        this.age = age;
    }

//    public String getBatch() {
//        return batch;
//    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

//    public double getAvgBatchPsp() {
//        return avgBatchPsp;
//    }

    public void setAvgBatchPsp(double avgBatchPsp) {
        this.avgBatchPsp = avgBatchPsp;
    }
//
//    public double getStudentPsp() {
//        return studentPsp;
//    }

    public void setStudentPsp(double studentPsp) {
        this.studentPsp = studentPsp;
    }

    @Override
    public Student clone() {
        return new Student(this);
    }
}
