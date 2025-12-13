package cssp.gob.sv.nexusplatformitinventory.infrastructure.output.mapper;

import cssp.gob.sv.nexusplatformitinventory.domain.model.ITWirelessRouter;
import cssp.gob.sv.nexusplatformitinventory.infrastructure.output.entity.ITWirelessRouterEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ITWirelessRouterMapper {
    ITWirelessRouterEntity toEntity(ITWirelessRouter itWirelessRouter);
    ITWirelessRouter toDomain(ITWirelessRouterEntity itWirelessRouterEntity);
}
