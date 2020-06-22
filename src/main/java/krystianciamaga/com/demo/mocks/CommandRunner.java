package krystianciamaga.com.demo.mocks;

import krystianciamaga.com.demo.DemoApplication;
import krystianciamaga.com.demo.entity.Asset;
import krystianciamaga.com.demo.repository.AssetRepository;
import krystianciamaga.com.demo.settings.BaseSetting;
import krystianciamaga.com.demo.settings.BaseSettingsConfiguration;
import krystianciamaga.com.demo.settings.JacksonConfiguration;
import lombok.Getter;
import org.apache.catalina.core.ApplicationContext;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.io.File;
import java.util.Optional;

@Service
@Getter
public  class CommandRunner implements CommandLineRunner {



    @Value("${path}")
    public  String path;

    @Value("${environment:production}")
    public static  String environment;


    @Autowired
    BaseSettingsConfiguration baseSettingsConfiguration;





    @Override
    public void run(String... args) throws Exception {





        if(environment.equals("production")) {

            baseSettingsConfiguration.loadSettingsFromFile(path);


        }




       }

    }


