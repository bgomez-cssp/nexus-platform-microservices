package cssp.gob.sv.nexusplatformitinventory.infrastructure.output.mapper;

import cssp.gob.sv.nexusplatformitinventory.domain.model.ITScanner;
import cssp.gob.sv.nexusplatformitinventory.infrastructure.output.entity.ITScannerEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ITScannerMapper {
    ITScannerEntity toEntity(ITScanner itScanner);
    ITScanner toDomain(ITScannerEntity itScannerEntity);
}
