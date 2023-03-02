package bgnc.io.rentACar.business.abstracts;

import bgnc.io.rentACar.business.requests.CreateModelRequest;
import bgnc.io.rentACar.business.responses.GetAllModelsResponse;

import java.util.List;

public interface ModelService {

    List<GetAllModelsResponse> getAll();
    void add(CreateModelRequest createModelRequest);



}
