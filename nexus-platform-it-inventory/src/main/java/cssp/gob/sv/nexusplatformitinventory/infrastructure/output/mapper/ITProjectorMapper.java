package cssp.gob.sv.nexusplatformitinventory.infrastructure.output.mapper;

import cssp.gob.sv.nexusplatformitinventory.domain.model.ITProjector;
import cssp.gob.sv.nexusplatformitinventory.infrastructure.output.entity.ITProjectorEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ITProjectorMapper {
    ITProjectorEntity toEntity(ITProjector itProjector);
    ITProjector toDomain(ITProjectorEntity itProjectorEntity);
}
