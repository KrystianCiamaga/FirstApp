package krystianciamaga.com.demo.mocks;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.elasticsearch.env.Environment;
import org.elasticsearch.node.Node;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.node.NodeValidationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.nio.file.Path;




public class LocalDatabases {

    LocalElasticSearch localElasticSearch;

    public LocalDatabases(LocalElasticSearch localElasticSearch) {
        this.localElasticSearch = localElasticSearch;
    }

    public void start() throws NodeValidationException {

        localElasticSearch.start();


    }


}
