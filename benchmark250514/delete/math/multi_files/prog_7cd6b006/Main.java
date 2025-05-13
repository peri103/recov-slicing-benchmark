public class Main {
    public static void main(String[] args) {
        DataStructures dataStructures = new DataStructures(3, 3);
        dataStructures.initializeMatrix();

        // Perform unrelated operations
        double sum = dataStructures.getSumOfEntries();
        System.out.println("Sum of all matrix entries: " + sum);

        // Original write operation
        dataStructures.getMatrixOperations().setMatrixEntry(0, 0, 2.5);

        // Original read operation
        /* read */ double value = dataStructures.getMatrixOperations().getMatrixEntry(0, 0);
        System.out.println("Value at (0, 0): " + value);

        // Display the transposed matrix
        dataStructures.displayTransposedMatrix();
    }
}