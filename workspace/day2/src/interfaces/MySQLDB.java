package interfaces;

public class MySQLDB implements DBDriver{

	@Override
	public String getDriverInfo() {
		
		return "MySQL Driver";
	}

	@Override
	public String getDriverVersion() {
		
		return "Connector J 5.1.22";
	}

	@Override
	public String getDBInfo() {
		
		return "MySQL DB";
	}

	

}
