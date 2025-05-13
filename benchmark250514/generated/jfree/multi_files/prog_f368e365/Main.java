import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        DotRendererManager rendererManager = new DotRendererManager();
        rendererManager.setDotHeight(5);

        // Create a student and add grades
        Student student = new Student("John Doe");
        student.addGrade(85);
        student.addGrade(90);
        student.addGrade(75);

        // Calculate and display average grade
        double averageGrade = student.calculateAverage();
        System.out.println("Average grade for " + student.getName() + ": " + averageGrade);

        // Perform unrelated operations
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numbers.add(i * 3);
        }

        int maxNumber = numbers.stream().max(Integer::compare).orElse(-1);
        System.out.println("Max number: " + maxNumber);

        // Read the dot height
        /* read */ int dotHeight = rendererManager.getDotHeight();
        System.out.println("Dot height: " + dotHeight);
    }
}