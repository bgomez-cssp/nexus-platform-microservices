package cssp.gob.sv.nexusplatformitinventory.infrastructure.output.mapper;

import cssp.gob.sv.nexusplatformitinventory.domain.model.ITComputer;
import cssp.gob.sv.nexusplatformitinventory.infrastructure.output.entity.ITComputerEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ITComputerMapper {
    ITComputerEntity toEntity(ITComputer itComputer);
    ITComputer toDomain(ITComputerEntity itComputerEntity);
}
