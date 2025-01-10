package consultancy;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;

public class JDBC {
    public static void main(String[] args) {
        try{
            Connection connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/consultancy", 
                "root", 
                "1234");
    
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery("SELECT * FROM USERS");
    
                while(resultSet.next()){
                    System.out.println(resultSet.getString("username"));
                    System.out.println(resultSet.getString("pass_word"));
    
                }
        }
        catch(SQLException e){

        }
        
    }
}
