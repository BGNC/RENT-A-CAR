package bgnc.io.rentACar.core.utilities.mappers;

import org.modelmapper.ModelMapper;

import java.io.Serializable;

public interface ModelMapperService extends Serializable {

    ModelMapper forResponse();
    ModelMapper forRequest();

}
