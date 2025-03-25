import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(100);
        list.add(200);
        list.add(300);
        list.add(400);
        int num = (int) (Math.random() * 100);
        if (num % 2 == 0) {
            /* write */ list.add(500);  
        } else {
            list.add(600);  
        }
        int tempValue = list.get(0);  
        list.set(0, tempValue + 10);
        list.remove(2);
        list.add(700);
        int x = (num * 2) / 4 + 5; 
        String nonsense = "This does not matter";
        list.add(x);
        /* read */ int ret = list.get(4); 
        System.out.println("Retrieved value: " + ret);
    }
}
