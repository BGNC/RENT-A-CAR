package bgnc.io.rentACar.business.concretes;
import bgnc.io.rentACar.business.abstracts.BrandService;
import bgnc.io.rentACar.business.requests.CreateBrandRequest;
import bgnc.io.rentACar.business.requests.UpdateBrandRequest;
import bgnc.io.rentACar.business.responses.GetAllBrandsResponse;
import bgnc.io.rentACar.business.responses.GetByIdBrandResponse;
import bgnc.io.rentACar.business.rules.BrandBusinessRules;
import bgnc.io.rentACar.core.utilities.mappers.ModelMapperService;
import bgnc.io.rentACar.dataAccess.abstracts.BrandRepository;
import bgnc.io.rentACar.model.concretes.Brand;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;


@Service
@AllArgsConstructor
public class BrandManager implements BrandService {

    private BrandRepository brandRepository;
    private ModelMapperService modelMapperService;
    private BrandBusinessRules brandBusinessRules;

    @Override
    public List<GetAllBrandsResponse> getAll() {

        List<Brand> brands = brandRepository.findAll();


        return brands.
                stream()
                .map(brand ->
                        this.modelMapperService.
                                forResponse().
                                map(brand,GetAllBrandsResponse.class)).toList();
    }

    @Override
    public void add(CreateBrandRequest createBrandRequest) {

        this.brandBusinessRules.checkIfBrandNameExists(createBrandRequest.getName());

        Brand brand = this.modelMapperService.
                forRequest().
                map(createBrandRequest,Brand.class);
        this.brandRepository.save(brand);
    }

    @Override
    public void update(UpdateBrandRequest updateBrandRequest) {

        Brand brand = this.modelMapperService.forRequest().map(updateBrandRequest,Brand.class);
        this.brandRepository.save(brand);
    }

    @Override
    public void delete(int id) {

        this.brandRepository.deleteById(id);
    }

    @Override
    public GetByIdBrandResponse getById(int id) {
        Brand brand = this.brandRepository.findById(id).orElseThrow();
        return this.modelMapperService.forResponse().map(brand,GetByIdBrandResponse.class);

    }
}
