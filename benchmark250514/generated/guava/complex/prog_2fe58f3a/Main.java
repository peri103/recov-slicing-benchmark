import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableSet.Builder;
import com.google.common.collect.ImmutableList;

public class Main {
    public static void main(String[] args) {
        Builder<String> builder = ImmutableSet.builder();
        ImmutableList.Builder<Integer> listBuilder = ImmutableList.builder();
        
        /* write */ builder.add("Hello");
        
        for (int i = 0; i < 5; i++) {
            listBuilder.add(i * 2);
        }
        
        ImmutableList<Integer> numberList = listBuilder.build();
        int sum = 0;
        
        for (Integer num : numberList) {
            sum += num;
        }
        
        ImmutableSet<String> set = builder.build();
        
        System.out.println("Sum of numbers: " + sum);
        
        /* read */ boolean contains = set.contains("Hello");
        
        System.out.println("Set contains 'Hello': " + contains);
        
        Builder<String> anotherBuilder = ImmutableSet.builder();
        anotherBuilder.add("World").add("Java").add("Programming");
        
        ImmutableSet<String> anotherSet = anotherBuilder.build();
        
        for (String str : anotherSet) {
            System.out.println("Another set contains: " + str);
        }
    }
}