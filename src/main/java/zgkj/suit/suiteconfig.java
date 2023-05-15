package zgkj.suit;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class suiteconfig {

    @BeforeSuite
    public void bs(){
        System.out.println("BeforeSuite");
    }
    @AfterSuite
    public void as(){
        System.out.println("AfterSuite");
    }

    @BeforeTest
    public void bt(){
        System.out.println("BeforeTest");
    }

    @AfterTest
    public void at(){
        System.out.println("AfterTest");
    }
}
