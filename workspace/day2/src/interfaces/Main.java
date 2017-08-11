package interfaces;

public class Main {

	public static void main(String[] args) {
		DBDriver dr=DriverFactory.getDriver("mysql");
		
		System.out.println(dr.getDBInfo()+" "+dr.getDriverVersion());

	}

}
