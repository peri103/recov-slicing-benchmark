public class Main {
    public static void main(String[] args) {
        TextManipulator textManipulator = new TextManipulator();
        
        // Use TextManipulator to insert and manipulate text
        textManipulator.insertText("Hello, World!");
        textManipulator.appendText(" Welcome to the complex program.");
        textManipulator.appendText(" Let's do some text manipulation.");
        
        for (int i = 0; i < 3; i++) {
            textManipulator.insertMidText(" Inserted text.");
        }
        
        // Perform unrelated operations
        int sum = ComplexOperations.calculateSum(10);
        System.out.println("Sum of numbers from 1 to 10: " + sum);
        
        // Use TextManipulator to get the final text
        /* read */ String value = textManipulator.getText();
        System.out.println(value);
        
        // Perform more complex operations
        String reverse = ComplexOperations.reverseString(value);
        System.out.println("Reversed string: " + reverse);
        
        int count = ComplexOperations.countCharacter(value, 'e');
        System.out.println("Number of 'e' characters: " + count);
    }
}