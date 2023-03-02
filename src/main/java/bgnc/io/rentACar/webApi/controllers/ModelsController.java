package bgnc.io.rentACar.webApi.controllers;


import bgnc.io.rentACar.business.abstracts.ModelService;
import bgnc.io.rentACar.business.requests.CreateModelRequest;
import bgnc.io.rentACar.business.responses.GetAllModelsResponse;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/models")
@AllArgsConstructor
public class ModelsController {

    private ModelService modelService;


    @GetMapping("")
    public List<GetAllModelsResponse> getAll(){
        return this.modelService.getAll();
    }

    @PostMapping("")
    public void add(CreateModelRequest createModelRequest){
        this.modelService.add(createModelRequest);
    }

}
