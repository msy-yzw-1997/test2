import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JDBC_demo1 {

    public static void main(String[] args) throws Exception {
//        Class.forName( "com.mysql.jdbc.Driver" );
        Connection connection = DriverManager.getConnection( "jdbc:mysql://localhost:3306/db1" , "root" , "159874" );
        //url指定连接的路径，语法：jdbc:mysql://ip地址（域名）：端口号/数据库名称，当使用本机localhost:3306时，可以省略
        String sql = "update student set age=88 where id=2";
        Statement statement = connection.createStatement();
        //Connection：数据库连接对象，存在以下方法（可调用）
        //1,获取执行sql的对象：
        // Statement createStatemnt(),
        // PreparedStatement prepareStatement(String sql)：
        /*
        * PreparedStatement:执行sql对象
        *1，可以解决sql注入问题：在拼接sql时，有些sql的特殊关键字参与字符串的拼接，会造成安全问题
        *使用预编译的sql解决：参数使用？作为占位符
        *2，步骤：
        *（1）导入驱动jar包
        *（2）注册驱动
        *（3）获取数据库连接对象
        *（4）定义sql
        * select * from user where username =? and password=?;
        *（5）获取执行sql语句的对象 PreparedStatement Connection.prepareStatement(String sql)
        *（6）给？赋值：
        *   使用setXxx（参数位置，参数）
        *（7）执行sql，接受返回结果，不需要传递sql语句
        *（8）处理结果
        *（9）释放资源
        *
        *
        * */

        //2,管理事务（方法都没有返回值）：
        //开启事务：setAutoCommit(boolean autoCommit):调用该方法设置参数为fales，即开启事务。
        //提交事务：commit（）
        //回滚事务：rollback（）

        int i = statement.executeUpdate( sql );
        //Statement:执行sql对象
        //方法：
        /*
        *1,boolean execute(String sql):可以执行任意的sql
        *2,int executeUpdate(String sql):可以执行表中数据的增删改（insert、update、delete）【返回值是int，代表影响的数据条数】、【以及表和库的操作（create、alter、drop）语句，但是该语句执行后没有返回值】
        *3,ResultSet executeQuery(String sql):可以执行select语句
        * */
        //ResultSet:结果集对象
        /*
        *1，next()：游标向下移动一行
        *2，getXxx（参数）：获取数据
        *   Xxx：代表数据类型 如：int getInt(),String getString()
        *
        *
        * */
        System.out.println(i);
        statement.close();
        connection.close();

    }
}
