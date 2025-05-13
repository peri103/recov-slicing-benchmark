import com.google.common.collect.ImmutableSortedSet;

public class Main {
    public static void main(String[] args) {
        // Use ImmutableSetBuilder
        ImmutableSetBuilder setBuilder = new ImmutableSetBuilder();
        setBuilder.addElement(42);
        
        // Use Student class
        Student student = new Student("John Doe");
        student.addGrade(85);
        student.addGrade(92);
        System.out.println("Student: " + student.getName());
        System.out.println("Grades: " + student.getGrades());

        // Build the set and check for element
        ImmutableSortedSet<Integer> set = setBuilder.buildSet();
        ImmutableSetChecker setChecker = new ImmutableSetChecker(set);
        boolean contains = setChecker.containsElement(42);
        System.out.println("Contains 42: " + contains);

        // Additional operations
        int sumGrades = student.getGrades().stream().mapToInt(Integer::intValue).sum();
        System.out.println("Sum of grades: " + sumGrades);
    }
}