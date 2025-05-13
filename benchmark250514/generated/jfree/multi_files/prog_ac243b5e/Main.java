import org.jfree.chart.axis.CategoryAxis;

public class Main {
    public static void main(String[] args) {
        AxisLabelManager axisLabelManager = new AxisLabelManager();
        axisLabelManager.setAxisLabel("Sample Label");

        Course course = new Course("Mathematics");
        Student student1 = new Student("Alice", 1);
        Student student2 = new Student("Bob", 2);

        course.addStudent(student1);
        course.addStudent(student2);

        CategoryAxis categoryAxis = new CategoryAxis();
        categoryAxis.setLabel("Category Axis Label");

        for (Student student : course.getStudents()) {
            System.out.println("Student Name: " + student.getName() + ", ID: " + student.getId());
        }

        String categoryLabel = categoryAxis.getLabel();
        System.out.println("Category Axis Label: " + categoryLabel);

        /* read */ String label = axisLabelManager.getAxisLabel();
        System.out.println("Axis Label: " + label);
    }
}