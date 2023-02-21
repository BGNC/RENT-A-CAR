package bgnc.io.rentACar.dataAccess.abstracts;

import bgnc.io.rentACar.model.concretes.Brand;

import org.springframework.data.jpa.repository.JpaRepository;


/*
* Veritabanı yapacak işlerde repository veya DAO olarak adlandırılır.
* */


public interface BrandRepository extends JpaRepository<Brand,Integer> {

}
