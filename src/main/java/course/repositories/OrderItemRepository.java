package course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{
	

}
