package testcases;

import common.BaseTest;

public class TestCases extends BaseTest {
    public String url;
    private String username;
    private String password;

    public TestCases(String url, String username, String password){
        super();
        this.url = url;
        this.username= username;
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public String getUsername() {
        return username;
    }

    public void login() {
        this.createDriver();
        System.out.println("Access url:"+this.url);
        System.out.println("Input username:"+ this.getUsername());
        System.out.println("Input password:"+this.getPassword());
        System.out.println("Click on button Login");
        this.closeDriver();
    }
    public void addCategory(){
    this.createDriver();

        System.out.println("Expand the Products option on menu bar ");
        System.out.println("Click on Category on menu bar");
        System.out.println("Click on button Add New category");
        System.out.println("Input the category info");
        System.out.println("Click on button Save  at the bottom of page");
    this.closeDriver();
    }

    public static void main(String[] args) {
        TestCases tc = new TestCases("https://cms.anhtester.com/login","admin@example.com","123456");
        System.out.println("TestCase Login------------------------------------------");
        tc.login();
        System.out.println("TestCase Add category-------------------------------------------------------");
        tc.addCategory();

    }


}
