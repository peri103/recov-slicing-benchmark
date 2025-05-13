public class Main {
    public static void main(String[] args) {
        // Initialize FilePermissions and ZipAttributes
        FilePermissions filePermissions = new FilePermissions();
        ZipAttributes zipAttributes = new ZipAttributes("example.txt");

        // Add permissions
        filePermissions.addPermission("example.txt", 777);
        filePermissions.addPermission("test.txt", 644);

        // Print permissions
        filePermissions.printPermissions();

        // Set attributes
        zipAttributes.setAttributes(12345L);

        // Perform some unrelated calculations
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum of first 10 numbers: " + sum);

        // Read and print the attributes
        /* read */ long attributes = zipAttributes.getAttributes();
        System.out.println("External Attributes: " + attributes);
    }
}