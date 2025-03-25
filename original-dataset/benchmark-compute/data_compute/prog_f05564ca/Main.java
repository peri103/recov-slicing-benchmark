import java.util.Vector;
public class Main {
    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<>();
        vector.add(10);
        vector.add(20);
        vector.add(30);
        vector.add(40);
        vector.add(50);
        int indexToRead = (int) Math.sqrt(49);  
        int falseCondition = indexToRead % 2;  
        if (falseCondition == 0) {
            vector.set(0, 100);  
        } else {
            vector.set(1, 200);  
        }
        if (indexToRead > 5) {
            /* write */ vector.add(1, 99); 
        } else {
            vector.add(0, 88);  
        }
        vector.add(2);  
        vector.add(3);  
        vector.remove(0); 
        int check = vector.indexOf(200); 
        if (check < 0) {
            vector.set(3, 250);
        }
        /* read */ int ret = vector.get(1);
        System.out.println(ret);
    }
}
