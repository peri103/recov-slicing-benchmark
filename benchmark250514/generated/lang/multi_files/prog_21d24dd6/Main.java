public class Main {
    public static void main(String[] args) {
        StrManipulator manipulator = new StrManipulator("Hello World");
        manipulator.appendText(" and Universe");
        manipulator.insertText(0, "Greetings ");
        
        // Perform the write operation
        manipulator.deleteFirstOccurrence("Hello");

        // Use StrAnalyzer to analyze the text
        StrAnalyzer analyzer = new StrAnalyzer(manipulator);
        System.out.println("Word count: " + analyzer.countWords());
        
        // Perform further manipulations
        manipulator.appendText(" with extra content");
        
        // Final read operation
        /* read */ String finalText = manipulator.getText();
        
        System.out.println("Final manipulated text: " + finalText);
        System.out.println("Analyzed text: " + analyzer.analyzeText());
    }
}