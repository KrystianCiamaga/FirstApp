
package krystianciamaga.com.demo.mocks;


import krystianciamaga.com.demo.DemoApplication;
import org.elasticsearch.node.NodeValidationException;
import org.springframework.boot.SpringApplication;

import java.util.Collections;

public class LocalPlatform {



        public static void main(String[] args) throws NodeValidationException {


            LocalElasticSearch.start();



            SpringApplication springApplication = new SpringApplication(DemoApplication.class);



            springApplication.run(args);



        }


    }





