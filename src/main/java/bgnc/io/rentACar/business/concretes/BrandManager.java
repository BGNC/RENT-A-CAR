package bgnc.io.rentACar.business.concretes;

import bgnc.io.rentACar.business.abstracts.BrandService;
import bgnc.io.rentACar.dataAccess.abstracts.BrandRepository;
import bgnc.io.rentACar.model.concretes.Brand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BrandManager implements BrandService {

    private BrandRepository brandRepository;

    @Autowired
    public BrandManager(BrandRepository brandRepository) {
        this.brandRepository = brandRepository;
    }


    @Override
    public List<Brand> getAll() {
        return brandRepository.getAll();
    }
}
