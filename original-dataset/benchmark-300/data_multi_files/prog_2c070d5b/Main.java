import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSetManager treeSetManager = new TreeSetManager();
        Student student = new Student("Alice");

        // Adding random grades to the student
        student.addRandomGrades(10);

        // Copying grades from student to TreeSetManager
        for (int grade : student.getGrades()) {
            treeSetManager.addValue(grade);
        }

        // Writing a specific value to the TreeSetManager
        treeSetManager.addValue(10);

        // Performing some unrelated operations
        int sum = 0;
        for (int value : treeSetManager.getTreeSet()) {
            sum += value;
        }
        System.out.println("Sum of all elements in TreeSet: " + sum);

        // Checking if the TreeSetManager contains the written value
        /* read */ boolean containsValue = treeSetManager.containsValue(10);
        System.out.println("TreeSet contains 10: " + containsValue);

        // Printing the final state of the TreeSet
        System.out.println("Final TreeSet: " + treeSetManager.getTreeSet());
    }
}