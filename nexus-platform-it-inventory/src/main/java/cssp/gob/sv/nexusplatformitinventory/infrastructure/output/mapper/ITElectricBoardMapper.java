package cssp.gob.sv.nexusplatformitinventory.infrastructure.output.mapper;

import cssp.gob.sv.nexusplatformitinventory.domain.model.ITElectricBoard;
import cssp.gob.sv.nexusplatformitinventory.infrastructure.output.entity.ITElectricBoardEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ITElectricBoardMapper {
    ITElectricBoardEntity toEntity(ITElectricBoard itElectricBoard);
    ITElectricBoard toDomain(ITElectricBoardEntity itElectricBoardEntity);
}
