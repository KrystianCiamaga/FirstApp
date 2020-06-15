package krystianciamaga.com.demo.mocks;

import krystianciamaga.com.demo.DemoApplication;
import krystianciamaga.com.demo.settings.BaseSettings;
import org.springframework.boot.SpringApplication;
import org.springframework.stereotype.Component;

import java.util.Collections;

@Component
public class RunClass {


    private static BaseSettings baseSettings;

    public RunClass(BaseSettings baseSettings) {
        this.baseSettings = baseSettings;
    }



    public static void main(String[] args) {


        SpringApplication springApplication = new SpringApplication(DemoApplication.class);

        springApplication.setDefaultProperties(Collections.singletonMap("server.port",5555));

        springApplication.run(args);



    }

}
