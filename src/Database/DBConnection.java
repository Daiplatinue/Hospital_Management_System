package Database;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBConnection {

    final private Connection cn;

    public DBConnection() throws SQLException {
        cn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/hospitaldb", "root", "");
    }

    public ResultSet getData(String sql) throws SQLException {
        return cn.createStatement().executeQuery(sql);
    }

    public Connection getConnection() throws SQLException {
        return cn;
    }

    public int insertData(String sql) throws SQLException {
        return cn.prepareStatement(sql).executeUpdate();
    }

    public int updateData(String sql) throws SQLException {
        return cn.prepareStatement(sql).executeUpdate();
    }

}
