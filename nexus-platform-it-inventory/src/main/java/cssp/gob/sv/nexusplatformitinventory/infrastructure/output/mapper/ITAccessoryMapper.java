package cssp.gob.sv.nexusplatformitinventory.infrastructure.output.mapper;

import cssp.gob.sv.nexusplatformitinventory.domain.model.ITAccessory;
import cssp.gob.sv.nexusplatformitinventory.infrastructure.output.entity.ITAccessoryEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ITAccessoryMapper {
    ITAccessoryEntity toEntity(ITAccessory itAccessory);
    ITAccessory toDomain(ITAccessoryEntity itAccessoryEntity);
}
