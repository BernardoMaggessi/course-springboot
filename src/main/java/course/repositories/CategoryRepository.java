package course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{
	

}
