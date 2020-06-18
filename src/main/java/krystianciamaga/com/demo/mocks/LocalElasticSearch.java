package krystianciamaga.com.demo.mocks;






import lombok.NoArgsConstructor;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.env.Environment;
import org.elasticsearch.node.InternalSettingsPreparer;
import org.elasticsearch.node.Node;
import org.elasticsearch.node.NodeValidationException;
import org.elasticsearch.plugins.Plugin;
import org.elasticsearch.transport.Netty4Plugin;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;


@NoArgsConstructor
public class LocalElasticSearch {



<<<<<<< HEAD
    public static void start() {
        Settings settings = Settings.builder()
                .put("http.host", "localhost")
                .put("discovery.type", "single-node")
                .put("cluster.name", "test-cluster")
                .put("node.name", "test-node")
                .put(Environment.PATH_HOME_SETTING.getKey(), "/tmp").build();
=======


    public void start() throws NodeValidationException {


        Settings settings = Settings.builder().put("cluster.name", "elasticsearch")
                .put("path.home","/usr/local/etc/elasticsearch/")
                .build();
>>>>>>> parent of 961f7a2... .

        Node node = new PluginConfigurableNode(settings, Collections.singletonList(Netty4Plugin.class));

        try {
            node.start();
        } catch (NodeValidationException e) {
            e.printStackTrace();
        }

<<<<<<< HEAD
        //SpringApplication.run(DemoApplication.class, args);
    }
=======
        Environment environment = new Environment(settings, Paths.get("/usr/local/etc/elasticsearch/"));

        Node node = new Node(environment);
        node.start();
>>>>>>> parent of 961f7a2... .

    private static class PluginConfigurableNode extends Node {

        public PluginConfigurableNode(Settings settings, Collection<Class<? extends Plugin>> plugins) {
            super(InternalSettingsPreparer.prepareEnvironment(settings, new HashMap<>(), null, null), plugins, false);
        }
    }




}
