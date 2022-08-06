
public class OracleDal implements IDal{

String connectionString;
	
	public String getConnectionString() {
		return connectionString;
	}

	public void setConnectionString(String connectionString) {
		this.connectionString = connectionString;
	}
	
	@Override
	public void add() {
		System.out.println("Oracle bağlandı");	
		System.out.println(this.connectionString);

		
	}

}
