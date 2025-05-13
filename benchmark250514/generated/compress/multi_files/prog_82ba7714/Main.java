public class Main {
    public static void main(String[] args) {
        FileManager fileManager = new FileManager();
        
        // Add a file with CRC value
        fileManager.addFile("example.txt", 123456789L);
        
        // Perform some operations
        fileManager.printFileDetails("example.txt");
        
        // Retrieve and print the CRC value separately
        ZipMetadata metadata = fileManager.getFile("example.txt");
        if (metadata != null) {
            /* read */ long crcValue = metadata.getCrc();
            System.out.println("Retrieved CRC Value: " + crcValue);
        }
    }
}