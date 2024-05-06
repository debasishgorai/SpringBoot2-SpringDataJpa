package SpringDataJpa;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.domain.Example;

import SpringDataJpa.Repository.EmppRepository;
import SpringDataJpa.Repository.ProductRepository;
import SpringDataJpa.entity.Employee;
import SpringDataJpa.entity.Product;

@SpringBootApplication
public class SpringDataJpa3Application {

	public static void main(String[] args) {
		 ConfigurableApplicationContext context=	SpringApplication.run(SpringDataJpa3Application.class, args);
		  EmppRepository  emppRepository =context.getBean(EmppRepository.class);
		  System.out.println(emppRepository.getClass().getName());
//		  
//		  Employee e1=new  Employee(20,"Sangiita",5530);
//		  Employee e2=new  Employee(21,"Rekhaa",5000);
//		  Employee e3=new  Employee(213,"Pritii",8150);
//	      List<Employee>emps=	new  ArrayList<>();
//	      emps.add(e1);
//	      emps.add(e2);
//	      emps.add(e3);
//		  emppRepository.saveAll(emps);
		  
	//	 emp.getEmpid(22);
		 // emp.setEmpName("Holicks");
		 // emp.setEmpSal(50);
		  
		 // System.out.println(p);
//		  Optional<Employee>findById=emppRepository.findById(1);
//		  if(findById.isPresent()) {
//			  System.out.println(findById.get());
//		  }
//		  else {
//			  System.out.println("record not Available");
//		  }
//		  
		  List<Serializable>empid=new ArrayList<>();
		  empid.add(20);
		  empid.add(21);
		  empid.add(213);
//		  Iterable<Employee>emps=emppRepository.findAllById(empid);
//		  emps.forEach(emp->{
//			  System.out.println(emp);
//		  });
//		  Iterable<Employee>findAll=emppRepository.findAll();
//		  findAll.forEach(emp->{
//		  System.out.println(emp);});
		  
//		  long count=emppRepository.count();
//		  System.out.println(count);
//		  boolean isavailable=emppRepository.existsById(20);
//		  System.out.println(isavailable);
		  emppRepository.deleteById(21);
		  
		  
		  
		  
		  

		  
		//  emppRepository.save(emp);
		  System.out.println("Successfully saved ");
		  
		  
		  ProductRepository  pRepository =context.getBean(ProductRepository.class);
		  System.out.println(pRepository.getClass().getName());
		  Product p=new Product();
		  p.setPid(35);
		  p.setPname("Holijjcks");
		  p.setPrice(504);
		  
		  System.out.println(p);
		  System.out.println("product is alaso saved");
		  
		  
		  
		  

}}
