public class Main {
    public static void main(String[] args) {
        CustomSetBuilder setBuilder = new CustomSetBuilder();
        setBuilder.addElement("Hello");
        
        Course course = new Course("Computer Science");
        course.enrollStudent("Alice");
        course.enrollStudent("Bob");
        
        DataProcessor processor = new DataProcessor(setBuilder);
        
        boolean containsHello = processor.containsElement("Hello");
        System.out.println("Set contains 'Hello': " + containsHello);
        
        System.out.println("Enrolled students in " + course.courseName + ":");
        for (String student : course.getStudents()) {
            System.out.println(student);
        }
    }
}