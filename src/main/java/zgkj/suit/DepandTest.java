package zgkj.suit;

import org.testng.annotations.Test;

public class DepandTest {


    @Test
    public void test1(){
        System.out.println("test1 run");
        throw new RuntimeException();
    }


    @Test(dependsOnMethods = {"test1"})
    public void test2(){
        System.out.println("test2 run");
    }

    //运行test2时，会自动运行test1
    //当test1运行报错时，test2将会被ignore
}
