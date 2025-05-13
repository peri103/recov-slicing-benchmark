public class Main {
    public static void main(String[] args) {
        EqualityChecker equalityChecker = new EqualityChecker();
        equalityChecker.appendValues(1, 1);

        HashCodeGenerator hashCodeGenerator = new HashCodeGenerator();
        for (int i = 0; i < 5; i++) {
            hashCodeGenerator.appendValue(i);
        }

        int generatedHashCode = hashCodeGenerator.generateHashCode();
        System.out.println("Generated HashCode: " + generatedHashCode);

        Student student1 = new Student("Alice", 101);
        Student student2 = new Student("Bob", 102);

        System.out.println("Student 1: " + student1.getName() + ", ID: " + student1.getStudentId());
        System.out.println("Student 2: " + student2.getName() + ", ID: " + student2.getStudentId());

        boolean areNumbersEqual = equalityChecker.checkEquality(); /* read */
        System.out.println("Are numbers equal? " + areNumbersEqual);
    }
}