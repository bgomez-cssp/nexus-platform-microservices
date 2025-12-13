package cssp.gob.sv.nexusplatformitinventory.infrastructure.output.mapper;

import cssp.gob.sv.nexusplatformitinventory.domain.model.ITSpeaker;
import cssp.gob.sv.nexusplatformitinventory.infrastructure.output.entity.ITSpeakerEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ITSpeakerMapper {
    ITSpeakerEntity toEntity(ITSpeaker itSpeaker);
    ITSpeaker toDomain(ITSpeakerEntity itSpeakerEntity);
}
