public class Main {
    public static void main(String[] args) {
        Student student = new Student("John Doe");
        student.addData("testData");

        // Perform some unrelated operations
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum of first 10 numbers: " + sum);

        /* read */ boolean dataExists = student.checkData("testData");
        System.out.println("Does the student have 'testData'? " + dataExists);

        // More unrelated operations
        for (int i = 0; i < 5; i++) {
            System.out.println("Unrelated operation " + i);
        }
    }
}