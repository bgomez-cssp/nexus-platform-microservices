package cssp.gob.sv.nexusplatformitinventory.infrastructure.output.mapper;

import cssp.gob.sv.nexusplatformitinventory.domain.model.ITSoftware;
import cssp.gob.sv.nexusplatformitinventory.infrastructure.output.entity.ITSoftwareEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ITSoftwareMapper {
    ITSoftwareEntity toEntity(ITSoftware itSoftware);
    ITSoftware toDomain(ITSoftwareEntity itSoftwareEntity);
}
