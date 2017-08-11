import java.sql.*;
class  UsingType4
{
	public static void main(String[] args) throws Exception
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");

		System.out.println("Driver is loaded...");

		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","adp","welcome1");
		System.out.println(con.getClass().getName());
	}
}
