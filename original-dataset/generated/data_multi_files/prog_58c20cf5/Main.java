public class Main {
    public static void main(String[] args) {
        SortedSetOperations sortedSetOps = new SortedSetOperations();
        Student student = new Student("Alice");

        sortedSetOps.addNumber(10);
        sortedSetOps.addNumber(20);
        sortedSetOps.addNumber(30);

        student.enrollCourse("Math");
        student.enrollCourse("Science");

        boolean isEnrolledInMath = student.isEnrolled("Math");
        System.out.println("Is Alice enrolled in Math? " + isEnrolledInMath);

        boolean containsTwenty = sortedSetOps.containsNumber(20);
        System.out.println("SortedSet contains 20: " + containsTwenty);

        /* read */ boolean containsTen = sortedSetOps.containsNumber(10);
        System.out.println("SortedSet contains 10: " + containsTen);
    }
}