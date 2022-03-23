package course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{
	

}
