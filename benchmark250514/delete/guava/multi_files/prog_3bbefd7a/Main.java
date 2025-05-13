import com.google.common.collect.Range;

public class Main {
    public static void main(String[] args) {
        Course course = new Course("Mathematics");
        course.addRange(Range.closed(1, 10), "A");
        
        // Perform operations with hashMap
        course.addHashMapEntry(20, "B");
        course.addHashMapEntry(30, "C");
        
        for (int key : new int[]{20, 30}) {
            String hashMapValue = course.getHashMapValue(key);
            System.out.println("HashMap Value for key " + key + ": " + hashMapValue);
        }
        
        // Retrieve value from rangeMap
        /* read */ String rangeValue = course.getRangeValue(5);
        System.out.println("RangeMap Value for key 5: " + rangeValue);
        
        // More operations with rangeMap
        course.addRange(Range.closed(11, 20), "D");
        String anotherRangeValue = course.getRangeValue(15);
        System.out.println("RangeMap Value for key 15: " + anotherRangeValue);
    }
}