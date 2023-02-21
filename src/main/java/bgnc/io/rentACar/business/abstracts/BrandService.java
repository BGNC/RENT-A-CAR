package bgnc.io.rentACar.business.abstracts;

import bgnc.io.rentACar.business.requests.CreateBrandRequest;
import bgnc.io.rentACar.business.responses.GetAllBrandsResponse;


import java.util.List;

public interface BrandService {

    List<GetAllBrandsResponse> getAll();

    void add(CreateBrandRequest createBrandRequest);

}
