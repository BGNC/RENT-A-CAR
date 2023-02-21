package bgnc.io.rentACar.dataAccess.abstracts;

import bgnc.io.rentACar.model.concretes.Brand;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/*
* Veritabanı yapacak işlerde repository veya DAO olarak adlandırılır.
* */
public interface BrandRepository{
    List<Brand> getAll();
}
