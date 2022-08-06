import org.springframework.beans.factory.annotation.Value;

public class MySqlDal implements IDal {

	@Value("${database.connectionString}")
	String connectionString;
	
	public String getConnectionString() {
		return connectionString;
	}

	public void setConnectionString(String connectionString) {
		this.connectionString = connectionString;
	}

	@Override
	public void add() {
System.out.println("Mysql bağlandı");		
System.out.println(this.connectionString);
	}

}
