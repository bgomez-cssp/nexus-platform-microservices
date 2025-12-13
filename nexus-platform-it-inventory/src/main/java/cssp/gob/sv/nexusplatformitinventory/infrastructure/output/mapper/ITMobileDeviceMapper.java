package cssp.gob.sv.nexusplatformitinventory.infrastructure.output.mapper;

import cssp.gob.sv.nexusplatformitinventory.domain.model.ITMobileDevice;
import cssp.gob.sv.nexusplatformitinventory.infrastructure.output.entity.ITMobileDeviceEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ITMobileDeviceMapper {
    ITMobileDeviceEntity toEntity(ITMobileDevice itMobileDevice);
    ITMobileDevice toDomain(ITMobileDeviceEntity itMobileDeviceEntity);
}
