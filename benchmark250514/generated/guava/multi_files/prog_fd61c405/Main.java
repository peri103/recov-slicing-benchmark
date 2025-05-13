public class Main {
    public static void main(String[] args) {
        Course course = new Course();
        Student alice = new Student("Alice", course);
        Student bob = new Student("Bob", course);

        alice.addGrade("Assignment1", 85);
        bob.addGrade("Assignment1", 90);

        // Unrelated operations
        int unrelatedCalculation = 7 * 6;
        System.out.println("Unrelated Calculation: " + unrelatedCalculation);

        // Further operations
        alice.addGrade("Assignment2", 95);
        bob.addGrade("Assignment2", 88);

        // Retrieve and print grades
        Integer aliceGrade = alice.getGrade("Assignment1");
        /* read */ System.out.println("Alice's Grade for Assignment1: " + aliceGrade);

        Integer bobGrade = bob.getGrade("Assignment1");
        System.out.println("Bob's Grade for Assignment1: " + bobGrade);
    }
}