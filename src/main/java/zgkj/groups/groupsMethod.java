package zgkj.groups;

import org.testng.annotations.*;


public class groupsMethod {

    @Test(groups = "client")
    public void test3(){
        System.out.println("client1");
    }


    @Test(groups = "server")
    public void test1(){
        System.out.println("server1");
    }



    @Test(groups = "server")
    public void test2(){
        System.out.println("server2");
    }

    @Test
    public void putong(){
        System.out.println("普通方法");
    }





    @BeforeGroups("server")
    public void server1(){
        System.out.println("执行server组之前需要运行的方法");
    }

    @AfterGroups("server")
    public void server2(){
        System.out.println("执行server组之后需要运行的方法");
    }



    @BeforeMethod
    public void putong1(){
        System.out.println("在普通方法前运行");
    }

    @BeforeClass
    public void lei(){
        System.out.println("当前类执行");
    }

    @BeforeSuite
    public void suit1(){
        System.out.println("当前suite执行");
    }
}

/*
* 【运行结果】：
当前suite执行
当前类执行
在普通方法前运行



普通方法

执行server组之前需要运行的方法
在普通方法前运行

server1

在普通方法前运行

server2

执行server组之后需要运行的方法
在普通方法前运行

client1
*
*
*
*
* */