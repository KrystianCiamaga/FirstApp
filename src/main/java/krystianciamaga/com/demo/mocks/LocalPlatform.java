
package krystianciamaga.com.demo.mocks;


import krystianciamaga.com.demo.DemoApplication;
import org.elasticsearch.node.NodeValidationException;
import org.springframework.boot.SpringApplication;

import java.util.Collections;

public class LocalPlatform {



        public static void main(String[] args) throws NodeValidationException {


            LocalElasticSearch localElasticSearch = new LocalElasticSearch();

            LocalDatabases localDatabases = new LocalDatabases(localElasticSearch);
            localDatabases.start();

            SpringApplication springApplication = new SpringApplication(DemoApplication.class);

            springApplication.setDefaultProperties(Collections.singletonMap("server.port",5555));

            springApplication.run(args);



        }


    }





