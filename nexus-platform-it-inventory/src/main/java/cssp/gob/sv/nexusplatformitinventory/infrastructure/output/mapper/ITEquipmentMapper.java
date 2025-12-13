package cssp.gob.sv.nexusplatformitinventory.infrastructure.output.mapper;

import cssp.gob.sv.nexusplatformitinventory.domain.model.ITEquipment;
import cssp.gob.sv.nexusplatformitinventory.infrastructure.output.entity.ITEquipmentEntity;
import cssp.gob.sv.nexusplatformitinventory.infrastructure.output.repository.IGenericMapper;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ITEquipmentMapper extends IGenericMapper<ITEquipmentEntity,ITEquipment> {

    @Override
    ITEquipment toDomain(ITEquipmentEntity entity);

    @Override
    ITEquipmentEntity toEntity(ITEquipment dto);
}
