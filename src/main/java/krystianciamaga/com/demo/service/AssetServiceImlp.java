package krystianciamaga.com.demo.service;

import krystianciamaga.com.demo.entity.Asset;
import krystianciamaga.com.demo.repository.AssetRepository;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class AssetServiceImlp implements AssetService {


   private final AssetRepository assetRepository;


    public AssetServiceImlp(AssetRepository assetRepository) {
        this.assetRepository = assetRepository;
    }

    @Override
    public List<Asset> findAllAssets(int pageNumber, int pageSize) {


        return assetRepository.findAll(PageRequest.of(pageNumber,pageSize)).stream()
                .collect(Collectors.toList());
    }

    @Override
    public Asset findAssetById(String key) {

        Optional<Asset> asset = Optional.ofNullable(assetRepository.findById(key)
                .orElseThrow(()->new RuntimeException("Asset not found")));

        return asset.get();
    }

    @Override
    public Asset addAsset(Asset asset) {

        return assetRepository.save(asset);

    }

    @Override
    public Asset deleteAsset(String id) {

        Optional<Asset> asset = Optional.ofNullable(assetRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Asset not found")));

        assetRepository.deleteById(id);

        return asset.get();

    }

    @Override
    public Asset updateAssetById(Asset asset,String id) {
        Optional<Asset> newAasset = Optional.ofNullable(assetRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Asset not found")));


        assetRepository.save(newAasset.get());

        return newAasset.get();

    }
}
