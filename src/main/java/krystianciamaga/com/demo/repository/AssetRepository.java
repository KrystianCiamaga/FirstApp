
package krystianciamaga.com.demo.repository;

import krystianciamaga.com.demo.entity.Asset;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;





public interface AssetRepository extends ElasticsearchRepository<Asset,String> {


}

