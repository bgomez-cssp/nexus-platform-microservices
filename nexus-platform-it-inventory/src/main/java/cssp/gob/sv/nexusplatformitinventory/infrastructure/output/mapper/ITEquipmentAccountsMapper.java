package cssp.gob.sv.nexusplatformitinventory.infrastructure.output.mapper;


import cssp.gob.sv.nexusplatformitinventory.domain.model.ITEquipmentAccounts;
import cssp.gob.sv.nexusplatformitinventory.infrastructure.output.entity.ITEquipmentAccountsEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ITEquipmentAccountsMapper {
    ITEquipmentAccountsEntity toEntity(ITEquipmentAccounts itEquipmentAccounts);
    ITEquipmentAccounts toDomain(ITEquipmentAccountsEntity itEquipmentAccountsEntity);
}
