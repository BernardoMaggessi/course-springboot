package course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
	

}
