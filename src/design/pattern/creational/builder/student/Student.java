package design.pattern.creational.builder.student;

public class Student {
    String id;
    String name;
    int age;
    String stream;

    private Student(StudentBuilder builder){
        // validation start
//        if(builder.getAge()>27)throw new IllegalArgumentException();
        //validation end
        id=builder.getId();
        name=builder.getName();
        age=builder.getAge();
        stream=builder.getStream();
    }
    static StudentBuilder getBuilder(){
        return new StudentBuilder();
    }

    static class StudentBuilder implements Builder{
        String id;
        String name;
        int age;
        String stream;


        public String getId() {
            return id;
        }

        @Override
        public StudentBuilder setID(String id) {
            this.id = id;
            return this;
        }

        public String getName() {
            return name;
        }
        @Override
        public StudentBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public int getAge() {
            return age;
        }
        @Override
        public StudentBuilder setAge(int age) {
            this.age = age;
            return this;
        }

        public String getStream() {
            return stream;
        }
        @Override
        public StudentBuilder setStream(String stream) {
            this.stream = stream;
            return this;
        }
        public Student build(){
            //we can also do validation here
            if(age>27)throw new IllegalArgumentException();
            return new Student(this);
        }
    }
}
