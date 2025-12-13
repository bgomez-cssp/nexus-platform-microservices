package cssp.gob.sv.nexusplatformitinventory.infrastructure.output.mapper;

import cssp.gob.sv.nexusplatformitinventory.domain.model.ITEquipmentNetworkDetail;
import cssp.gob.sv.nexusplatformitinventory.infrastructure.output.entity.ITEquipmentNetworkDetailEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ITEquipmentNetworkDetailMapper {
    ITEquipmentNetworkDetailEntity toEntity(ITEquipmentNetworkDetail itEquipmentNetworkDetail);
    ITEquipmentNetworkDetail toDomain(ITEquipmentNetworkDetailEntity itEquipmentNetworkDetailEntity);
}
