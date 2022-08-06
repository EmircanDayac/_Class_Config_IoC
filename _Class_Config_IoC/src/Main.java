import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
	try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Class_Config.class)) {
		IDal _dal = context.getBean("database",IDal.class);
		_dal.add();
	} catch (BeansException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	} 
	





	}
	

