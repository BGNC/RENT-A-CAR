package bgnc.io.rentACar.webApi.controllers;


import bgnc.io.rentACar.business.abstracts.ModelService;
import bgnc.io.rentACar.business.requests.CreateModelRequest;
import bgnc.io.rentACar.business.responses.GetAllModelsResponse;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.HttpStatus.CREATED;

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
    @ResponseStatus(code = CREATED)
    public void add(@RequestBody @Valid() CreateModelRequest createModelRequest){
        this.modelService.add(createModelRequest);
    }

}
