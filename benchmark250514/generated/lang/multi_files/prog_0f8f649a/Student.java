public class Student {
    private String name;
    private MutableByteWrapper grade = new MutableByteWrapper();

    public Student(String name) {
        this.name = name;
    }

    public void setGrade(byte grade) {
        this.grade.setValue(grade);
    }

    public byte getGrade() {
        return grade.getValue();
    }

    public String getName() {
        return name;
    }
}
