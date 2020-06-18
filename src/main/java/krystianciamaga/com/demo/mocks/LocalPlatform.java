
package krystianciamaga.com.demo.mocks;


import krystianciamaga.com.demo.DemoApplication;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.elasticsearch.node.NodeValidationException;
import org.springframework.boot.SpringApplication;

import java.util.Collections;


@NoArgsConstructor
public class LocalPlatform {



        public static void main(String[] args) throws NodeValidationException {


            LocalElasticSearch.start();



            SpringApplication springApplication = new SpringApplication(DemoApplication.class);



            springApplication.run();



        }


    }





