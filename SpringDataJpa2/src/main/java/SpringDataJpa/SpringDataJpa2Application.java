package SpringDataJpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import SpringDataJpa.Repository.EmppRepository;
import SpringDataJpa.entity.Employee;

@SpringBootApplication
public class SpringDataJpa2Application {

	public static void main(String[] args) {
		 ConfigurableApplicationContext context=	SpringApplication.run(SpringDataJpa2Application.class, args);
		  EmppRepository  emppRepository =context.getBean(EmppRepository.class);
		  System.out.println(emppRepository.getClass().getName());
		  
		  Employee emp=new  Employee();
		  
		  emp.setEmpid(1);
		  emp.setEmpName("ram");
		  emp.setEmpSal(100);
		  
		  emppRepository.save(emp);
		  System.out.println("Successfully saved ");
	}

}
