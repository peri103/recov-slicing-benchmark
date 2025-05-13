import org.apache.commons.compress.compressors.gzip.GzipParameters;

public class Main {
    public static void main(String[] args) {
        GzipParameters parameters = new GzipParameters();
        GzipParameters parameters2 = new GzipParameters();

        // Set operating system for parameters2
        parameters2.setOperatingSystem(5);

        // Perform some operations with parameters2
        int os2 = parameters2.getOperatingSystem();
        System.out.println("Operating System for parameters2: " + os2);

        // Initialize additional variables
        int sum = 0;
        int[] numbers = {1, 2, 3, 4, 5};

        // Calculate the sum of numbers
        for (int number : numbers) {
            sum += number;
        }
        System.out.println("Sum of numbers: " + sum);

        // Set operating system for parameters
        /* write */ parameters.setOperatingSystem(3);

        // Perform additional calculations
        int product = 1;
        for (int number : numbers) {
            product *= number;
        }
        System.out.println("Product of numbers: " + product);

        // Retrieve the operating system
        /* read */ int os = parameters.getOperatingSystem();
        System.out.println("Operating System for parameters: " + os);

        // More calculations
        double average = (double) sum / numbers.length;
        System.out.println("Average of numbers: " + average);

        // Perform some logical operations
        boolean allPositive = true;
        for (int number : numbers) {
            if (number <= 0) {
                allPositive = false;
                break;
            }
        }
        System.out.println("All numbers are positive: " + allPositive);
    }
}