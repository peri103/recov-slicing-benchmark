public class Main {
    public static void main(String[] args) {
        Course mathCourse = new Course("Mathematics");
        mathCourse.addGrade(85);
        mathCourse.addGrade(90);
        mathCourse.addGrade(95);

        Student student = new Student("John Doe", mathCourse);
        student.getCourse().addGrade(100);

        // Retrieve the specific grade added in the Course class
        /* read */ int retrievedGrade = student.getCourse().getGrade(3);
        System.out.println("Retrieved Grade: " + retrievedGrade);

        // Additional operations to demonstrate complexity
        Course scienceCourse = new Course("Science");
        student.enrollInCourse(scienceCourse);
        scienceCourse.addGrade(88);
        scienceCourse.addGrade(92);

        System.out.println("Student: " + student.getName());
        System.out.println("Enrolled in: " + student.getCourse().getCourseName());
        System.out.println("Grades in Science Course:");
        for (int i = 0; i < 2; i++) {
            System.out.println(student.getCourse().getGrade(i));
        }
    }
}