package uz.pdp.projection.dto;

import org.springframework.beans.factory.annotation.Value;

import java.util.List;

public interface CustomerDtoProjection {
   @Value("#{target.id}")
   Long getUserId();
//   String getFirstname();
//   String getLastname();
   @Value(" #{target.firstname + ' ' + target.lastname } ")
   String getFullName();
   String getUsername();
   String email();
   String getPassword();
   List<ProductDtoProjection> getProducts();
}
