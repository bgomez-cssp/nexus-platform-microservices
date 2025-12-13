package cssp.gob.sv.nexusplatformitinventory.infrastructure.output.mapper;

import cssp.gob.sv.nexusplatformitinventory.domain.model.ITServer;
import cssp.gob.sv.nexusplatformitinventory.infrastructure.output.entity.ITServerEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ITServerMapper {
    ITServerEntity toEntity(ITServer itServer);
    ITServer toDomain(ITServerEntity itServerEntity);
}
