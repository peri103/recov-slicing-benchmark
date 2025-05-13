public class Main {
    public static void main(String[] args) {
        // Initialize TokenHandler with a string
        TokenHandler handler = new TokenHandler("a,b,c,d");
        handler.setIgnoredCharacter(',');

        // Create a TokenReader to read tokens
        TokenReader reader = new TokenReader(handler.getTokenizer());

        // Read and print the first token
        String firstToken = reader.readNextToken();
        System.out.println("First token: " + firstToken);

        // Additional unrelated operations
        int[] numbers = {1, 2, 3, 4, 5};
        int product = 1;
        for (int number : numbers) {
            product *= number;
        }
        System.out.println("Product of numbers: " + product);

        // Demonstrate another class operation
        Course course = new Course("Introduction to Programming");
        course.addStudent("Alice");
        course.addStudent("Bob");
        course.printStudentList();
    }
}
