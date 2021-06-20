package repo;

import model.Province;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IProvinceRepo extends CrudRepository<Province,Long> {
    void delete(Long id);
}
