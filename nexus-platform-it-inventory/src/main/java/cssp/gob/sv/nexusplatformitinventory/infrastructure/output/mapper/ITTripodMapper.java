package cssp.gob.sv.nexusplatformitinventory.infrastructure.output.mapper;

import cssp.gob.sv.nexusplatformitinventory.domain.model.ITTripod;
import cssp.gob.sv.nexusplatformitinventory.infrastructure.output.entity.ITTripodEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ITTripodMapper{
    ITTripodEntity toEntity(ITTripod itTripod);
    ITTripod toDomain(ITTripodEntity itTripodEntity);
}
