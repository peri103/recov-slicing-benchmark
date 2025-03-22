public class Main {
    public static void main(String[] args) {
        DequeWrapper dequeWrapper = new DequeWrapper();
        Student student = new Student("John Doe");

        // Add grades to the student
        student.addGrade(85);
        student.addGrade(90);
        student.addGrade(78);

        // Print student's average grade
        System.out.println("Average grade for " + student.getName() + ": " + student.getAverageGrade());

        // Add and print values from the deque
        dequeWrapper.addValue(42);
        dequeWrapper.addMultipleValues(84, 168, 252);
        dequeWrapper.printAndClearDeque();

        // Retrieve and print the first value added to the deque
        int firstValue = dequeWrapper.getFirstValue();
        System.out.println("First value in deque: " + firstValue);
    }
}