package uz.pdp.projection.repo;

import org.springframework.boot.autoconfigure.ssl.JksSslBundleProperties;
import org.springframework.data.jpa.repository.JpaRepository;
import uz.pdp.projection.entity.Store;


public interface StoreRepo extends JpaRepository<Store,Long> {
}
