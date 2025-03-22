public class Main {
    public static void main(String[] args) {
        DequeOperations dequeOps = new DequeOperations();
        DataStructures dataStructs = new DataStructures();

        dataStructs.populateQueue();
        dataStructs.transferQueueToDeque(dequeOps);
        dataStructs.populateMap();
        dataStructs.displayMapContents();

        dequeOps.addFirstElement(100);
        dequeOps.addElement(200);

        // Read the last element of the deque
        /* read */ Integer value = dequeOps.peekLastElement();
        System.out.println("Peek Last: " + value);

        dequeOps.addElement(300);
        dequeOps.addElement(400);

        dequeOps.printAndClearDeque();
    }
}