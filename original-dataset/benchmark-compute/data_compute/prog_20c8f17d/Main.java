import java.util.concurrent.CopyOnWriteArraySet;
public class Main {
    public static void main(String[] args) {
        CopyOnWriteArraySet<Integer> set = new CopyOnWriteArraySet<>();
        set.add(5);
        set.add(10);
        int sum = 0;
        for (int i = 0; i < 5; i++) { 
            sum += i;
        }
        if (sum % 2 == 0) { 
            set.add(15); 
        } else {
            set.add(20);
        }
        /* write */ set.add(sum + 25); 
        int misleadingValue = set.contains(10) ? 100 : 200; 
        for (int i : set) { 
            misleadingValue += i;
        }
        int uselessVar = misleadingValue / 5; 
        uselessVar *= 2;
        /* read */ int ret = set.stream().filter(x -> x > 29).findFirst().orElse(0);
        System.out.println(ret);
    }
}
