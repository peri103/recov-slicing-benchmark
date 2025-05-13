public class Main {
    public static void main(String[] args) {
        AxisLabelManager axisLabelManager = new AxisLabelManager();
        Course course = new Course("Computer Science 101");
        
        course.addStudent("Alice");
        course.addStudent("Bob");
        
        axisLabelManager.setLabel("Course Axis Label");
        
        System.out.println("Course Name: " + course.getCourseName());
        System.out.println("Students in the course:");
        for (String student : course.getStudents()) {
            System.out.println(student);
        }
        
        /* read */ String label = axisLabelManager.getLabel();
        System.out.println("Axis Label: " + label);
    }
}