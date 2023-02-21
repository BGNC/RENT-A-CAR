package bgnc.io.rentACar.webApi.controllers;

import bgnc.io.rentACar.business.abstracts.BrandService;
import bgnc.io.rentACar.business.requests.CreateBrandRequest;
import bgnc.io.rentACar.business.responses.GetAllBrandsResponse;
import lombok.AllArgsConstructor;

import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 **/
@RestController
@RequestMapping("/api/brands")
@AllArgsConstructor
public class BrandsController {

    private BrandService brandService;

    @GetMapping("/getall")
    public List<GetAllBrandsResponse> getAll(){
        return brandService.getAll();
    }

    @PostMapping("/add")
    public void add(@RequestBody() CreateBrandRequest createBrandRequest){
        this.brandService.add(createBrandRequest);
    }
}
