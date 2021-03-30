package domain.db;

import domain.model.ProductsForBox;
import org.springframework.data.repository.CrudRepository;

public interface ProductsForRepository extends CrudRepository<ProductsForBox, Long> {
}
