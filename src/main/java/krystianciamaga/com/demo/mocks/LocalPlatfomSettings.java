package krystianciamaga.com.demo.mocks;


import krystianciamaga.com.demo.settings.BaseSetting;
import lombok.NoArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.Properties;



public class LocalPlatfomSettings {



    public static Properties setLocalProperties(){

        Properties properties= new Properties();

        properties.setProperty("server.port","6565");

        return properties;

    }




}
