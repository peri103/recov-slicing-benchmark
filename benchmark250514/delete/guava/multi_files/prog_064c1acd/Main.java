public class Main {
    public static void main(String[] args) {
        Course mathCourse = new Course("Mathematics");
        Student alice = new Student("Alice", mathCourse);
        alice.enrollInCourse();

        boolean isEnrolled = mathCourse.isStudentEnrolled(alice);
        System.out.println("Is Alice enrolled in " + mathCourse.getCourseName() + "? " + isEnrolled);

        Student bob = new Student("Bob", mathCourse);
        bob.enrollInCourse();

        isEnrolled = mathCourse.isStudentEnrolled(bob);
        System.out.println("Is Bob enrolled in " + mathCourse.getCourseName() + "? " + isEnrolled);
    }
}