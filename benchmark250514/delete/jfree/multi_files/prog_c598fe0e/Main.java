import java.util.Random;

public class Main {
    public static void main(String[] args) {
        RendererManager rendererManager = new RendererManager();
        rendererManager.setSeriesVisibility(0, true);

        Course course = new Course("Computer Science");
        course.addStudent(new Student("Alice", 1));
        course.addStudent(new Student("Bob", 2));

        Random random = new Random();
        int randomStudentIndex = random.nextInt(course.getStudents().size());
        Student randomStudent = course.getStudents().get(randomStudentIndex);

        System.out.println("Randomly selected student: " + randomStudent.getName());

        // Perform unrelated calculations
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum of first 10 natural numbers: " + sum);

        // Retrieve visibility status
        LineAndShapeRenderer renderer = rendererManager.getRenderer();
        /* read */ boolean isVisible = renderer.getSeriesShapesVisible(0);
        System.out.println("Visibility of series 0: " + isVisible);
    }
}