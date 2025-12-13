package cssp.gob.sv.nexusplatformitinventory.infrastructure.output.mapper;

import cssp.gob.sv.nexusplatformitinventory.domain.model.ITMouse;
import cssp.gob.sv.nexusplatformitinventory.infrastructure.output.entity.ITMouseEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ITMouseMapper {
    ITMouseEntity toEntity(ITMouse itMouse);
    ITMouse toDomain(ITMouseEntity itMouseEntity);
}
