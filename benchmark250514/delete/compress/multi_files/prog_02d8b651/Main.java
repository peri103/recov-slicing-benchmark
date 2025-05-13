public class Main {
    public static void main(String[] args) {
        ZipEntryManager manager = new ZipEntryManager();
        manager.addEntry("entry1", "initialName");
        manager.addEntry("entry2", "anotherName");

        // Additional unrelated operations
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum of numbers from 0 to 9: " + sum);

        // Update an entry name
        manager.updateEntryName("entry1", "newName");

        // Additional unrelated operations
        int product = 1;
        for (int i = 1; i <= 5; i++) {
            product *= i;
        }
        System.out.println("Product of numbers from 1 to 5: " + product);

        // Read the updated entry name
        /* read */ String name = manager.getEntryName("entry1");
        System.out.println("Read Entry Name: " + name);

        // Print all entries
        manager.printAllEntries();
    }
}