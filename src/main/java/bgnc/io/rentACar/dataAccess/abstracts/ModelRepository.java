package bgnc.io.rentACar.dataAccess.abstracts;

import bgnc.io.rentACar.model.concretes.Model;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ModelRepository extends JpaRepository<Model,Integer> {

}
