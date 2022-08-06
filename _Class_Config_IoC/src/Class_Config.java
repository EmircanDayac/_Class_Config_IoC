import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;


@Configuration
@ComponentScan("_Class_Config_Ioc")
@PropertySource("classpath:values.properties")
public class Class_Config {
	@Bean
	public IDal database() {
		return new MySqlDal();
		
	}
	@Bean
	public ICustomerService service() {
		return new CustomerManager(database());
		
	}
}
