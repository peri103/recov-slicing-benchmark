import org.jfree.chart.plot.PiePlot;

public class Main {
    public static void main(String[] args) {
        ChartSettings chartSettings = new ChartSettings();
        chartSettings.configurePiePlot();

        Course course = new Course("Computer Science");
        Student student1 = new Student("Alice", 101);
        Student student2 = new Student("Bob", 102);

        course.addStudent(student1);
        course.addStudent(student2);

        System.out.println("Course: " + course.getCourseName());
        for (Student student : course.getStudents()) {
            System.out.println("Student: " + student.getName() + ", ID: " + student.getStudentID());
        }

        PiePlot piePlot = chartSettings.getPiePlot();
        /* read */ double labelGap = piePlot.getLabelGap();
        System.out.println("Label Gap: " + labelGap);
    }
}