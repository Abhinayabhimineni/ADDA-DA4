import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
public class UnitConverter {
    public static void main(String[] args) {
        System.setProperty("webdriver.edge.driver","C:\\Users\\hi\\Downloads\\edgedriver_win64\\msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.get("file:///C:/Users/hi/Downloads/codes/codes/UnitConverter.html");

        // Test Case 1
        performTest(driver, "Test Case 1", "cm", "meters", 1700, 15);

        // Test Case 2
        performTest(driver, "Test Case 2", "meters", "cm", 3, 500);

        // Test Case 3 
        performTest(driver, "Test Case 3", "cm", "meters", 0, 0);

        // Test Case 4
        performTest(driver, "Test Case 4", "cm", "meters", 2500, 20);

        // Test Case 5 (Intentionally wrong values to simulate a failed test)
        performTest(driver, "Test Case 5", "kg", "grams", 10, 10000);

        pause(5000); // 5-second delay before quitting the driver
        driver.quit();
    }

    private static void performTest(WebDriver driver, String testCaseName, String fromUnit, String toUnit, double inputValue, double expectedValue) {
        boolean isTestSuccessful = UnitConverterLogic.performConversion(driver, fromUnit, toUnit, inputValue, expectedValue);
        logTestResult(isTestSuccessful, testCaseName);
        pause(5000); // 5-second delay after each test case
    }

    private static void logTestResult(boolean isTestSuccessful, String testCaseName) {
        if (isTestSuccessful) {
            System.out.println(testCaseName + " - Successful Test");
            System.out.println("----------------------------------");
        } else {
            System.out.println(testCaseName + " - Test Failed");
            System.out.println("----------------------------------");
        }
    }

    private static void pause(int milliseconds) {
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
