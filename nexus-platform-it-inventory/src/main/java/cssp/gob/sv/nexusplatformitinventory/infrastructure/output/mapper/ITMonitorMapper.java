package cssp.gob.sv.nexusplatformitinventory.infrastructure.output.mapper;

import cssp.gob.sv.nexusplatformitinventory.domain.model.ITMonitor;
import cssp.gob.sv.nexusplatformitinventory.infrastructure.output.entity.ITMonitorEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ITMonitorMapper{
    ITMonitorEntity toEntity(ITMonitor itMonitor);
    ITMonitor toDomain(ITMonitorEntity itMonitorEntity);
}
