package common;

public class BaseTest {
    public void createDriver(){

        System.out.println("Browser:"+Constants.browser);
        System.out.println("Report:"+Constants.report);
        System.out.println("Headless:"+Constants.headless);
        System.out.println("Creating driver...");
    }
    public void closeDriver(){
                System.out.println("Closing driver...");
        System.out.println("Closed browser:" + Constants.browser);

    }
}
