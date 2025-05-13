public class Main {
    public static void main(String[] args) {
        Course course = new Course();
        Student student1 = new Student("Alice", course);
        Student student2 = new Student("Bob", course);

        student1.enroll("Mathematics");
        student2.enroll("Science");

        String aliceCourse = course.getCourseForStudent("Alice");
        System.out.println("Alice is enrolled in: " + aliceCourse);

        String bobCourse = course.getCourseForStudent("Bob");
        System.out.println("Bob is enrolled in: " + bobCourse);

        // Additional logic to demonstrate complexity
        if (aliceCourse.equals("Mathematics")) {
            System.out.println("Alice is taking the Mathematics course.");
        } else {
            System.out.println("Alice is not taking the Mathematics course.");
        }

        if (bobCourse.equals("Science")) {
            System.out.println("Bob is taking the Science course.");
        } else {
            System.out.println("Bob is not taking the Science course.");
        }
    }
}