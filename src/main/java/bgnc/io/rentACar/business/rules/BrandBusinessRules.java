package bgnc.io.rentACar.business.rules;

import bgnc.io.rentACar.dataAccess.abstracts.BrandRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class BrandBusinessRules {

    private BrandRepository brandRepository;

    public void checkIfBrandNameExists(String name){


        if(this.brandRepository.existsByName(name)){


        }


    }
}
