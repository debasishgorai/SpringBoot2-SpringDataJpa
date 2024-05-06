package SpringDataJpa.Repository;


import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import SpringDataJpa.entity.Employee;
@Repository
public interface EmppRepository extends JpaRepository<Employee, Serializable>{


}
              