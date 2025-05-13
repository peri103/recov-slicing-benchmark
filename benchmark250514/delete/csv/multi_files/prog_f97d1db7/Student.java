public class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getDetails() {
        return "Student Name: " + name + ", Age: " + age;
    }
}
