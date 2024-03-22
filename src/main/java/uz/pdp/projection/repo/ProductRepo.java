package uz.pdp.projection.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uz.pdp.projection.entity.Product;

@Repository
public interface ProductRepo extends JpaRepository<Product, Long> {

}
