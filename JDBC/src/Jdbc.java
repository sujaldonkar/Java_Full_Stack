import java.sql.*;
public class Jdbc{
    public static void main(String[] args) {
        // try{
        //     Class.forName("org.postgresql.Driver");
        //     System.out.println("Driver loaded successfully");
        // }
        // catch(ClassNotFoundException e){
        //     System.out.println("Driver not found: "+e.getMessage());
        // }


        String url="jdbc:postgresql://localhost:5432/studentdb";
        String username="postgres";
        String password="root";
        try{
        Connection con=DriverManager.getConnection(url,username,password);
        System.out.println("Connected Successfully");

        Statement stmt=con.createStatement();
        ResultSet rs=stmt.executeQuery("SELECT * FROM student");
        
        
        while(rs.next()){
            // System.out.println(rs.getInt("id"));
            // System.out.println(rs.getString("name"));
            System.out.println(rs.getInt("id")+" "+rs.getString("name"));
        }


        // int row=stmt.executeUpdate("insert into student values(10,'Hello')");
        // System.out.println("Row inserted: "+row); // Execute Query for insert, update, delete returns number of rows affected

        // rs.next();
        // String name=rs.getString(1);
        // System.out.println(name);


        rs.close();
        stmt.close();
        con.close();


        }
        
        catch(SQLException e){
            System.out.println("Connection failed: "+e.getMessage());
        }
    }
}