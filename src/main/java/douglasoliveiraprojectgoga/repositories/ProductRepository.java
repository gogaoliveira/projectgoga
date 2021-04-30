package douglasoliveiraprojectgoga.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import douglasoliveiraprojectgoga.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
