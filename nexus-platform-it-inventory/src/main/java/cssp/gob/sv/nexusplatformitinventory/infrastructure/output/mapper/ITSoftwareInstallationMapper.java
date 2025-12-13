package cssp.gob.sv.nexusplatformitinventory.infrastructure.output.mapper;

import cssp.gob.sv.nexusplatformitinventory.domain.model.ITSoftwareInstallation;
import cssp.gob.sv.nexusplatformitinventory.infrastructure.output.entity.ITSoftwareInstallationEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface   ITSoftwareInstallationMapper {
    ITSoftwareInstallationEntity toEntity(ITSoftwareInstallation itSoftwareInstallation);
    ITSoftwareInstallation toDomain(ITSoftwareInstallationEntity itSoftwareInstallationEntity);
}
