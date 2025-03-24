public class Student {
    private String name;
    private PriorityQueue<Integer> grades = new PriorityQueue<>();

    public Student(String name) {
        this.name = name;
    }

    public void addGrade(int grade) {
        /* write */ grades.offer(grade);
    }

    public PriorityQueue<Integer> getGrades() {
        return grades;
    }

    public String getName() {
        return name;
    }
}
