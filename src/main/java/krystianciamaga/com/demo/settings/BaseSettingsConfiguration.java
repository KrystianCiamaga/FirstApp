package krystianciamaga.com.demo.settings;


import com.fasterxml.jackson.databind.cfg.BaseSettings;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.websocket.server.ServerEndpoint;
import java.io.File;
import java.io.IOException;
import java.util.Properties;


@Component
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class BaseSettingsConfiguration {


    @Autowired
    JacksonConfiguration jacksonConfiguration;



    private BaseSetting baseSettings;


    public void loadSettingsFromFile(String path) throws IOException {
        baseSettings = jacksonConfiguration.objectMapper().readValue(new File(path), BaseSetting.class);

    }


    public Properties setApplicationProperties(){

        Properties properties = new Properties();
        properties.setProperty("server.port",String.valueOf(baseSettings.getPort()));

        return properties;

    }


}
