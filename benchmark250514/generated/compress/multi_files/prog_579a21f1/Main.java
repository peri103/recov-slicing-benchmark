import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        GzipParametersWrapper gzipWrapper = new GzipParametersWrapper();
        OperatingSystemInfo osInfo = new OperatingSystemInfo();
        
        ArrayList<Integer> osCodes = new ArrayList<>();
        osCodes.add(1);
        osCodes.add(2);
        osCodes.add(3);
        osCodes.add(4);
        
        for (int code : osCodes) {
            if (code == 3) {
                gzipWrapper.setOperatingSystem(code);
            }
        }
        
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i * i;
        }
        System.out.println("Sum of squares: " + sum);
        
        /* read */ int operatingSystem = gzipWrapper.getOperatingSystem();
        String osName = osInfo.getOSName(operatingSystem);
        System.out.println("Operating System: " + osName);
        
        ArrayList<String> messages = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            messages.add("Message " + i);
        }
        
        for (String message : messages) {
            System.out.println(message);
        }
        
        int factorial = 1;
        for (int i = 1; i <= 5; i++) {
            factorial *= i;
        }
        System.out.println("Factorial of 5: " + factorial);
    }
}