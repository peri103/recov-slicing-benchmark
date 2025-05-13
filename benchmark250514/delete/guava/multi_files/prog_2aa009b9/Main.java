public class Main {
    public static void main(String[] args) {
        DomainOperations operations = new DomainOperations();
        operations.performOperations();

        DomainManager manager = new DomainManager(operations);
        int previousValue = manager.getPreviousValue(5);
        System.out.println("Previous value: " + previousValue);
    }
}