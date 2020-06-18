package krystianciamaga.com.demo.mocks;


import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.env.Environment;
import org.elasticsearch.node.Node;
import org.elasticsearch.node.NodeValidationException;
import org.springframework.stereotype.Service;

import java.nio.file.Path;
import java.nio.file.Paths;


public class LocalElasticSearch {





    public void start() throws NodeValidationException {


        Settings settings = Settings.builder()
                .put("path.home","/usr/local/etc/elasticsearch/")
                .build();



        Node node = new Node(settings);
        node.start();


    }




}
