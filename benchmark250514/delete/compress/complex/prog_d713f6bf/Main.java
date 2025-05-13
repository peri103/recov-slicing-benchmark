import org.apache.commons.compress.archivers.cpio.CpioArchiveEntry;

public class Main {
    public static void main(String[] args) {
        CpioArchiveEntry entry = new CpioArchiveEntry("test");
        CpioArchiveEntry entry2 = new CpioArchiveEntry("example");
        
        // Set and get user name for entry2
        entry2.setUserName("Alice");
        String userName2 = entry2.getUserName();
        System.out.println("Entry2 UserName: " + userName2);

        // Set some other properties to entry
        entry.setSize(1024);
        entry.setMode(0755);

        // Perform some calculations
        int a = 5;
        int b = 10;
        int sum = a + b;
        System.out.println("Sum: " + sum);

        // Manipulate strings
        String greeting = "Hello";
        String name = "World";
        String message = greeting + ", " + name + "!";
        System.out.println(message);

        // Use a loop
        for (int i = 0; i < 3; i++) {
            System.out.println("Loop iteration: " + i);
        }

        /* write */ entry.setUserName("JohnDoe");

        // More calculations
        int multiplication = a * b;
        System.out.println("Multiplication: " + multiplication);

        // Conditional statement
        if (sum > multiplication) {
            System.out.println("Sum is greater than multiplication");
        } else {
            System.out.println("Multiplication is greater or equal to sum");
        }

        // Final operations
        int size = entry.getSize();
        System.out.println("Entry Size: " + size);

        /* read */ String userName = entry.getUserName();
        System.out.println("Entry UserName: " + userName);
    }
}