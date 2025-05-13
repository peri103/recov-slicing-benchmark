import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.general.Dataset;

public class Main {
    public static void main(String[] args) {
        // Create a dataset
        Dataset dataset = new DefaultPieDataset();
        ((DefaultPieDataset) dataset).setValue("Category A", 45);
        ((DefaultPieDataset) dataset).setValue("Category B", 25);
        ((DefaultPieDataset) dataset).setValue("Category C", 30);

        // Create a custom plot and set dataset
        CustomPlot customPlot = new CustomPlot();
        customPlot.setCustomDataset(dataset);

        // Create a course and add students
        Course course = new Course("Computer Science");
        course.addStudent(new Student("Alice", 20));
        course.addStudent(new Student("Bob", 22));

        // Display course details
        System.out.println(course);

        // Retrieve the dataset from the custom plot
        /* read */ Dataset retrievedDataset = customPlot.getCustomDataset();
        System.out.println(retrievedDataset == dataset ? "Dataset set and retrieved successfully." : "Failed to retrieve dataset.");
    }
}