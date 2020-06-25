package krystianciamaga.com.demo.mocks;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Configuration
@Profile("local")
public class LocalElasticSettings {

    @Value("${elasticsearch.host}")
    private String databaseHost;
    private int databasePort;

}