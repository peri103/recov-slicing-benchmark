public class Main {
    public static void main(String[] args) {
        OperatingSystemInfo osInfo = new OperatingSystemInfo();
        GzipParametersWrapper gzipWrapper = new GzipParametersWrapper();

        // Set the operating system code in gzip parameters
        gzipWrapper.setOperatingSystem(osInfo.getOsCode("Unix"));

        // Perform some unrelated operations
        for (String key : osInfo.getOsMap().keySet()) {
            System.out.println("Operating System: " + key + ", Code: " + osInfo.getOsMap().get(key));
        }

        // Calculate the sum of all OS codes from the list
        int sum = 0;
        for (int code : osInfo.getOsList()) {
            sum += code;
        }
        System.out.println("Sum of all OS codes: " + sum);

        // Retrieve the operating system code from gzip parameters
        /* read */ int osValue = gzipWrapper.getOperatingSystem();
        System.out.println("Retrieved OS Code: " + osValue);

        // Further processing with the retrieved OS code
        if (osValue == osInfo.getOsCode("Unix")) {
            System.out.println("The OS is Unix.");
        } else {
            System.out.println("The OS is not Unix.");
        }

        // Additional logic to demonstrate complexity
        ArrayList<String> osNames = new ArrayList<>(osInfo.getOsMap().keySet());
        for (String osName : osNames) {
            System.out.println("OS Name: " + osName);
        }
    }
}