package dbTutorial;

import java.sql.*;

public class JdbcSQLiteConnection {
    public static void main(String[] args) {
        try {
            // setup
            Class.forName("org.sqlite.JDBC");
            String dbURL = "jdbc:sqlite:bookstore.db";
            Connection conn = DriverManager.getConnection(dbURL);
            if (conn != null) {
                System.out.println("Connected to the database....");
                // display database information
                DatabaseMetaData dm = (DatabaseMetaData) conn.getMetaData();
                System.out.println("Driver name: " + dm.getDriverName());
                System.out.println("Product name: " + dm.getDatabaseProductName());
                System.out.println("----- Data in Book table -----");

                String query = "Select * from book";
                Statement statement = conn.createStatement();
                ResultSet resultSet = statement.executeQuery(query);

                while (resultSet.next()) {
                    int id = resultSet.getInt(1);
                    String name = resultSet.getString(2);
                    double price = resultSet.getDouble(3);
                    System.out.println("id:"+id+" name:"+name+" price: "+price);
                }
                // close connection
                conn.close();
            }
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

            }
