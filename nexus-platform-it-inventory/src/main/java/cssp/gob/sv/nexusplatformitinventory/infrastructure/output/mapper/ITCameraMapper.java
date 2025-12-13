package cssp.gob.sv.nexusplatformitinventory.infrastructure.output.mapper;

import cssp.gob.sv.nexusplatformitinventory.domain.model.ITCamera;
import cssp.gob.sv.nexusplatformitinventory.infrastructure.output.entity.ITCameraEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ITCameraMapper{
    ITCameraEntity toEntity(ITCamera itCamera);
    ITCamera toDomain(ITCameraEntity itCameraEntity);
}
