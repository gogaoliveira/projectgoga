package douglasoliveiraprojectgoga.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import douglasoliveiraprojectgoga.entities.Product;
import douglasoliveiraprojectgoga.repositories.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private ProductRepository repository;
	
	public List<Product> findAll(){
		return repository.findAll();
	}
	
	public Product findById(long id) {
		Optional<Product> obj = repository.findById(id);
		return obj.get();
	}
	
	public Product insert(Product obj) {
		return repository.save(obj);
	}
	
	public void delete(long id) {
		repository.deleteById(id);
	}
	
	public Product update(Long id, Product obj) {
		Product entity = repository.getOne(id);
		updateData(entity, obj);
		return repository.save(entity);
	}

	private void updateData(Product entity, Product obj) {
		entity.setName(obj.getName());
		entity.setDescription(obj.getDescription());
		entity.setPrice(obj.getPrice());
	}
}
