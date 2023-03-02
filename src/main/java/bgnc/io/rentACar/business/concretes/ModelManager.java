package bgnc.io.rentACar.business.concretes;

import bgnc.io.rentACar.business.abstracts.ModelService;
import bgnc.io.rentACar.business.requests.CreateModelRequest;
import bgnc.io.rentACar.business.responses.GetAllModelsResponse;
import bgnc.io.rentACar.core.utilities.mappers.ModelMapperService;
import bgnc.io.rentACar.dataAccess.abstracts.ModelRepository;
import bgnc.io.rentACar.model.concretes.Model;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ModelManager implements ModelService {

    private ModelRepository modelRepository;
    private ModelMapperService modelMapperService;

    @Override
    public List<GetAllModelsResponse> getAll() {
        List<Model> models = this.modelRepository.findAll();

        return models.
                stream().
                map(model ->
                this.modelMapperService.
                        forResponse().
                        map(model,GetAllModelsResponse.class)).
                toList();
    }

    @Override
    public void add(CreateModelRequest createModelRequest) {

    }


}
