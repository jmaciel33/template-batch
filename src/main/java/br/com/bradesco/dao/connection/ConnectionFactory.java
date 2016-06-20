package br.com.bradesco.dao.connection;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import br.com.bradesco.utils.ReadProperties;
/**
 * Connection Factory
 * @author Maciel
 *
 */
public class ConnectionFactory {
	public Connection getConnection() throws IOException {
		try {
			ReadProperties readProperties = new ReadProperties();
			Properties prop = readProperties.getProp("./properties/database.properties");
			String driver = prop.getProperty("database.driverClassName");
			String url = prop.getProperty("database.url");
			String user = prop.getProperty("database.username");
			String password = prop.getProperty("database.password");
			
			return DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
}
