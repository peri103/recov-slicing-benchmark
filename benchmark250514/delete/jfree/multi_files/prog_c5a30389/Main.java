import org.jfree.chart.renderer.category.CategoryItemRenderer;

public class Main {
    public static void main(String[] args) {
        PlotManager plotManager = new PlotManager();
        CategoryItemRenderer renderer = new CustomRenderer();
        
        plotManager.setCustomRenderer(renderer);

        // Create course and students
        Course course = new Course("Mathematics");
        Student student1 = new Student("Alice");
        Student student2 = new Student("Bob");
        
        student1.addScore(85);
        student2.addScore(90);

        course.addStudent(student1);
        course.addStudent(student2);

        for (Student student : course.getStudents()) {
            System.out.println("Student: " + student.getName());
            for (int score : student.getScores()) {
                System.out.println("Score: " + score);
            }
        }

        /* read */ CategoryItemRenderer retrievedRenderer = plotManager.getRenderer();
        System.out.println("Retrieved Renderer: " + retrievedRenderer);
    }
}