public class Main {
    public static void main(String[] args) {
        // Create a student
        Student student = new Student("Alice");

        // Create a course and enroll the student
        Course course = new Course("Mathematics");
        student.enrollCourse(course);

        // Add grade for the student in the course
        course.addGrade(student.getName(), 95);

        // Retrieve and print the grade
        int grade = course.getGrade(student.getName());
        System.out.println(student.getName() + "'s grade in " + course.getCourseName() + ": " + grade);

        // Additional logic
        for (Course enrolledCourse : student.getCourses()) {
            System.out.println("Enrolled in: " + enrolledCourse.getCourseName());
        }

        // Simulate more complex interactions
        Course physics = new Course("Physics");
        student.enrollCourse(physics);
        physics.addGrade(student.getName(), 88);

        for (Course enrolledCourse : student.getCourses()) {
            int enrolledGrade = enrolledCourse.getGrade(student.getName());
            System.out.println(student.getName() + "'s grade in " + enrolledCourse.getCourseName() + ": " + enrolledGrade);
        }
    }
}