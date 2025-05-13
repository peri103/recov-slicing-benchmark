import org.apache.commons.lang3.mutable.MutableDouble;
import org.apache.commons.lang3.mutable.MutableInt;

public class Main {
    public static void main(String[] args) {
        MutableDouble mutableDouble = new MutableDouble();
        MutableInt mutableInt = new MutableInt();
        
        // Some unrelated operations
        mutableInt.setValue(5);
        int intValue = mutableInt.getValue();
        System.out.println("MutableInt value: " + intValue);
        
        // Perform calculations
        double calculationResult = intValue * 2.5;
        System.out.println("Calculation Result: " + calculationResult);
        
        // Perform operations on MutableDouble
        /* write */ mutableDouble.setValue(calculationResult);
        
        // More unrelated operations
        MutableDouble anotherDouble = new MutableDouble();
        anotherDouble.setValue(3.3);
        double anotherValue = anotherDouble.getValue();
        System.out.println("Another MutableDouble value: " + anotherValue);
        
        // Perform more calculations
        double combinedResult = mutableDouble.getValue() + anotherValue;
        System.out.println("Combined Result: " + combinedResult);
        
        // Final read operation
        /* read */ double value = mutableDouble.getValue();
        System.out.println("MutableDouble value: " + value);
        
        // Additional operations
        double finalResult = value * 2;
        System.out.println("Final Result: " + finalResult);
    }
}