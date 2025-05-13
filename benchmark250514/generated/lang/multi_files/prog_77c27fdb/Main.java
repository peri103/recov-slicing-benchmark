public class Main {
    public static void main(String[] args) {
        Course course = new Course("Computer Science");
        Student student1 = new Student("Alice", 20);
        Student student2 = new Student("Bob", 22);

        course.addStudent(student1);
        course.addStudent(student2);

        // Perform some unrelated operations
        int totalAge = student1.getAge() + student2.getAge();
        System.out.println("Total age of students: " + totalAge);

        // Check if two students are equal
        /* read */ boolean isEqual = course.areStudentsEqual(0, 1);
        System.out.println("Are the students equal? " + isEqual);

        // Perform more unrelated operations
        String courseName = "Advanced Programming";
        System.out.println("Course name: " + courseName);
    }
}