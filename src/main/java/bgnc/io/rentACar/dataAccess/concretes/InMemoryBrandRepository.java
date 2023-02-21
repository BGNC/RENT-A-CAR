package bgnc.io.rentACar.dataAccess.concretes;

import bgnc.io.rentACar.dataAccess.abstracts.BrandRepository;
import bgnc.io.rentACar.model.concretes.Brand;

import java.util.ArrayList;
import java.util.List;

public class InMemoryBrandRepository implements BrandRepository {

    List<Brand> brands;

    public InMemoryBrandRepository(){
        brands= new ArrayList<>();
        brands.add(new Brand(1,"Bmw"));
        brands.add(new Brand(2,"Mercedes"));
        brands.add(new Brand(3,"Ford"));
        brands.add(new Brand(4,"Renault"));
        brands.add(new Brand(5,"Ferrari"));
        brands.add(new Brand(6,"Bentley"));

    }


    @Override
    public List<Brand> getAll() {
        return brands;
    }
}
