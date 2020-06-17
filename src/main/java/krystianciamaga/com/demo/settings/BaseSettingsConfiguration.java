package krystianciamaga.com.demo.settings;


import com.fasterxml.jackson.databind.cfg.BaseSettings;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.websocket.server.ServerEndpoint;
import java.io.File;



@Component
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class BaseSettingsConfiguration {




    private BaseSetting baseSettings;


    public void setBaseSettings(BaseSetting baseSettings){
        this.baseSettings=baseSettings;
    }

}
