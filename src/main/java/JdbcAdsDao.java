import com.mysql.cj.jdbc.Driver;

import java.sql.*;
import java.util.List;

public class JdbcAdsDao implements Ads {
    private Connection connection;

    public JdbcAdsDao() throws SQLException {
        Driver driver = new Driver();
        DriverManager.registerDriver(driver);

        // mysql -u root -p
        // use database adlister_db;
        connection = DriverManager.getConnection(
                "jdbc:mysql://localhost/adlister_db",
                "root",
                "Codeup1!"
        );
    }

    @Override
    public List<Ad> all() {
        String sql = "SELECT * FROM ads";
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String title = resultSet.getString("title");
                String description = resultSet.getString("description");

                Ad ad = new Ad(id, title, description);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
