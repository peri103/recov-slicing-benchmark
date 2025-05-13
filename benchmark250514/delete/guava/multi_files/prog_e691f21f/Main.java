public class Main {
    public static void main(String[] args) {
        // Using the ImmutableSortedMultisetWrapper
        ImmutableSortedMultisetWrapper multisetWrapper = new ImmutableSortedMultisetWrapper();
        multisetWrapper.addElement(1);
        multisetWrapper.addElement(2);
        multisetWrapper.addElement(3);

        // Using the Course class
        Course course = new Course("Mathematics");
        course.addStudent("Alice");
        course.addStudent("Bob");
        course.addStudent("Alice");
        course.printStudentCounts();

        // Building the multiset and reading the count of '1'
        ImmutableSortedMultiset<Integer> sortedMultiset = multisetWrapper.buildMultiset();
        /* read */ int count = sortedMultiset.count(1);
        System.out.println("Count of '1' in sortedMultiset: " + count);

        // Additional unrelated logic
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum of first 10 natural numbers: " + sum);
    }
}