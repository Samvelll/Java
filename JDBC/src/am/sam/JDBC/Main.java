package am.sam.JDBC;

import java.sql.*;

public class Main {

    public static void main(String[] args) {
        String url = "jdbc:sqlserver://DESKTOP-U4FL10E\\MSSQLSERVER;databaseName=my_db;";
        String user = "sam";
        String password = "1999";
        ResultSet result = null;

        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to Microsoft SQL Server");

            /*String sql = "INSERT INTO Students(Name, Surname, age)"
                    + "VALUES('Samvel', 'Khachatryan')";*/
            /*String sql = "DELETE FROM Students WHERE age IS NULL";*/

            //String sql = "INSERT INTO SumOfNumbers(a)" + "VALUES("+k+")";

            String sql = "SELECT a FROM SumOfNumbers WHERE b < 5";

            Statement statement = connection.createStatement();

            result = statement.executeQuery(sql);
            int[] arr = new int[2];
            int i = 0;
            while (result.next()) {
                arr[i] = result.getInt( 1);
                i++;
            }
            for(int j = 0; j < 2; j++) {
                System.out.println(arr[j]);
            }
            //int rows = statement.executeUpdate(sql);

            /*if(rows > 0) {
                System.out.println("Row has been inserted");
            }*/

            connection.close();
        } catch (SQLException e) {
            System.out.println("Oops");
            e.printStackTrace();
        }
    }
}
