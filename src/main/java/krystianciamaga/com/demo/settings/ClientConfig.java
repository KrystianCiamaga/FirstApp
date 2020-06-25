package krystianciamaga.com.demo.settings;


import org.elasticsearch.client.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import java.time.Duration;
import java.time.format.DateTimeFormatter;

@Configuration
public class ClientConfiguration {

    @Autowired
    BaseSettingsConfiguration baseSettingsConfiguration;




    public ClientConfiguration clientConfiguration(){

        ClientConfiguration clientConfiguration = ClientConfiguration.builder()
                .connectedTo("localhost:9200", "localhost:9291")
                .build();

        return clientConfiguration;

    }




}
