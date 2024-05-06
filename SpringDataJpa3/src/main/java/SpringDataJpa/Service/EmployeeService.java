package SpringDataJpa.Service;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.amqp.RabbitConnectionDetails.Address;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import SpringDataJpa.Repository.AddressRepository;
import SpringDataJpa.Repository.EmppRepository;
import SpringDataJpa.entity.Employee;
@Service
public class EmployeeService {

	@Autowired
	private EmppRepository empRepo;
	@Autowired
	private AddressRepository addrRepo;
	public void saveData() {
		Employee emp=new Employee();
		emp.setEmpid(201);
		emp.setEmpName("Akash");
		emp.setEmpSal(2500.00);
		
		
		empRepo.save(emp);
		Address add= new Addre
	}
	
}
