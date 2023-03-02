package bgnc.io.rentACar.dataAccess.abstracts;

import bgnc.io.rentACar.model.concretes.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarRepository extends JpaRepository<Car,Integer> {
}
