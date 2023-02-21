package bgnc.io.rentACar.business.concretes;

import bgnc.io.rentACar.business.abstracts.BrandService;
import bgnc.io.rentACar.business.requests.CreateBrandRequest;
import bgnc.io.rentACar.business.responses.GetAllBrandsResponse;
import bgnc.io.rentACar.core.utilities.mappers.ModelMapperService;
import bgnc.io.rentACar.dataAccess.abstracts.BrandRepository;
import bgnc.io.rentACar.model.concretes.Brand;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class BrandManager implements BrandService {

    private BrandRepository brandRepository;
    private ModelMapperService modelMapperService;

    @Override
    public List<GetAllBrandsResponse> getAll() {

        List<Brand> brands = brandRepository.findAll();
        List<GetAllBrandsResponse> brandsResponses=brands.
                stream()
                .map(brand ->
                        this.modelMapperService.
                                forResponse().
                                map(brand,GetAllBrandsResponse.class)).toList();

        return  brandsResponses;
    }

    @Override
    public void add(CreateBrandRequest createBrandRequest) {
        Brand brand = this.modelMapperService.
                forRequest().
                map(createBrandRequest,Brand.class);
        this.brandRepository.save(brand);
    }
}
