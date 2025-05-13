public class Main {
    public static void main(String[] args) {
        // Manage PiePlot
        PiePlotManager piePlotManager = new PiePlotManager();
        piePlotManager.configureLabelGenerator();
        /* read */ PieSectionLabelGenerator retrievedLabelGenerator = piePlotManager.retrieveLabelGenerator();
        System.out.println("Retrieved Label Generator: " + retrievedLabelGenerator);

        // Create and manage students and courses
        Student student1 = new Student("Alice", 1);
        Student student2 = new Student("Bob", 2);

        Course course = new Course("Math 101");
        course.addStudent(student1);
        course.addStudent(student2);

        System.out.println("Course: " + course.courseName);
        course.listStudents();
    }
}