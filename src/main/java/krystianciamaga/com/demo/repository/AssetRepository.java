package krystianciamaga.com.demo.repository;

import krystianciamaga.com.demo.entity.Asset;
import org.springframework.data.domain.Pageable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;




@Repository
public interface AssetRepository extends JpaRepository<Asset,String> {


}
