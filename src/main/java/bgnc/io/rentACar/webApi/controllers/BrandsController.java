package bgnc.io.rentACar.webApi.controllers;
import bgnc.io.rentACar.business.abstracts.BrandService;
import bgnc.io.rentACar.business.requests.CreateBrandRequest;
import bgnc.io.rentACar.business.requests.UpdateBrandRequest;
import bgnc.io.rentACar.business.responses.GetAllBrandsResponse;
import bgnc.io.rentACar.business.responses.GetByIdBrandResponse;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
@RequestMapping("/api/brands")
@AllArgsConstructor
public class BrandsController {

    private BrandService brandService;

    @GetMapping("")
    public List<GetAllBrandsResponse> getAll(){
        return brandService.getAll();
    }

    @GetMapping("/{id}")
    public GetByIdBrandResponse getById(@PathVariable int id){
        return this.brandService.getById(id);

    }

    @PutMapping("")
    public void update(@RequestBody UpdateBrandRequest updateBrandRequest){
         this.brandService.update(updateBrandRequest);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id){
        this.brandService.delete(id);

    }

    @PostMapping("")
    @ResponseStatus(code = HttpStatus.CREATED)
    public void add(@RequestBody() @Valid() CreateBrandRequest createBrandRequest){
        this.brandService.add(createBrandRequest);
    }


}
