package cssp.gob.sv.nexusplatformitinventory.infrastructure.output.mapper;

import cssp.gob.sv.nexusplatformitinventory.domain.model.ITSignaturePad;
import cssp.gob.sv.nexusplatformitinventory.infrastructure.output.entity.ITSignaturePadEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ITSignaturePadMapper {
    ITSignaturePadEntity toEntity(ITSignaturePad itSignaturePad);
    ITSignaturePad toDomain(ITSignaturePadEntity itSignaturePadEntity);
}
