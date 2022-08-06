import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan("_Class_Config_Ioc")
public class Class_Config {
	@Bean
	public IDal database() {
		return new MySqlDal();
		
	}

}
