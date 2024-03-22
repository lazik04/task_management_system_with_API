package uz.pdp.projection.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import uz.pdp.projection.dto.CustomerClassDtoProjection;
import uz.pdp.projection.entity.Customer;

@Repository
public interface CustomerRepo extends JpaRepository<Customer, Long> {
    @Query(value = "select c from Customer c where c.email=?1")
    CustomerClassDtoProjection findByEmail(String email);
}