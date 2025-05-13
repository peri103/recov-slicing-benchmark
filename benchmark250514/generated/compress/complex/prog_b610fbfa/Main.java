import org.apache.commons.compress.archivers.jar.JarArchiveEntry;
import org.apache.commons.compress.archivers.zip.ZipArchiveEntry;

public class Main {
    public static void main(String[] args) {
        // Original JarArchiveEntry operations
        JarArchiveEntry jarEntry = new JarArchiveEntry("example.jar");
        byte[] extraData = new byte[] {1, 2, 3, 4, 5};
        
        /* write */ jarEntry.setExtra(extraData);

        // Additional unrelated code to increase complexity
        ZipArchiveEntry zipEntry = new ZipArchiveEntry("example.zip");
        zipEntry.setComment("This is a zip entry comment");
        
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        
        System.out.println("Sum of numbers from 0 to 9 is: " + sum);

        // More complex operations using ZipArchiveEntry
        byte[] zipExtraData = new byte[] {10, 20, 30};
        zipEntry.setExtra(zipExtraData);
        
        String comment = zipEntry.getComment();
        System.out.println("Zip entry comment: " + comment);

        // Continue with original JarArchiveEntry operations
        int product = 1;
        for (int i = 1; i <= 5; i++) {
            product *= i;
        }
        
        System.out.println("Product of numbers from 1 to 5 is: " + product);
        
        /* read */ byte[] readExtraData = jarEntry.getExtra();
        
        System.out.print("Jar entry extra data: ");
        for (byte b : readExtraData) {
            System.out.print(b + " ");
        }
    }
}