import java.io.InputStream;
import java.io.Reader;
import java.math.BigDecimal;
import java.net.URL;
import java.sql.*;
import java.util.Calendar;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://localhost/" + "database";
        Connection conn = DriverManager.getConnection(url, "root", "root");
        System.out.println("Connection success!");

        //to create the query
        Statement stm = conn.createStatement();
        ResultSet rs = stm.executeQuery("SELECT * FROM new_table");
        while (rs.next()) {
            String name = rs.getString("name");
            System.out.println(name);

            String address = rs.getString("address");
            System.out.println(address);
        }

        //prepared statement
        PreparedStatement preparedStatement = conn.prepareStatement("SELECT * FROM new_table WHERE id=? AND address=? ");
        preparedStatement.setInt(1,10);
        preparedStatement.setString(2,"test");
        ResultSet resultSet = preparedStatement.executeQuery();
        while (rs.next()) {
            String name = rs.getString("name");
            System.out.println(name);
        }
    }
}
