package interfaces;

public class OracleDB implements DBDriver{

	@Override
	public String getDriverInfo() {
		
		return "Oracle Driver";
	}

	@Override
	public String getDriverVersion() {
		
		return "Oracle XE 11g";
	}

	@Override
	public String getDBInfo() {
		
		return "Oracle DB";
	}

	

}
