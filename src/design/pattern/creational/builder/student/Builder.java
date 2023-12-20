package design.pattern.creational.builder.student;

public interface Builder {
    Builder setID(String id);
    Builder setName(String name);
    Builder setAge(int age);
    Builder setStream(String stream);
}
