package design.pattern.creational.prototype;

public class IntelligentStudent extends Student{
    private int iq;
    IntelligentStudent() {

    }
    IntelligentStudent(IntelligentStudent intelligentStudent) {
        super(intelligentStudent);
        this.iq=intelligentStudent.iq;
    }

    @Override
    public IntelligentStudent clone() {
        return new IntelligentStudent(this);
    }

    public int getIq() {
        return iq;
    }

    public void setIq(int iq) {
        this.iq = iq;
    }
}
