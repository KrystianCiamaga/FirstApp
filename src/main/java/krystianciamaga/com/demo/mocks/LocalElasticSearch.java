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


        Settings settings = Settings.builder().put("cluster.name", "elasticsearch")
                .put("path.home","/usr/local/etc/elasticsearch/")
                .build();



        Environment environment = new Environment(settings, Paths.get("/usr/local/etc/elasticsearch/"));

        Node node = new Node(environment);
        node.start();


    }




}
