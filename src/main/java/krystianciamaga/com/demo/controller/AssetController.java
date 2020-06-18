/*
package krystianciamaga.com.demo.controller;


import krystianciamaga.com.demo.entity.Asset;
import krystianciamaga.com.demo.service.AssetServiceImlp;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("assets")
public class AssetController {

    private final AssetServiceImlp assetServiceImlp;


    public AssetController(AssetServiceImlp assetServiceImlp) {
        this.assetServiceImlp = assetServiceImlp;
    }


    @GetMapping("{pageNumber}/{pageSize}")
    public List<Asset> getAllAssets(@PathVariable("pageNumber") final Integer pageNumber, @PathVariable("pageSize") final Integer pageSize){
        return assetServiceImlp.findAllAssets(pageNumber,pageSize);
    }

    @GetMapping("{id}")
    public Asset getAssetById(@PathVariable String id){
        return assetServiceImlp.findAssetById(id);
    }

    @DeleteMapping("{id}")
    public void deleteAssetById(@PathVariable String id){
        assetServiceImlp.deleteAsset(id);
    }


    @PostMapping
    public void addAsset(@RequestBody Asset assetDto){
        assetServiceImlp.addAsset(assetDto);
    }

    @PutMapping("{id}")
    public void updateAssetById(@RequestBody Asset assetDto,@PathVariable String id){

        assetServiceImlp.updateAssetById(assetDto,id);

    }



}
*/
