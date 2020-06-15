package krystianciamaga.com.demo.mocks;

import krystianciamaga.com.demo.settings.BaseSetting;
import krystianciamaga.com.demo.settings.BaseSettingsConfiguration;
import krystianciamaga.com.demo.settings.JacksonConfiguration;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.io.File;
import java.util.Optional;

@Service
@Getter
public  class CommandRunner implements CommandLineRunner {


    @Value("${path}")
    public  String path;



    @Autowired
    BaseSettingsConfiguration baseSettingsConfiguration;


    @Autowired
    JacksonConfiguration jacksonConfiguration;


    @Override
    public void run(String... args) throws Exception {




        BaseSetting baseSettings1 = jacksonConfiguration.objectMapper().readValue(new File(path),BaseSetting.class);

        baseSettingsConfiguration.setBaseSettings(baseSettings1);








       }

    }


