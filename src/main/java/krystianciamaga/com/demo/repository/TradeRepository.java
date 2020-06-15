package krystianciamaga.com.demo.repository;

import krystianciamaga.com.demo.entity.Asset;
import krystianciamaga.com.demo.entity.Trade;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TradeRepository extends ElasticsearchRepository<Trade,String> {
}
