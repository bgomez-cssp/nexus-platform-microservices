package cssp.gob.sv.nexusplatformitinventory.infrastructure.output.mapper;

import cssp.gob.sv.nexusplatformitinventory.domain.model.ITUps;
import cssp.gob.sv.nexusplatformitinventory.infrastructure.output.entity.ITUpsEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ITUpsMapper{
    ITUpsEntity toEntity(ITUps itUps);
    ITUps toDomain(ITUpsEntity itUpsEntity);
}
