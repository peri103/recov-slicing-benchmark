import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Create RendererSettings instance
        RendererSettings rendererSettings = new RendererSettings();
        
        // Set the base shapes visibility for stepRenderer
        rendererSettings.setStepRendererShapesVisible(true);

        // Create a Course instance
        Course course = new Course("Advanced Java Programming");
        course.enrollStudent("John Doe");
        course.enrollStudent("Jane Smith");

        // Output the list of enrolled students
        System.out.println("Enrolled students in " + course.getCourseName() + ": " + course.getEnrolledStudents());

        // Perform some unrelated computations
        int product = 1;
        for (int i = 1; i <= 5; i++) {
            product *= i;
        }
        
        // Output unrelated computation result
        System.out.println("Product of numbers from 1 to 5: " + product);
        
        // Read operation: Retrieve the base shapes visibility from stepRenderer
        /* read */ boolean isStepRendererVisible = rendererSettings.isStepRendererShapesVisible();
        
        // Output the result
        System.out.println("Base shapes visible in StepRenderer: " + isStepRendererVisible);
    }
}