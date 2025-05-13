public class Main {
    public static void main(String[] args) {
        // Create a course and students
        Course course = new Course("Mathematics");
        Person student1 = new Person("Alice", 20);
        Person student2 = new Person("Bob", 22);

        // Enroll students in the course
        course.enrollStudent(student1);
        course.enrollStudent(student2);

        // Create a DescriptionBuilder for the course
        DescriptionBuilder descriptionBuilder = new DescriptionBuilder(course);

        // Append course description
        descriptionBuilder.appendDescription("CourseName", "Mathematics");

        // Display enrolled students
        for (Person student : course.getEnrolledStudents()) {
            System.out.println("Enrolled Student: " + student.getName() + ", Age: " + student.getAge());
        }

        // Build and print the course description
        String courseDescription = descriptionBuilder.buildDescription();
        System.out.println("Course Description: " + courseDescription);
    }
}