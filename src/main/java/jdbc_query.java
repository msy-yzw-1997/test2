import java.sql.*;

public class jdbc_query {
    public static void main(String[] args) {
        //executeQuery,执行select语句，返回值是ResultSet对象
        Connection conn = null;
        Statement sta = null;
        ResultSet resultSet=null;
        try {
            conn = DriverManager.getConnection( "jdbc:mysql:///db1","root","159874" );
            sta = conn.createStatement();
            String sql="select * from student";
            resultSet = sta.executeQuery( sql );



            while (resultSet.next()){
                int a = resultSet.getInt( 1 );
                String b = resultSet.getString( 2 );
                int c = resultSet.getInt( 3 );
                double d = resultSet.getDouble( 4 );
//                Time f = resultSet.getTime( 6 );
                String f = resultSet.getString(6);

//                String[] s = f.split( " " );

                
                System.out.println(a+","+b+","+c+","+d+","+f);
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }finally {


            if(resultSet!=null){
                try {
                    resultSet.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }


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
