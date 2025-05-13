public class Main {
    public static void main(String[] args) {
        // Create a CustomMultiset instance and add elements
        CustomMultiset customMultiset = new CustomMultiset();
        customMultiset.addElement(42);
        customMultiset.addElement(15);
        customMultiset.addElement(42);
        customMultiset.addElement(7);

        // Create a Course instance and add students
        Course course = new Course("Mathematics");
        course.addStudent("Alice");
        course.addStudent("Bob");
        course.addStudent("Alice");

        // Print student count for Alice
        int aliceCount = course.getStudentCount("Alice");
        System.out.println("Alice count in " + course.getCourseName() + ": " + aliceCount);

        // Perform some unrelated calculations
        int unrelatedSum = 0;
        for (int i = 0; i < 10; i++) {
            unrelatedSum += i * i;
        }
        System.out.println("Unrelated sum: " + unrelatedSum);

        // Finally read the count of the original element
        /* read */ int count = customMultiset.countElement(42);
        System.out.println("Count of 42: " + count);
    }
}