package associationsample;
import java.sql.*;
public class DBconnection {


    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");//registering diver class
        //fornameis the mthod in class
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase", "root", "root1234");
        //establshng connection
        Statement statement = connection.createStatement();
        //     statement.executeUpdate("create databasesoumya")
        //int i=    statement.executeUpdate("insert into employee values('11','riya')");
        //connection.close();
        CallableStatement cs = connection.prepareCall("{call getdept(?,?)}");
        cs.setInt(1, 1);
        // cs.setString(2,"ananthu");
        cs.registerOutParameter(2, Types.INTEGER);
        cs.execute();
        int x = cs.getInt(2);
        //or
        int y = cs.getInt("total");
        System.out.println(y);
        //  ResultSet rs1 =cs.getResultSet();
        //while (rs1.next()){
        //  System.out.println(rs1.getInt("id")+" "+rs1.getString("name"));


        connection.close();

    }
}







