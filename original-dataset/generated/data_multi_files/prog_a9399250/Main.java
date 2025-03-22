public class Main {
    public static void main(String[] args) {
        DequeManager dequeManager = new DequeManager();
        ComplexOperations complexOperations = new ComplexOperations();

        // Perform complex operations
        complexOperations.printStringList();
        complexOperations.printMap();

        // Add value to the deque
        dequeManager.addValue(42);

        try {
            // Take the first element from the deque
            /* read */
            int value = dequeManager.getDeque().takeFirst();
            System.out.println("Deque value: " + value);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Additional operations on the deque
        dequeManager.addValue(84);
        dequeManager.addValue(168);

        try {
            System.out.println("Deque first value: " + dequeManager.getDeque().takeFirst());
            System.out.println("Deque last value: " + dequeManager.getDeque().takeLast());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}