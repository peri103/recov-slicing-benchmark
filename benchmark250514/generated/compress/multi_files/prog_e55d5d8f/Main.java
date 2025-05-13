public class Main {
    public static void main(String[] args) {
        CompressionMethods compressionMethods = new CompressionMethods();
        ZipEntryManager zipEntryManager = new ZipEntryManager("example.txt");

        // Set compression method
        String methodName = "DEFLATED";
        Integer methodValue = compressionMethods.getMethodValue(methodName);
        if (methodValue != null) {
            zipEntryManager.setCompressionMethod(methodValue);
        }

        // Perform some unrelated logic
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum of numbers from 0 to 9: " + sum);

        // Get and print the compression method
        /* read */ int method = zipEntryManager.getCompressionMethod();
        System.out.println("Compression Method: " + method);

        // More unrelated logic
        int factorial = 1;
        for (int i = 1; i <= 5; i++) {
            factorial *= i;
        }
        System.out.println("Factorial of 5: " + factorial);
    }
}