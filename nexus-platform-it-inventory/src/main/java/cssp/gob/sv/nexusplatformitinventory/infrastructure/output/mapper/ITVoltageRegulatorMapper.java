package cssp.gob.sv.nexusplatformitinventory.infrastructure.output.mapper;

import cssp.gob.sv.nexusplatformitinventory.domain.model.ITVoltageRegulator;
import cssp.gob.sv.nexusplatformitinventory.infrastructure.output.entity.ITVoltageRegulatorEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ITVoltageRegulatorMapper {
    ITVoltageRegulatorEntity toEntity(ITVoltageRegulator itVoltageRegulator);
    ITVoltageRegulator toDomain(ITVoltageRegulatorEntity itVoltageRegulatorEntity);
}
