import java.util.List;

public class Main {
    public static void main(String[] args) {
        RingPlotManager plotManager = new RingPlotManager();
        plotManager.setSectionDepth(0.5);

        Course course = new Course("Mathematics");
        course.addStudent(new Student("Alice", 85.0));
        course.addStudent(new Student("Bob", 90.0));

        for (Student student : course.getStudents()) {
            System.out.println("Student: " + student.getName() + ", Grade: " + student.getGrade());
        }

        /* read */ double sectionDepth = plotManager.getSectionDepth();
        System.out.println("RingPlot Section Depth: " + sectionDepth);
    }
}