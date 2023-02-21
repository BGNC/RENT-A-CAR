package bgnc.io.rentACar.business.abstracts;

import bgnc.io.rentACar.model.concretes.Brand;

import java.util.List;

public interface BrandService {

    List<Brand> getAll();

}
