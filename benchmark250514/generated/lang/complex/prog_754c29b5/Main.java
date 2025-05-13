import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        HashCodeBuilder builder = new HashCodeBuilder();
        EqualsBuilder equalsBuilder = new EqualsBuilder();

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }

        /* write */ builder.append(123);
        equalsBuilder.append(123, 123);

        for (Integer num : list) {
            int squared = num * num;
            builder.append(squared);
            equalsBuilder.append(squared, squared);
        }

        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("Hello");
        stringList.add("World");
        stringList.add("Java");

        for (String str : stringList) {
            builder.append(str.hashCode());
            equalsBuilder.append(str.hashCode(), str.hashCode());
        }

        boolean areEqual = equalsBuilder.isEquals();
        System.out.println("Are all comparisons equal? " + areEqual);

        /* read */ int hashCode = builder.toHashCode();
        System.out.println("Final hash code: " + hashCode);
    }
}