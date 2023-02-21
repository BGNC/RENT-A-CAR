package bgnc.io.rentACar.dataAccess.abstracts;

import bgnc.io.rentACar.model.concretes.Brand;

import org.springframework.stereotype.Repository;

import java.util.List;

/*
* Veritabanı yapacak işlerde repository veya DAO olarak adlandırılır.
* */


public interface BrandRepository{
    List<Brand> getAll();
}
