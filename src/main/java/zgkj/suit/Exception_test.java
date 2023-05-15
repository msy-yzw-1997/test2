package zgkj.suit;

import org.testng.annotations.Test;

public class Exception_test {

    @Test(expectedExceptions = RuntimeException.class)
    public void OutputException(){

        System.out.println("异常");
        throw new RuntimeException();
    }
}
