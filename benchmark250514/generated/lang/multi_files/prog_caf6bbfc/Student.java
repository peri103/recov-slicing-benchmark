public class Student {
    private String name;
    private int age;
    private MutableByteWrapper byteWrapper = new MutableByteWrapper();

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setByteValue(byte value) {
        byteWrapper.setValue(value);
    }

    public byte getByteValue() {
        return byteWrapper.getValue();
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
