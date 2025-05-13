public class Student {
    private String name;
    private int age;
    private ExpiringMapWrapper expiringMap;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        this.expiringMap = new ExpiringMapWrapper();
    }

    public void enrollCourse(String courseName) {
        expiringMap.putValue(courseName, "Enrolled");
    }

    public String getCourseStatus(String courseName) {
        return expiringMap.getValue(courseName);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}