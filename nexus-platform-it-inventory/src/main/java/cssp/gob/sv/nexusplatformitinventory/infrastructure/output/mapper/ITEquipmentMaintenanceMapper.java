package cssp.gob.sv.nexusplatformitinventory.infrastructure.output.mapper;

import cssp.gob.sv.nexusplatformitinventory.domain.model.ITEquipmentMaintenance;
import cssp.gob.sv.nexusplatformitinventory.infrastructure.output.entity.ITEquipmentMaintenanceEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ITEquipmentMaintenanceMapper {
    ITEquipmentMaintenanceEntity toEntity(ITEquipmentMaintenance itEquipmentMaintenance);
    ITEquipmentMaintenance toDomain(ITEquipmentMaintenanceEntity itEquipmentMaintenanceEntity);
}
