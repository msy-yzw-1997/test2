import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbc_youhua {
    public static void main(String[] args) {
        Connection conn = null;
        Statement sta = null;

        try {
            conn = DriverManager.getConnection( "jdbc:mysql:///db1","root","159874" );
            sta = conn.createStatement();
            String sql="alter student set score =100 where age=88";
            int i = sta.executeUpdate( sql );
            //executeUpdate方法的返回值对update、delete、insert into语句生效时，会返回sql语句的生效数量i
            //但是使用的是create、alter、drop时，返回值无意义

            System.out.println(i);

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }finally {
            if (sta!=null){
                try {
                    sta.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
            if(conn!=null){
                try {
                    conn.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
        }
    }
}
