package SpringDataJpa.Repository;

import java.io.Serializable;

import javax.sql.rowset.serial.SerialException;

import org.springframework.boot.autoconfigure.amqp.RabbitConnectionDetails.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Serializable> {

}
