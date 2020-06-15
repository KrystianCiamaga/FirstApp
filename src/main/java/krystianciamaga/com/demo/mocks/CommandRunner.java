package krystianciamaga.com.demo.mocks;

import krystianciamaga.com.demo.settings.BaseSettings;
import krystianciamaga.com.demo.settings.JacksonConfiguration;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

import java.io.File;
import java.util.Optional;

@Service
@Getter
public  class CommandRunner implements CommandLineRunner {


    @Value("${path}")
    public  String path;



    @Autowired
    BaseSettings baseSettings;


    @Autowired
    JacksonConfiguration jacksonConfiguration;


    @Override
    public void run(String... args) throws Exception {



        BaseSettings baseSettings1 = jacksonConfiguration.objectMapper().readValue(new File(path),BaseSettings.class);

        baseSettings.setPort(baseSettings1.getPort());

       }

    }


