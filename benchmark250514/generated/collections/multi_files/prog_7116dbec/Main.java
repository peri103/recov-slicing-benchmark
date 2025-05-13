public class Main {
    public static void main(String[] args) {
        Student student = new Student("John");
        Course course = student.getCourse();
        
        course.addAssignment("Math Homework");
        
        // Additional functionality
        course.addAssignment("Science Project");
        course.addAssignment("Math Homework"); // Add the same assignment again

        int mathHomeworkCount = course.getAssignmentCount("Math Homework");
        System.out.println("Math Homework count: " + mathHomeworkCount);

        int scienceProjectCount = course.getAssignmentCount("Science Project");
        System.out.println("Science Project count: " + scienceProjectCount);
    }
}