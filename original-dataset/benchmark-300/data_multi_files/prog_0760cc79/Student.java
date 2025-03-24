public class Student {
    private String name;
    private LinkedList<Integer> grades = new LinkedList<>();

    public Student(String name) {
        this.name = name;
    }

    public void addGrade(int grade) {
        /* write */ grades.addFirst(grade);
    }

    public LinkedList<Integer> getGrades() {
        return grades;
    }

    public String getName() {
        return name;
    }
}
