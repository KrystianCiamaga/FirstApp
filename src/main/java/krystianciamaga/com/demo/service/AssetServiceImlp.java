
package krystianciamaga.com.demo.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import krystianciamaga.com.demo.entity.Asset;
import krystianciamaga.com.demo.mocks.EsConfig;
import krystianciamaga.com.demo.repository.AssetRepository;
import krystianciamaga.com.demo.settings.JacksonConfiguration;
import org.elasticsearch.action.admin.indices.create.CreateIndexRequest;
import org.elasticsearch.action.index.IndexRequest;
import org.elasticsearch.client.RequestOptions;
import org.elasticsearch.client.RestHighLevelClient;
import org.elasticsearch.common.xcontent.XContentType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class AssetServiceImlp implements AssetService {


   private final AssetRepository assetRepository;


    @Qualifier("client")
    @Autowired
   RestHighLevelClient restHighLevelClient;

    @Autowired
    JacksonConfiguration jacksonConfiguration;



    @Override
    public Asset addAsset(Asset asset) throws IOException {

        IndexRequest request = new IndexRequest("abstract");

        request.source(jacksonConfiguration.objectMapper().writeValueAsBytes(asset), XContentType.JSON);
        restHighLevelClient.index(request, RequestOptions.DEFAULT);

        //return assetRepository.save(asset);

        return null;

    }




    public AssetServiceImlp(AssetRepository assetRepository) {
        this.assetRepository = assetRepository;
    }


  @Override
    public List<Asset> findAllAssets(int pageNumber, int pageSize) {


        return assetRepository.findAll(PageRequest.of(pageNumber,pageSize)).stream()
                .collect(Collectors.toList());
    }

    @Override
    public Asset findAssetById(String id) {

        Optional<Asset> asset =assetRepository.findById(id);

        return asset.orElse(null);


    }



    @Override
    public Asset deleteAsset(String id) {

        Optional<Asset> asset =assetRepository.findById(id);

        assetRepository.deleteById(id);

        return asset.orElse(null);

    }

    @Override
    public Asset updateAssetById(Asset asset,String id) {
        Optional<Asset> newAasset = Optional.ofNullable(assetRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Asset not found")));


        assetRepository.save(newAasset.get());

        return newAasset.get();

    }
}
