package cssp.gob.sv.nexusplatformitinventory.infrastructure.output.mapper;

import cssp.gob.sv.nexusplatformitinventory.domain.model.ITMicrophone;
import cssp.gob.sv.nexusplatformitinventory.infrastructure.output.entity.ITMicrophoneEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ITMicrophoneMapper{
    ITMicrophoneEntity toEntity(ITMicrophone itMicrophone);
    ITMicrophone toDomain(ITMicrophoneEntity itMicrophoneEntity);
}
