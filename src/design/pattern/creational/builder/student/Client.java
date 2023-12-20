package design.pattern.creational.builder.student;

public class Client {
    public static void main(String[] args) {
//        Builder builder=new StudentBuilder();
//        builder.setId("A001");
//        builder.setAge(18);
//        builder.setName("Radhe");
//        builder.setStream("Engineering");
//        Student s=new Student(builder)

//        Student.Builder builder=Student.getBuilder();
//        builder.setId("A002");
//        builder.setAge(19);
//        builder.setName("Radhe Radhe");
//        builder.setStream("MBBS");
//        Student s=builder.build();

        Student s=Student.getBuilder()
                .setID("A002")
                .setAge(19)
                .setName("Radhe Radhe")
                .setStream("MBBS").build();
        System.out.println(s);
    }
}
