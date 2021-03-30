package domain.db;

import domain.model.Box;
import org.springframework.data.repository.CrudRepository;

public interface BoxRepository extends CrudRepository<Box, Long> {
}
