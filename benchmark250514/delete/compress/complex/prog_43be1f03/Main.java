import org.apache.commons.compress.archivers.cpio.CpioArchiveEntry;

public class Main {
    public static void main(String[] args) {
        CpioArchiveEntry entry = new CpioArchiveEntry("test");
        
        // Additional code using CpioArchiveEntry
        CpioArchiveEntry entry2 = new CpioArchiveEntry("test2");
        entry2.setFileType(CpioArchiveEntry.C_ISDIR);
        
        // Unrelated complex code
        int[] numbers = {1, 2, 3, 4, 5};
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        System.out.println("Sum: " + sum);
        
        String[] names = {"Alice", "Bob", "Charlie"};
        for (String name : names) {
            System.out.println("Hello, " + name);
        }
        
        // More unrelated logic
        int factorial = 1;
        for (int i = 1; i <= 5; i++) {
            factorial *= i;
        }
        System.out.println("Factorial of 5: " + factorial);
        
        // Original write method
        /* write */ entry.setFileType(CpioArchiveEntry.C_ISREG);
        
        // Additional unrelated logic
        boolean isEven = (factorial % 2 == 0);
        System.out.println("Is factorial even? " + isEven);
        
        // Original read method
        /* read */ int fileType = entry.getFileType();
        System.out.println("File Type: " + fileType);
        
        // More unrelated logic
        int max = numbers[0];
        for (int number : numbers) {
            if (number > max) {
                max = number;
            }
        }
        System.out.println("Max number: " + max);
    }
}