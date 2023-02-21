package bgnc.io.rentACar.business.abstracts;

import bgnc.io.rentACar.business.requests.CreateBrandRequest;
import bgnc.io.rentACar.business.requests.UpdateBrandRequest;
import bgnc.io.rentACar.business.responses.GetAllBrandsResponse;
import bgnc.io.rentACar.business.responses.GetByIdBrandResponse;


import java.util.List;

public interface BrandService {

    List<GetAllBrandsResponse> getAll();

    void add(CreateBrandRequest createBrandRequest);

    void update(UpdateBrandRequest updateBrandRequest);

    void delete(int id);
    GetByIdBrandResponse getById(int id);
}
