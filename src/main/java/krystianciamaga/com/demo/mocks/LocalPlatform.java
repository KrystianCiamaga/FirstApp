/*
package krystianciamaga.com.demo.mocks;


<<<<<<< HEAD
import krystianciamaga.com.demo.DemoApplication;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.elasticsearch.node.NodeValidationException;
import org.springframework.boot.SpringApplication;
=======
import krystianciamaga.com.demo.settings.BaseSettings;
import org.springframework.boot.autoconfigure.SpringBootApplication;
>>>>>>> parent of fb3f18a... .



@NoArgsConstructor
public class LocalPlatform {


    private final BaseSettings baseSettings;

<<<<<<< HEAD
        public static void main(String[] args) throws NodeValidationException {


            LocalElasticSearch.start();



            SpringApplication springApplication = new SpringApplication(DemoApplication.class);



            springApplication.run();



        }

=======
    private final RunClass runClass;
>>>>>>> parent of fb3f18a... .

    public LocalPlatform(BaseSettings baseSettings, RunClass runClass) {
        this.baseSettings = baseSettings;
        this.runClass = runClass;
    }
}
*/
