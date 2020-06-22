
package krystianciamaga.com.demo.mocks;


import krystianciamaga.com.demo.DemoApplication;
import lombok.NoArgsConstructor;
import org.elasticsearch.node.NodeValidationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.ServletContextInitializer;
import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Service;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import java.util.Properties;



public class LocalPlatform {



        public static void main(String[] args) throws NodeValidationException {



            LocalDatabases localDatabases = new LocalDatabases();
            localDatabases.start();

            CommandRunner.environment="local";


            SpringApplication springApplication = new SpringApplication(DemoApplication.class);


            Properties localProperties = LocalPlatfomSettings.setLocalProperties();


            springApplication.setDefaultProperties(localProperties);


            springApplication.run();



        }


    }





