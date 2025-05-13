public class Student {
    private String name;
    private int age;
    private Courses courses;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        this.courses = new Courses();
    }

    public void enrollCourse(String courseName, int score) {
        courses.addCourse(courseName, score);
    }

    public int getCourseScore(String courseName) {
        return courses.getScore(courseName);
    }

    public void displayInfo() {
        System.out.println("Student Name: " + name);
        System.out.println("Age: " + age);
    }
}
