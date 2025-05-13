import org.apache.commons.lang3.text.StrBuilder;

public class Main {
    public static void main(String[] args) {
        StrBuilder strBuilder = new StrBuilder("Hello World");
        StrBuilder strBuilder2 = new StrBuilder("Additional Text");
        
        // Perform some operations on strBuilder2
        strBuilder2.append(" with more content");
        System.out.println("Initial strBuilder2: " + strBuilder2.toString());
        
        // Manipulate strBuilder2
        strBuilder2.replaceFirst("Additional", "Extra");
        System.out.println("Modified strBuilder2: " + strBuilder2.toString());
        
        /* write */ strBuilder.deleteFirst("Hello");
        
        // Further operations on strBuilder
        strBuilder.append(" Universe");
        strBuilder.insert(0, "Greetings ");
        
        // Use strBuilder2 again
        strBuilder2.deleteCharAt(0);
        System.out.println("Final strBuilder2: " + strBuilder2.toString());
        
        // More unrelated code to increase complexity
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum of first 10 numbers: " + sum);
        
        // Final read operation
        /* read */ String result = strBuilder.toString();
        
        System.out.println("Final strBuilder: " + result);
    }
}