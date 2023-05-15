package zgkj;

import org.testng.annotations.*;




//运用范围：BeforeGroup > BeforeSuit > BeforeClass > BeforeMethod
public class BasicAnnotation {
    //最基本的testng注解，用来把方法标记为测试的一部分
    @Test
    public void testCase1(){
        System.out.println("test1方法执行");
    }

    @Test
    public void testCase2(){
        System.out.println("test2方法执行");
    }


    //这代表该方法在每个测试方法之前都会运行一次
    @BeforeMethod
    public void bm(){
        System.out.println("beforemethod");
    }

    //这代表该方法在每个测试方法完成之都会运行一次
    @AfterMethod
    public void am(){
        System.out.println("aftermethod");
    }

    //将会在当前类最后一个执行
    @AfterClass
    public void ac(){
        System.out.println("afterclass");
    }


    //将会在当前类第一个执行
    @BeforeClass
    public void bc(){
        System.out.println("beforeclass");
    }

    @BeforeSuite
    public void bs(){
        System.out.println("beforesuite");
    }

    @AfterSuite
    public void as(){
        System.out.println("aftersuite");
    }

    @BeforeGroups
    public void bg(){
        System.out.println("beforegroups");
    }

    @AfterGroups
    public void ag(){
        System.out.println("aftergroups");
    }

}
