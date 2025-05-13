public class Student {
    private String name;
    private int age;
    private GzipConfig gzipConfig = new GzipConfig();

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setStudentOperatingSystem(int os) {
        gzipConfig.setOperatingSystem(os);
    }

    public int getStudentOperatingSystem() {
        return gzipConfig.getOperatingSystem();
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
