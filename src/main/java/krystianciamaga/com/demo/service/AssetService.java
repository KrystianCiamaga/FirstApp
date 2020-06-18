package krystianciamaga.com.demo.service;


import krystianciamaga.com.demo.entity.Asset;

import java.io.IOException;
import java.util.List;
import java.util.Optional;


public interface AssetService {


    List<Asset> findAllAssets(int pageNumber, int pageSize);

    Asset findAssetById(String id);

    Asset addAsset(Asset asset) throws IOException;

    Asset deleteAsset(String id);

    Asset updateAssetById(Asset assetDto, String id);

}

