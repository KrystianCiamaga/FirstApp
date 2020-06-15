package krystianciamaga.com.demo.repository;

import krystianciamaga.com.demo.entity.Asset;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;




@Repository
public interface AssetRepository extends ElasticsearchRepository<Asset,String> {


}
