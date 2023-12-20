package design.pattern.creational.prototype;

public class Client {
    public static void fillRegistry(StudentRegistry studentRegistry){
        Student feb23BatchStudent=new Student();
        feb23BatchStudent.setBatch("February");
        feb23BatchStudent.setAvgBatchPsp(90.66);
        studentRegistry.register("feb23Batch",feb23BatchStudent);

        IntelligentStudent intelligentStudent=new IntelligentStudent();
        intelligentStudent.setIq(5);
        intelligentStudent.setAvgBatchPsp(98.66);
        intelligentStudent.setStudentPsp(99.66);
        studentRegistry.register("ranker",intelligentStudent);
    }
    public static void main(String[] args) {
        StudentRegistry studentRegistry=new StudentRegistry();
        fillRegistry(studentRegistry);
        Student feb23Student=studentRegistry.get("feb23Batch").clone();
        System.out.println(feb23Student);

        Student intelligentStudent=studentRegistry.get("ranker").clone();
        System.out.println(intelligentStudent);
    }
}
