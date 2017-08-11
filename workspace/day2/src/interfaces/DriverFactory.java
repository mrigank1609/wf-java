package interfaces;

public class DriverFactory {

	public static DBDriver getDriver(String db) {
		if (db.equals("oracle")) {
			return new OracleDB();
		} else if (db.equals("mysql")) {
			return new MySQLDB();

		} else if (db.equals("hsql")) {
			return new HSQLDB();

		} else
			return null;
	}
}
