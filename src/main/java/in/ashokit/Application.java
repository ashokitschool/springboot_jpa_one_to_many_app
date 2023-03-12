package in.ashokit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.ashokit.service.EmpAddrService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);

		EmpAddrService service = context.getBean(EmpAddrService.class);

		// service.saveEmpWithAddr();
		// service.getEmp(1);
		// service.deleteEmp(1);

		// service.getAddr(1);
		// service.deleteAddress(2);
	}
}
