package SpringDataJpa.Repository;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import SpringDataJpa.entity.Employee;
@Repository
public interface EmppRepository extends CrudRepository<Employee, Serializable>{

}
