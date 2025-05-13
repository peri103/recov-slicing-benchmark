public class Main {
    public static void main(String[] args) {
        Student student = new Student("Alice");
        student.addCourseScore("Math", 95);
        student.addCourseScore("Science", 88);

        int mathScore = student.getCourseScore("Math");
        System.out.println(student.getName() + "'s Math score: " + mathScore);

        /* read */ int scienceScore = student.getCourseScore("Science");
        System.out.println(student.getName() + "'s Science score: " + scienceScore);

        // Additional operations
        int sum = 0;
        for (int i = 1; i <= 5; i++) {
            sum += i;
        }
        System.out.println("Sum of numbers from 1 to 5: " + sum);

        // Demonstrate additional data structure usage
        Map<String, String> contactInfo = new HashMap<>();
        contactInfo.put("email", "alice@example.com");
        contactInfo.put("phone", "123-456-7890");

        for (Map.Entry<String, String> entry : contactInfo.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}