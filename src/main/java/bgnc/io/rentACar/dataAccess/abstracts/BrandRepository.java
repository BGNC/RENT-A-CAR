package bgnc.io.rentACar.dataAccess.abstracts;

import bgnc.io.rentACar.model.concretes.Brand;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface BrandRepository extends JpaRepository<Brand,Integer> {

}
