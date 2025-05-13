public class Student {
    private String name;
    private int age;
    private CustomMap<String, Integer> grades;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        this.grades = new CustomMap<>();
    }

    public void addGrade(String subject, int grade) {
        grades.addEntry(subject, grade);
    }

    public Integer getGrade(String subject) {
        return grades.retrieveEntry(subject);
    }

    @Override
    public String toString() {
        return "Student{name='" + name + "', age=" + age + "}";
    }
}
