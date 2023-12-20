//package design.pattern.creational.builder.student;
//
//public class StudentBuilder {
//    String id;
//    String name;
//    int age;
//    String stream;
//
//
//    public String getId() {
//        return id;
//    }
//
//    public void setId(String id) {
//        this.id = id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }
//
//    public String getStream() {
//        return stream;
//    }
//
//    public void setStream(String stream) {
//        this.stream = stream;
//    }
//    public Student build(){
//        //we can also do validation here
//        if(age>27)throw new IllegalArgumentException();
//        return new Student(this);
//    }
//}
