package krystianciamaga.com.demo.mocks;

import krystianciamaga.com.demo.DemoApplication;

import krystianciamaga.com.demo.settings.BaseSettingsConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.stereotype.Component;

import java.util.Collections;

@Component
public class RunClass {




    public static void main(String[] args) {


        SpringApplication springApplication = new SpringApplication(DemoApplication.class);

        springApplication.setDefaultProperties(Collections.singletonMap("server.port",5555));

        springApplication.run(args);



    }

}
