public class Main {
    public static void main(String[] args) {
        SortedSetManager sortedSetManager = new SortedSetManager();
        sortedSetManager.addElement(42);
        sortedSetManager.addElement(15);
        sortedSetManager.addElement(30);

        Student alice = new Student("Alice", 101);
        Student bob = new Student("Bob", 102);

        Course mathCourse = new Course("Mathematics");
        mathCourse.enrollStudent(alice);
        mathCourse.enrollStudent(bob);

        // Check if a student is enrolled
        if (mathCourse.isStudentEnrolled(alice)) {
            System.out.println(alice.getName() + " is enrolled in " + mathCourse.getEnrolledStudents());
        }

        // Check if the sorted set contains a specific element
        int checkValue = 42;
        /* read */ boolean containsValue = sortedSetManager.containsElement(checkValue);
        System.out.println("SortedSet contains " + checkValue + ": " + containsValue);
    }
}