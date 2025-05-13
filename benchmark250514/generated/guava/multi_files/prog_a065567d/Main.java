public class Main {
    public static void main(String[] args) {
        Student student = new Student("John Doe");
        student.addRange(1, 10, "Value1");
        
        // Perform some unrelated operations
        int sum = 0;
        for (int i = 1; i <= 5; i++) {
            sum += i;
        }
        System.out.println("Sum of numbers from 1 to 5: " + sum);
        
        /* read */ String value = student.getValueFromRange(5);
        System.out.println("Value at 5: " + value);
        
        // Additional unrelated operations
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 3; i++) {
            sb.append("Extra Iteration ").append(i).append("\n");
        }
        System.out.println(sb.toString());
    }
}