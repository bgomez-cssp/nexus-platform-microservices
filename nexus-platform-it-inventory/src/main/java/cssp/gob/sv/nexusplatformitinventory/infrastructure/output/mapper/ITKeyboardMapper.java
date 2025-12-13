package cssp.gob.sv.nexusplatformitinventory.infrastructure.output.mapper;

import cssp.gob.sv.nexusplatformitinventory.domain.model.ITKeyboard;
import cssp.gob.sv.nexusplatformitinventory.infrastructure.output.entity.ITKeyboardEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ITKeyboardMapper  {
    ITKeyboardEntity toEntity(ITKeyboard itKeyboard);
    ITKeyboard toDomain(ITKeyboardEntity itKeyboardEntity);
}
